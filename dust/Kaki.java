import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Kaki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("CSVファイルにデータを入力します。データを入力し、Enterキーを押してください。");
        System.out.println("入力が終了したら、空行を入力してください。");
        
        try {
            // CSVファイル名を指定
            String csvFileName = "output.csv";
            
            // BufferedWriterを作成してファイルに書き込みます
            BufferedWriter writer = new BufferedWriter(new FileWriter(csvFileName));
            
            String line;
            while (!(line = scanner.nextLine()).isEmpty()) {
                // データをCSVファイルに書き込む
                writer.write(line);
                writer.newLine(); // 改行を追加
            }
            
            writer.close(); // ファイルを閉じる
            
            System.out.println("データがCSVファイルに正常に書き込まれました: " + csvFileName);
        } catch (IOException e) {
            System.err.println("エラーが発生しました: " + e.getMessage());
        } finally {
            scanner.close(); // スキャナを閉じる
        }
    }
}
