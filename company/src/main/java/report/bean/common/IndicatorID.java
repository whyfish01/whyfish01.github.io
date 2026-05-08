package report.bean.common;
import java.sql.SQLException;
import java.util.concurrent.atomic.AtomicInteger;

import report.bean.daolmp.IndexManageDaoImp;
public class IndicatorID {
private static AtomicInteger numberGenerator = new AtomicInteger(1);
    
    public static String generateNumber() {
        // 每次调用时递增编号
        int nextNumber = numberGenerator.getAndIncrement();
        // 使用String.format保证格式为四位数，不足部分用0填充
        return String.format("%03d", nextNumber);
    }
    public static String getIndicatorID() throws SQLException {
        
        String str = "ID";
        
        // 手动指定下一个可用的编号
        int nextNumber;
        IndexManageDaoImp imdi=new IndexManageDaoImp();
        nextNumber = imdi.getMaxNumberFromDatabase() + 1;
		String id = str + String.format("%03d", nextNumber);  
        return id;
    }
}
