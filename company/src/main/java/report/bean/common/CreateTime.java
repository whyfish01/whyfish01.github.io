package report.bean.common;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CreateTime {
	public static String createtime() {
	LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String ct = now.format(formatter);
    return ct;
	}
}
