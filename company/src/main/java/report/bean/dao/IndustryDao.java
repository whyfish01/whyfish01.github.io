package report.bean.dao;
import java.sql.SQLException;
import java.util.ArrayList;
import report.bean.entity.Industry;

public interface IndustryDao {
	public boolean insertIndustry(String industryID,String industry1,String industry2,String industry3,String createTime,String updateTime);
	public boolean delIndustry(String industryID);
	public ArrayList<Industry> getIndustry(String industry1,String industry2,String industry3);
	public ArrayList<Industry> getAllIndustry();
	//条件查询行数
	public Integer getIndustryCount(String industry1, String industry2, String industry3) throws SQLException;
	public int getMaxNumberFromDatabase() throws SQLException;
	public ArrayList<Industry> getIndustry1();
	public ArrayList<Industry> getIndustry2(String industry1);
	public ArrayList<Industry> getIndustry3(String industry2);
}
