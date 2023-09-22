

public class aa {
	try {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		String s1 = "2017/03/1A";
		String s2 = dtf.format(LocalDate.parse(s1, dtf)); // ←LocalDate.parseでDateTimeParseExceptionがThrowされる
		System.out.println(s2);
	} catch (DateTimeParseException dtp) {
		dtp.printStackTrace();
	}
}
