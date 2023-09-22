import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CsvFileRead {

    public static void main(String[] args) {
        Path path = Paths.get("./StockMaster.csv");

        try {
            // CSVファイルの読み込み
            List<String> lines = Files.readAllLines(path, Charset.forName("Shift-JIS"));

            for (int i = 1; i < lines.size(); i++) {
                String[] data = lines.get(i).split("\t");
                System.out.println("a");
                System.out.println(data[i]);

                if (data.length > 3) {
                    // 読み込んだCSVファイルの内容を出力
                    System.out.print(data[0] + ",");
                    System.out.print(data[1] + ",");
                    System.out.print(data[2] + ",");
                    System.out.println(data[3]);
                }
            }
        } catch (IOException e) {
            System.out.println("ファイル読み込みに失敗");
        }
    }
}