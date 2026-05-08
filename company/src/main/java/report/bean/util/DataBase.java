package report.bean.util;
import java.sql.*;
import javax.sql.DataSource;	//连接池
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class DataBase {
	//数据库参数
	protected static Connection con=null;
	private static Statement sm=null;
	private ResultSet rs=null;
	
	
	static {
		try {
			Context context=new InitialContext();
    		Context contextNeeded=(Context)context.lookup("java:comp/env");
    		DataSource ds=(DataSource)contextNeeded.lookup("company");	//获得连接池
    		con=ds.getConnection();
    		sm=con.createStatement();
		}catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//建立查询类
	public ResultSet getResult(String sql) {
		try {
			rs=sm.executeQuery(sql);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	//建立变更类
	public void executeDML(String sql) throws SQLException{
		sm.executeUpdate(sql);
	}
	
	//关闭数据库
	public void closeDb() {
		try {
			if(rs!=null)
				rs.close();
			if(sm!=null)
				sm.close();
			if(con!=null)
				con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}


