import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Kazu {
	/**
 * 日付チェック
 * @param value 検証対象の値
 * @return 結果（true：日付、false：日付ではない）
 */
	public static void main(String[] args) {
		System.out.println("NULL：" + isDate(null));
		System.out.println("空文字：" + isDate(""));
		System.out.println("yyyy/MM/dd形式：" + isDate("2020/08/26"));
		System.out.println("yyyy-MM-dd形式：" + isDate("2020-08-26"));
		System.out.println("yyyyMMdd形式：" + isDate("20200826"));
		System.out.println("時刻あり：" + isDate("2020-08-26 22:00:00"));
		System.out.println("yyyy-M-d形式：" + isDate("2020-2-1"));
		System.out.println("うるう年：" + isDate("2020-02-29"));
		System.out.println("うるう年ではない：" + isDate("2021/02/29"));
		System.out.println("無効な日付："+ isDate("2020/13/01"));
		System.out.println("文字列：" + isDate("あいうえお"));
		System.out.println("数値：" + isDate("12345"));
	}


	public static boolean isDate(String value) {
		boolean result = false;
		
		if (value != null) {
			try {
				String checkDate = value.replace("-", "").replace("/", "");
				DateTimeFormatter.ofPattern("uuuuMMdd").withResolverStyle(ResolverStyle.STRICT).parse(checkDate, LocalDate::from);
				result = true;

			} catch (Exception e) {
				result = false;
			}
		}
		return result;
	}
}
