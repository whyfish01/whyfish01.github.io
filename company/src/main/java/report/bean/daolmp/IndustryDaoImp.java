package report.bean.daolmp;
import java.sql.*;
import java.util.ArrayList;

import report.bean.entity.Industry;
import report.bean.util.DataBase;
import report.bean.dao.IndustryDao;

public class IndustryDaoImp extends DataBase implements IndustryDao {

	@Override
	public boolean insertIndustry(String industryID, String industry1, String industry2, String industry3, String createTime, String updateTime) {
	    String sql = "insert into industryinfo values('" + industryID + "','" + industry1 + "','" + industry2 + "','" + industry3 + "','" + createTime + "','" + updateTime + "')";

	    try {
	        this.executeDML(sql);
	        return true; // 插入成功，返回true
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return false; // 插入失败，返回false
	    }
	}

	@Override
	public boolean delIndustry(String industryID) {
		// TODO Auto-generated method stub
		String sql="delete from industryinfo where industryID='"+industryID+"'";
	    try {
	        this.executeDML(sql);
	        return true; // 删除成功，返回true
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return false; // 删除失败，返回false
	    }
	}


	@Override
	public ArrayList<Industry> getIndustry(String industry1, String industry2, String industry3) {
		// TODO Auto-generated method stub
		ArrayList<Industry> list=new ArrayList<Industry>();
		String sql1="select * from industryinfo where primaryIndustry like '%" +industry1+ "%' and secondaryIndustry like '%" +industry2+ "%' and thirdLevelIndustry like '%"+industry3+"%' order by industryID desc";
		ResultSet rs=this.getResult(sql1);
		//System.out.println("Executing SQL query: " + sql1);
		try {
			while(rs.next()) {
			Industry industry=new Industry();
			industry.setIndustryID(rs.getString("IndustryID"));
			industry.setIndustry1(rs.getString("primaryIndustry"));
			industry.setIndustry2(rs.getString("secondaryIndustry"));
			industry.setIndustry3(rs.getString("thirdLevelIndustry"));
			industry.setCreateTime(rs.getString("createDateTime"));
			industry.setUpdateTime(rs.getString("updateDateTime"));
			list.add(industry);
			
			}//System.out.println(list);
		}catch(SQLException e) {
				e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public ArrayList<Industry> getAllIndustry(){
		String sql="select * from industryinfo order by createDateTime desc";
		ArrayList<Industry> list=new ArrayList<Industry>();
		ResultSet rs=this.getResult(sql);
		try {
			if(rs!=null) {
				while(rs.next()) {
				Industry industry=new Industry();
				industry.setIndustryID(rs.getString("IndustryID"));
				industry.setIndustry1(rs.getString("primaryIndustry"));
				industry.setIndustry2(rs.getString("secondaryIndustry"));
				industry.setIndustry3(rs.getString("thirdLevelIndustry"));
				industry.setCreateTime(rs.getString("createDateTime"));
				industry.setUpdateTime(rs.getString("updateDateTime"));
				list.add(industry);
			}
			}
			else{
				System.out.print("ResultSet is null, no results returned.");
			}
			}catch(SQLException e) {
					e.printStackTrace();
			}
			return list;
		}
	
	public Integer getIndustryCount(String industry1, String industry2, String industry3) throws SQLException {
		int totalCounts=1;
		String sql1="select count(*) from industryinfo where primaryIndustry like '%" +industry1+ "%' and secondaryIndustry like '%" +industry2+ "%' and thirdLevelIndustry like '%"+industry3+"%'";
		ResultSet rs=this.getResult(sql1);
		if(rs.next()) {
			totalCounts=rs.getInt(1);
		}
		return totalCounts;
		
	}


	public int getMaxNumberFromDatabase() throws SQLException {
		int maxNumber = 0;
		String sql = "SELECT MAX(SUBSTRING(IndustryID, 5)) AS maxnumber FROM industryinfo WHERE SUBSTRING(IndustryID, 1, 4) = YEAR(CURDATE())";
		ResultSet rs=this.getResult(sql);
		if (rs.next()) {
            maxNumber = rs.getInt("maxnumber");
        }
		return maxNumber;
	}

	public ArrayList<Industry> getIndustry1(){
		ArrayList<Industry> list=new ArrayList<Industry>();
		String sql="select DISTINCT primaryIndustry from industryinfo";
		ResultSet rs=this.getResult(sql);
		try {
			while(rs.next()) {
				Industry industry=new Industry();
				industry.setIndustry1(rs.getString("primaryIndustry"));
				list.add(industry);
			}
	}catch(SQLException e) {
		e.printStackTrace();
	}
		return list;
	}
		
	public ArrayList<Industry> getIndustry2(String industry1) {
	    ArrayList<Industry> list = new ArrayList<Industry>();
	    String sql = "select DISTINCT secondaryIndustry from industryinfo where primaryIndustry='" + industry1 + "'";
	    ResultSet rs = this.getResult(sql);

	    try {
	        while (rs.next()) {
	            Industry industry = new Industry();
	            industry.setIndustry2(rs.getString("secondaryIndustry"));
	            list.add(industry);
	        }

	        System.out.println(list); // 打印二级行业列表

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return list;
	}
	
	public ArrayList<Industry> getIndustry3(String industry2) {
	    ArrayList<Industry> list = new ArrayList<Industry>();
	    String sql = "select DISTINCT thirdLevelIndustry from industryinfo where secondaryIndustry='" + industry2 + "'";
	    ResultSet rs = this.getResult(sql);

	    try {
	        while (rs.next()) {
	            Industry industry = new Industry();
	            industry.setIndustry3(rs.getString("thirdLevelIndustry"));
	            list.add(industry);
	        }

	        System.out.println(list); // 打印三级行业列表

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return list;
	}
}
