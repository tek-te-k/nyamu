import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CsvRead2 {

    public static void print() {
        Path path = Paths.get("StockMaster2.csv");

        try {
            // CSVファイルの読み込み
            List<String> lines = Files.readAllLines(path, Charset.forName("Shift-JIS"));

            LineMark2();
            for (int i =0; i < lines.size(); i++) {
                String[] data = lines.get(i).split("\t");
                
                
                // 読み込んだCSVファイルの内容を出力
                
                System.out.printf("|%-6s|",data[0]);
                
                if (data[1].length() > 23) {
                    data[1] = data[1].substring(0, 23) + "... ";
                }
                //System.out.println("@@"+data[1].length()+"@@");
                System.out.printf("%-27s|",data[1]);
                
                System.out.printf("%-9s|",data[2]);
                System.out.printf("%-,13s|\n",data[3]);
                if (i==0) {
                    LineMark1();
                }
                
            }
            
            LineMark2();
        } catch (IOException e) {
            System.out.println("ファイル読み込みに失敗");
        }
    }
    private static void LineMark1(){
        System.out.print("|");
        for (int i = 0; i < 6; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 27; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 9; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 13; i++) {
            System.out.print("-");
        }
        System.out.println("|");
    }
    private static void LineMark2(){
        System.out.print("|");
        for (int i = 0; i < 58; i++) {
            System.out.print("=");
        }
        System.out.println("|");
    }
}