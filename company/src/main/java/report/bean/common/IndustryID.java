package report.bean.common;

import java.util.concurrent.atomic.AtomicInteger;
import java.sql.SQLException;
import java.time.LocalDate;
import report.bean.daolmp.IndustryDaoImp;

public class IndustryID {
    private static AtomicInteger numberGenerator = new AtomicInteger(1);
    
    public static String generateNumber() {
        // 每次调用时递增编号
        int nextNumber = numberGenerator.getAndIncrement();
        // 使用String.format保证格式为四位数，不足部分用0填充
        return String.format("%04d", nextNumber);
    }

    public static String getID() throws SQLException {
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        String yearformat = Integer.toString(year);
        
        // 手动指定下一个可用的编号
        int nextNumber;
        IndustryDaoImp idi=new IndustryDaoImp();
        nextNumber = idi.getMaxNumberFromDatabase() + 1;
		String id = yearformat + String.format("%04d", nextNumber);  
        return id;
    }


}
