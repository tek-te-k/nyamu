import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvRead1 {
    public static void main(String[] args) {
        String csvFile = "Stockmaster.csv"; // ファイルパスを適切に設定してください

        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\t"); // タブで行を分割
                LineMark();
                // データを表示
                for (String item : data) {
                    System.out.print("| " + item + " ");
                }
                System.out.println("|");

                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        

    }
    private static void LineMark(){
            System.out.print("|");
            for (int i = 0; i < 40; i++) {
                System.out.print("=");
            }
            System.out.println("|");
        }
}
