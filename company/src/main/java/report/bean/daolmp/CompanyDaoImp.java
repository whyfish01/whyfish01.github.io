package report.bean.daolmp;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import report.bean.dao.CompanyDao;
import report.bean.entity.Company;
import report.bean.util.DataBase;


public class CompanyDaoImp extends DataBase implements CompanyDao{
	
	public boolean insertCompany(Company cp){
		String sql="insert  into companyinfo values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try(PreparedStatement statement = con.prepareStatement(sql)) {
			statement.setString(1, cp.getAShareCode());
			statement.setString(2, cp.getCompanyName());
			statement.setString(3, cp.getAShareName());
			statement.setString(4, cp.getCompanyAddress());
			statement.setString(5, cp.getRegion());
			statement.setString(6, cp.getEstablishedDate());
			statement.setString(7, cp.getListingType());
			statement.setString(8, cp.getListingDate());
			statement.setString(9, cp.getRegisteredCapital());
			statement.setString(10, cp.getPrimaryIndustry());
			statement.setString(11, cp.getSecondaryIndustry());
			statement.setString(12, cp.getThirdLevelIndustry());
			statement.setString(13, cp.getLegalRepresentative());
			statement.setString(14, cp.getBusinessScope());
			statement.setString(15, cp.getCreateDateTime());
			statement.setString(16, cp.getUpDateTime());
			statement.executeUpdate();
	        return true; // 插入成功，返回true
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return false; // 插入失败，返回false
	    }
	}

	public boolean updateCompany(Company cp)  {
		String sql="update companyinfo set AShareCode=?,companyName=?,AShareName=?,companyAddress=?,region=?,establishedDate=?,"
				+ "listingType=?,listingDate=?,registeredCapital=?,primaryIndustry=?,secondaryIndustry=?,thirdLevelIndustry=?,"
						+ "legalRepresentative=?,businessScope=?,createDateTime=?,updateDateTime=? where AShareCode='"+cp.getAShareCode()+ "'";
		try(PreparedStatement statement = con.prepareStatement(sql)) {
			statement.setString(1, cp.getAShareCode());
			statement.setString(2, cp.getCompanyName());
			statement.setString(3, cp.getAShareName());
			statement.setString(4, cp.getCompanyAddress());
			statement.setString(5, cp.getRegion());
			statement.setString(6, cp.getEstablishedDate());
			statement.setString(7, cp.getListingType());
			statement.setString(8, cp.getListingDate());
			statement.setString(9, cp.getRegisteredCapital());
			statement.setString(10, cp.getPrimaryIndustry());
			statement.setString(11, cp.getSecondaryIndustry());
			statement.setString(12, cp.getThirdLevelIndustry());
			statement.setString(13, cp.getLegalRepresentative());
			statement.setString(14, cp.getBusinessScope());
			statement.setString(15, cp.getCreateDateTime());
			statement.setString(16, cp.getUpDateTime());
			statement.executeUpdate();
	        return true; // 修改成功，返回true
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return false; // 修改失败，返回false
	    }
	}
	
	public boolean delCompany(String AShareCode) {
		String sql="delete from companyinfo where AshareCode='"+AShareCode+"'";
		try {
			this.executeDML(sql);
	        return true; // 修改成功，返回true
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return false; // 修改失败，返回false
	    }
	}
	
	public ArrayList<Company> queryCompany(String AShareName, String AShareCode, String industry1, String region){
		ArrayList<Company> list=new ArrayList<Company>();
		String sql="select * from companyinfo where AShareName like '%" +AShareName+ "%' and AShareCode like '%" +AShareCode+ "%' and primaryIndustry like '%" +industry1+ "%' and region like '%" +region+"%' ";
		ResultSet rs=this.getResult(sql);
		try {
			while(rs.next()) {
				Company cop=new Company();
				cop.setAShareCode(rs.getString("AShareCode"));
				cop.setCompanyName(rs.getString("companyName"));
				cop.setAShareName(rs.getString("AShareName"));
				cop.setCompanyAddress(rs.getString("companyAddress"));
				cop.setRegion(rs.getString("region"));
				cop.setEstablishedDate(rs.getString("establishedDate"));
				cop.setListingType(rs.getString("listingType"));
				cop.setListingDate(rs.getString("listingDate"));
				cop.setRegisteredCapital(rs.getString("registeredCapital"));
				cop.setPrimaryIndustry(rs.getString("primaryIndustry"));
				cop.setSecondaryIndustry(rs.getString("secondaryIndustry"));
				cop.setThirdLevelIndustry(rs.getString("thirdLevelIndustry"));
				cop.setLegalRepresentative(rs.getString("legalRepresentative"));
				cop.setBusinessScope(rs.getString("businessScope"));
				cop.setCreateDateTime(rs.getString("createDateTime"));
				cop.setUpDateTime("upDateTime");
				list.add(cop);
			}
		}catch(SQLException e) {
			e.printStackTrace();
	}
	return list;
	}
	
	public ArrayList<Company> queryCompany(String AShareCode){
		ArrayList<Company> list=new ArrayList<Company>();
		String sql="select * from companyinfo where AShareCode ='" +AShareCode+"'";
		ResultSet rs=this.getResult(sql);
		try {
			while(rs.next()) {
				Company cop=new Company();
				cop.setAShareCode(rs.getString("AShareCode"));
				cop.setCompanyName(rs.getString("companyName"));
				cop.setAShareName(rs.getString("AShareName"));
				cop.setCompanyAddress(rs.getString("companyAddress"));
				cop.setRegion(rs.getString("region"));
				cop.setEstablishedDate(rs.getString("establishedDate"));
				cop.setListingType(rs.getString("listingType"));
				cop.setListingDate(rs.getString("listingDate"));
				cop.setRegisteredCapital(rs.getString("registeredCapital"));
				cop.setPrimaryIndustry(rs.getString("primaryIndustry"));
				cop.setSecondaryIndustry(rs.getString("secondaryIndustry"));
				cop.setThirdLevelIndustry(rs.getString("thirdLevelIndustry"));
				cop.setLegalRepresentative(rs.getString("legalRepresentative"));
				cop.setBusinessScope(rs.getString("businessScope"));
				cop.setCreateDateTime(rs.getString("createDateTime"));
				cop.setUpDateTime("upDateTime");
				list.add(cop);
				System.out.print(cop.getAShareName());
			}
		}catch(SQLException e) {
			e.printStackTrace();
	}
		return list;
	}
	
	public Integer getCompanyCount(String AShareName, String AShareCode, String industry1, String region) throws SQLException{
		int totalCounts=1;
		String sql="select count(*) from companyinfo where AShareName like '%" +AShareName+ "%' and AShareCode like '%" +AShareCode+ "%' and primaryIndustry like '%" +industry1+ "%'  and region like '%" +region+"%'";
		ResultSet rs=this.getResult(sql);
		if(rs.next()) {
			totalCounts=rs.getInt(1);
		}
		return totalCounts;
		
	}
	
}
