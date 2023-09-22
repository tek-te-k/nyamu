import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Calendar;
import java.util.regex.Pattern;

public class Trade {
	private LocalDateTime TradingTime;
	private String Brand;
	private boolean BuySell;
	private long Quantity;
	private BigDecimal TradingUnitPrice;

	public LocalDateTime getTradingTime(){
		return this.TradingTime;
	}
	public String getBrand(){
		return this.Brand;
	}
	public boolean getBuySell(){
		return this.BuySell;
	}
	public long getQuantity(){
		return this.Quantity;
	}
	public BigDecimal getTradingUnitPrice(){
		return this.TradingUnitPrice;
	}

	public void setTradingTime(LocalDateTime TradingTime){
        this.TradingTime = TradingTime;
    }
    public void setBrand(String Brand){
        this.Brand = Brand;
    }
    public void setBuySell(boolean BuySell){
        this.BuySell = BuySell;
    }
    public void setQuantity(long Quantity){
        this.Quantity = Quantity;
    }
	public void setTradingUnitPrice(BigDecimal TradingUnitPrice){
        this.TradingUnitPrice = TradingUnitPrice;
    }

	public static void main(String args[]){
		System.out.println("取引日時を入力してください");
		System.out.print("取引日時（年）＞");
		int year = new java.util.Scanner(System.in).nextInt();
		System.out.print("取引日時（月）＞");
		int month = new java.util.Scanner(System.in).nextInt();
		System.out.print("取引日時（日）＞");
		int day = new java.util.Scanner(System.in).nextInt();
		System.out.print("取引日時（時）＞");
		int hour = new java.util.Scanner(System.in).nextInt();
		System.out.print("取引日時（分）＞");
		int minute = new java.util.Scanner(System.in).nextInt();

		DateCheck(year,month,day);
		TimeCheck(hour, minute);
		System.out.println("日付"+DateCheck(year, month, day));
		System.out.println("時間"+TimeCheck(hour,minute));

		boolean check = false;
		LocalDateTime TradingTime = LocalDateTime.of(year,month,day,hour, minute);
		LocalDateTime now = LocalDateTime.now();

		boolean b1 = now.isAfter(TradingTime);
		System.out.println("平日チェック"+b1);
		DayOfWeek tw = TradingTime.getDayOfWeek();
		while (b1 == false) {
			if (tw.equals("SUNDAY")||tw.equals("SATURDAY")) {
				System.out.println("取引日時は平日のみです");
			}else{
				System.out.println("正しい日時を入力してください");
			}
		}
		if (DateCheck(year, month, day) == true && TimeCheck(hour, minute) == true && b1 == true) {
			check = true;
		}
		

		

		


		// System.out.println("銘柄を入力してください");
		// System.out.println("売買区分を入力してください");
		// System.out.println("取引株数を入力してください");
		// System.out.println("取引単価を入力してください");

	}
	
	public static boolean DateCheck(int year,int month,int day){
		Integer yearInteger = Integer.valueOf(year);
		String strYear = yearInteger.toString();
		Integer monthInteger = Integer.valueOf(month);
		String strMonth = monthInteger.toString();
		Integer dayInteger = Integer.valueOf(day);
		String strDay = dayInteger.toString();
		StringBuffer buf = new StringBuffer();
		buf.append(strYear+"/");
		buf.append(strMonth+"/");
		buf.append(strDay);
		String date = buf.toString();
		boolean checkDate =false;

		if (date != null) {
        try {
            String Date = date.replace("-", "").replace("/", "");
            DateTimeFormatter.ofPattern("uuuuMMdd").withResolverStyle(ResolverStyle.STRICT).parse(Date, LocalDate::from);
            checkDate = true;
        } catch (Exception e) {
            checkDate = false;
        }
    }
    return checkDate;
	}

	public static boolean TimeCheck(int hour,int minute){
		
		Integer hourInteger = Integer.valueOf(hour);
		String strHour = hourInteger.toString();
		Integer minuteInteger = Integer.valueOf(minute);
		String strMinute = minuteInteger.toString();
		
		StringBuffer buf = new StringBuffer();
		buf.append(strHour+":");
		buf.append(strMinute);
		String time = buf.toString();
		System.out.println(time);
		boolean checkTime =false;
		
		if (time != null) {
			Pattern pattern = Pattern.compile("^([0-1][0-9]|[2][0-3]):[0-5][0-9]:[0-5][0-9]$");
			checkTime = pattern.matcher(time).matches();
		}
		return checkTime;
			
	}
	
	
}
