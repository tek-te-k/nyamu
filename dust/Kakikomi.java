import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Kakikomi{
	public static void main(String args[]){
    try{
    	File file = new File("./CsvGenerate.csv");

    	if (checkBeforeWritefile(file)){
        FileWriter csvWriter = new FileWriter(file, true);

        csvWriter.append("はい。元気です\r\n");
        csvWriter.append("ではまた\r\n");

        csvWriter.close();
    	}else{
        System.out.println("ファイルに書き込めません");
    	}
    }catch(IOException e){
    	System.out.println(e);
    }
}

private static boolean checkBeforeWritefile(File file){
    if (file.exists()){
    	if (file.isFile() && file.canWrite()){
        	return true;
    	}
    }

    return false;
	}
}