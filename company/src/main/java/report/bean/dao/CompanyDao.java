package report.bean.dao;
import java.sql.SQLException;
import java.util.ArrayList;
import report.bean.entity.Company;

public interface CompanyDao {
	public boolean insertCompany(Company cp);
	public boolean updateCompany(Company cp);
	public boolean delCompany(String AShareCode);
	public ArrayList<Company> queryCompany(String AShareName, String AShareCode, String industry1, String region);
	public ArrayList<Company> queryCompany(String AShareCode);
	public Integer getCompanyCount(String AShareName, String AShareCode, String industry1, String region) throws SQLException;
}


