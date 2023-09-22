import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Addcsv {

    public static void main(String args[]) {
        //csvのファイル名
        String flname = "CsvGenerateTest.csv";
		String stock;
		stock = new java.util.Scanner(System.in).nextLine();
        //csvに書き込むサンプルデータ
        ArrayList<String> rowdata = new ArrayList<String>();
        rowdata.add(stock);
        rowdata.add("eee,fff,ggg,hhh");
        rowdata.add("iii,jjj,kkk,lll");
        //csv書き込みメソッドの実行
        convertToCSV(rowdata, flname);
    }
    public static void convertToCSV(ArrayList<String> rows, String filename) {

        try {
            //FileWriterインスタンスの生成
            FileWriter csvWriter = new FileWriter("./"+filename);
            //各行をループ
            for(int i=0; i<rows.size(); i++) {
                //バッファに追加（行の各項目をカンマ区切りで連結）
                csvWriter.append(String.join(",", rows.get(i)));
                System.out.println(String.join(",", rows.get(i)));
                //バッファに追加（改行）
                csvWriter.append("\n");
            }
            //ファイルへの書き込み
            csvWriter.flush();
            //ストリームを閉じる
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}