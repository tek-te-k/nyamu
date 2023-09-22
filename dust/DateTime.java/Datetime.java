
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datetime {
    public static void main(String[] args) throws Exception {
    	
    	String strDate = "2017/04/10 10:00:00";
    	
    	//DateTimeFormatterクラスのオブジェクトを生成する
    	DateTimeFormatter dtf = 
            
    	
    	//String型の日付からLocalDateTimeクラスのオブジェクトを生成する
    	LocalDateTime ld = LocalDateTime.parse(strDate, dtf);
    	
    	System.out.println(ld.format(dtf).toString());

    }
}

