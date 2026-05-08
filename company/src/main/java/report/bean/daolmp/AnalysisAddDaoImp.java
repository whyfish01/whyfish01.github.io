package report.bean.daolmp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import report.bean.dao.AnalysisAddDao;
import report.bean.entity.ReportAnalysis;
import report.bean.util.DataBase;

public class AnalysisAddDaoImp extends DataBase implements AnalysisAddDao{


	@Override
	public boolean insertReportAnalysis(ReportAnalysis ra) {
		// TODO Auto-generated method stub
		String sql= "insert into reportanalysis values (?,?,?,?,?,?,?,?,?,?)";
		try (PreparedStatement statement = con.prepareStatement(sql)) {
			statement.setString(1, ra.getAnalysisId());
			statement.setString(2, ra.getAShareCode());
	        statement.setString(3, ra.getAShareName());
	        statement.setInt(4, ra.getReportYear());
	        statement.setString(5, ra.getIndicatorName());
	        statement.setString(6, ra.getIndicatorID());
	        statement.setString(7, ra.getStatisticsGrade());
	        statement.setString(8, ra.getAbnormalAnalysis());
	        statement.setString(9, ra.getCreateDateTime());
	        statement.setString(10, ra.getUpDateTime());
	        statement.executeUpdate();
	        return true; // 插入成功，返回true
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return false; // 插入失败，返回false
	    }
	}
	
	//修改指标分析信息
	public boolean updateReportAnalysis(ReportAnalysis ra){
		// TODO Auto-generated method stub
		String sql= "update reportanalysis set indicatorName=?,indicatorID=?,statisticsGrade=?,abnormalAnalysis=?,upDateTime=? where analysisId=?";
		try (PreparedStatement statement = con.prepareStatement(sql)) {
			
	        statement.setString(1, ra.getIndicatorName());
	        statement.setString(2, ra.getIndicatorID());
	        statement.setString(3, ra.getStatisticsGrade());
	        statement.setString(4, ra.getAbnormalAnalysis());
	        statement.setString(5, ra.getUpDateTime());
	        statement.setString(6, ra.getAnalysisId());
	        
	        statement.executeUpdate();
			return true; // 插入成功，返回true
		} catch (SQLException e) {
			e.printStackTrace();
			return false; // 插入失败，返回false
		}
	}
	
	@Override
	public ArrayList<ReportAnalysis> getReportAnalysis(String AShareCode, int reportYear) {
		// TODO Auto-generated method stub
		ArrayList <ReportAnalysis> list = new ArrayList <ReportAnalysis>();
		String sql="select * from reportanalysis where AShareCode= ? and reportYear=? ORDER BY statisticsGrade DESC";
			
			try(PreparedStatement statement = con.prepareStatement(sql)){
				 statement.setString(1, AShareCode);
				 statement.setInt(2, reportYear);
				 
				 try(ResultSet rs = statement.executeQuery()){
				 while (rs.next()) {
					 ReportAnalysis ra =new ReportAnalysis();
					 ra.setAnalysisId(rs.getString("analysisId"));
					 ra.setAShareCode(rs.getString("AShareCode"));
					 ra.setAShareName(rs.getString("AShareName"));
					 ra.setReportYear(rs.getInt("reportYear"));
					 ra.setIndicatorName(rs.getString("indicatorName"));
					 ra.setIndicatorID(rs.getString("indicatorID"));
					 ra.setStatisticsGrade(rs.getString("statisticsGrade"));
					 ra.setAbnormalAnalysis(rs.getString("abnormalAnalysis"));
					 ra.setCreateDateTime(rs.getString("createDateTime"));
					 ra.setUpDateTime(rs.getString("upDateTime"));
					 list.add(ra);
				 }
				 }
			}catch(SQLException e) {
				e.printStackTrace();
		}
		return list;
		}
	
	
	
	
	//获得单一指标分析信息
		public ArrayList<ReportAnalysis> getReportAnalysis(String analysisId){
			// TODO Auto-generated method stub
			ArrayList <ReportAnalysis> list = new ArrayList <ReportAnalysis>();
			String sql="select * from reportanalysis where analysisId= ?";
				
				try(PreparedStatement statement = con.prepareStatement(sql)){
					 statement.setString(1, analysisId);
					 
					 try(ResultSet rs = statement.executeQuery()){
					 while (rs.next()) {
						 ReportAnalysis ra =new ReportAnalysis();
						 ra.setAnalysisId(rs.getString("analysisId"));
						 ra.setAShareCode(rs.getString("AShareCode"));
						 ra.setAShareName(rs.getString("AShareName"));
						 ra.setReportYear(rs.getInt("reportYear"));
						 ra.setIndicatorName(rs.getString("indicatorName"));
						 ra.setIndicatorID(rs.getString("indicatorID"));
						 ra.setStatisticsGrade(rs.getString("statisticsGrade"));
						 ra.setAbnormalAnalysis(rs.getString("abnormalAnalysis"));
						 ra.setCreateDateTime(rs.getString("createDateTime"));
						 ra.setUpDateTime(rs.getString("upDateTime"));
						 list.add(ra);
					 }
					 }
				}catch(SQLException e) {
					e.printStackTrace();
			}
			return list;
		}
		
		//删除指标分析信息
		public boolean delReportAnalysisForOneId(String analysisId) {
			String sql="delete from reportanalysis where analysisId=?";
			try(PreparedStatement statement = con.prepareStatement(sql)) {
				statement.setNString(1, analysisId);
				statement.executeUpdate();
				return true; // 修改成功，返回true
		    } catch (SQLException e) {
		        e.printStackTrace();
		       
		        return false; // 修改失败，返回false
		    }
		}
		
		//获得企业指标分析信息：总资产情况
		public ArrayList<ReportAnalysis> getReportAnalysisForCompany01(String AShareCode) {
		    ArrayList<ReportAnalysis> list = new ArrayList<>();
		    String sql = "SELECT * FROM reportanalysis WHERE AShareCode = ? AND indicatorID IN (?, ?, ?) ORDER BY indicatorID DESC";

		    try (PreparedStatement statement = con.prepareStatement(sql)) {
		        statement.setString(1, AShareCode);
		        statement.setString(2, "ID001");
		        statement.setString(3, "ID003");
		        statement.setString(4, "ID004");

		        try (ResultSet rs = statement.executeQuery()) {
		            while (rs.next()) {
		                ReportAnalysis ra = new ReportAnalysis();
		                ra.setAnalysisId(rs.getString("analysisId"));
		                ra.setAShareCode(rs.getString("AShareCode"));
		                ra.setAShareName(rs.getString("AShareName"));
		                ra.setReportYear(rs.getInt("reportYear"));
		                ra.setIndicatorName(rs.getString("indicatorName"));
		                ra.setIndicatorID(rs.getString("indicatorID"));
		                ra.setStatisticsGrade(rs.getString("statisticsGrade"));
		                ra.setAbnormalAnalysis(rs.getString("abnormalAnalysis"));
		                ra.setCreateDateTime(rs.getString("createDateTime"));
		                ra.setUpDateTime(rs.getString("upDateTime"));
		                list.add(ra);
		            }
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		}
		
		//获得企业指标分析信息：资产负债率情况
		public ArrayList<ReportAnalysis> getReportAnalysisForCompany02(String AShareCode){
			ArrayList<ReportAnalysis> list = new ArrayList<>();
		    String sql = "SELECT * FROM reportanalysis WHERE AShareCode = ? AND indicatorID IN (?) ORDER BY indicatorID DESC";

		    try (PreparedStatement statement = con.prepareStatement(sql)) {
		        statement.setString(1, AShareCode);
		        statement.setString(2, "ID006");

		        try (ResultSet rs = statement.executeQuery()) {
		            while (rs.next()) {
		                ReportAnalysis ra = new ReportAnalysis();
		                ra.setAnalysisId(rs.getString("analysisId"));
		                ra.setAShareCode(rs.getString("AShareCode"));
		                ra.setAShareName(rs.getString("AShareName"));
		                ra.setReportYear(rs.getInt("reportYear"));
		                ra.setIndicatorName(rs.getString("indicatorName"));
		                ra.setIndicatorID(rs.getString("indicatorID"));
		                ra.setStatisticsGrade(rs.getString("statisticsGrade"));
		                ra.setAbnormalAnalysis(rs.getString("abnormalAnalysis"));
		                ra.setCreateDateTime(rs.getString("createDateTime"));
		                ra.setUpDateTime(rs.getString("upDateTime"));
		                list.add(ra);
		            }
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		}
		
		//获得企业指标分析信息：有息负债与货币资金
		public ArrayList<ReportAnalysis> getReportAnalysisForCompany03(String AShareCode){
			ArrayList<ReportAnalysis> list = new ArrayList<>();
		    String sql = "SELECT * FROM reportanalysis WHERE AShareCode = ? AND indicatorID IN (?) ORDER BY indicatorID DESC";

		    try (PreparedStatement statement = con.prepareStatement(sql)) {
		        statement.setString(1, AShareCode);
		        statement.setString(2, "ID014");

		        try (ResultSet rs = statement.executeQuery()) {
		            while (rs.next()) {
		                ReportAnalysis ra = new ReportAnalysis();
		                ra.setAnalysisId(rs.getString("analysisId"));
		                ra.setAShareCode(rs.getString("AShareCode"));
		                ra.setAShareName(rs.getString("AShareName"));
		                ra.setReportYear(rs.getInt("reportYear"));
		                ra.setIndicatorName(rs.getString("indicatorName"));
		                ra.setIndicatorID(rs.getString("indicatorID"));
		                ra.setStatisticsGrade(rs.getString("statisticsGrade"));
		                ra.setAbnormalAnalysis(rs.getString("abnormalAnalysis"));
		                ra.setCreateDateTime(rs.getString("createDateTime"));
		                ra.setUpDateTime(rs.getString("upDateTime"));
		                list.add(ra);
		            }
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		}
		
		//获得企业指标分析信息：准货币资金
		public ArrayList<ReportAnalysis> getReportAnalysisForCompany04(String AShareCode){
			ArrayList<ReportAnalysis> list = new ArrayList<>();
		    String sql = "SELECT * FROM reportanalysis WHERE AShareCode = ? AND indicatorID IN (?) ORDER BY indicatorID DESC";

		    try (PreparedStatement statement = con.prepareStatement(sql)) {
		        statement.setString(1, AShareCode);
		        statement.setString(2, "ID020");

		        try (ResultSet rs = statement.executeQuery()) {
		            while (rs.next()) {
		                ReportAnalysis ra = new ReportAnalysis();
		                ra.setAnalysisId(rs.getString("analysisId"));
		                ra.setAShareCode(rs.getString("AShareCode"));
		                ra.setAShareName(rs.getString("AShareName"));
		                ra.setReportYear(rs.getInt("reportYear"));
		                ra.setIndicatorName(rs.getString("indicatorName"));
		                ra.setIndicatorID(rs.getString("indicatorID"));
		                ra.setStatisticsGrade(rs.getString("statisticsGrade"));
		                ra.setAbnormalAnalysis(rs.getString("abnormalAnalysis"));
		                ra.setCreateDateTime(rs.getString("createDateTime"));
		                ra.setUpDateTime(rs.getString("upDateTime"));
		                list.add(ra);
		            }
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		}
		
		//获得企业指标分析信息：“应收预付”和“应付预收”
		public ArrayList<ReportAnalysis> getReportAnalysisForCompany05(String AShareCode){
			ArrayList<ReportAnalysis> list = new ArrayList<>();
		    String sql = "SELECT * FROM reportanalysis WHERE AShareCode = ? AND indicatorID IN (?) ORDER BY indicatorID DESC";

		    try (PreparedStatement statement = con.prepareStatement(sql)) {
		        statement.setString(1, AShareCode);
		        statement.setString(2, "ID032");

		        try (ResultSet rs = statement.executeQuery()) {
		            while (rs.next()) {
		                ReportAnalysis ra = new ReportAnalysis();
		                ra.setAnalysisId(rs.getString("analysisId"));
		                ra.setAShareCode(rs.getString("AShareCode"));
		                ra.setAShareName(rs.getString("AShareName"));
		                ra.setReportYear(rs.getInt("reportYear"));
		                ra.setIndicatorName(rs.getString("indicatorName"));
		                ra.setIndicatorID(rs.getString("indicatorID"));
		                ra.setStatisticsGrade(rs.getString("statisticsGrade"));
		                ra.setAbnormalAnalysis(rs.getString("abnormalAnalysis"));
		                ra.setCreateDateTime(rs.getString("createDateTime"));
		                ra.setUpDateTime(rs.getString("upDateTime"));
		                list.add(ra);
		            }
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		}
		
		//获得企业指标分析信息：固定资产情况
		public ArrayList<ReportAnalysis> getReportAnalysisForCompany06(String AShareCode){
			ArrayList<ReportAnalysis> list = new ArrayList<>();
		    String sql = "SELECT * FROM reportanalysis WHERE AShareCode = ? AND indicatorID IN (?) ORDER BY indicatorID DESC";

		    try (PreparedStatement statement = con.prepareStatement(sql)) {
		        statement.setString(1, AShareCode);
		        statement.setString(2, "ID036");

		        try (ResultSet rs = statement.executeQuery()) {
		            while (rs.next()) {
		                ReportAnalysis ra = new ReportAnalysis();
		                ra.setAnalysisId(rs.getString("analysisId"));
		                ra.setAShareCode(rs.getString("AShareCode"));
		                ra.setAShareName(rs.getString("AShareName"));
		                ra.setReportYear(rs.getInt("reportYear"));
		                ra.setIndicatorName(rs.getString("indicatorName"));
		                ra.setIndicatorID(rs.getString("indicatorID"));
		                ra.setStatisticsGrade(rs.getString("statisticsGrade"));
		                ra.setAbnormalAnalysis(rs.getString("abnormalAnalysis"));
		                ra.setCreateDateTime(rs.getString("createDateTime"));
		                ra.setUpDateTime(rs.getString("upDateTime"));
		                list.add(ra);
		            }
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		}
		
		//获得企业指标分析信息：投资类资产情况
		public ArrayList<ReportAnalysis> getReportAnalysisForCompany07(String AShareCode){
			ArrayList<ReportAnalysis> list = new ArrayList<>();
		    String sql = "SELECT * FROM reportanalysis WHERE AShareCode = ? AND indicatorID IN (?) ORDER BY indicatorID DESC";

		    try (PreparedStatement statement = con.prepareStatement(sql)) {
		        statement.setString(1, AShareCode);
		        statement.setString(2, "ID041");

		        try (ResultSet rs = statement.executeQuery()) {
		            while (rs.next()) {
		                ReportAnalysis ra = new ReportAnalysis();
		                ra.setAnalysisId(rs.getString("analysisId"));
		                ra.setAShareCode(rs.getString("AShareCode"));
		                ra.setAShareName(rs.getString("AShareName"));
		                ra.setReportYear(rs.getInt("reportYear"));
		                ra.setIndicatorName(rs.getString("indicatorName"));
		                ra.setIndicatorID(rs.getString("indicatorID"));
		                ra.setStatisticsGrade(rs.getString("statisticsGrade"));
		                ra.setAbnormalAnalysis(rs.getString("abnormalAnalysis"));
		                ra.setCreateDateTime(rs.getString("createDateTime"));
		                ra.setUpDateTime(rs.getString("upDateTime"));
		                list.add(ra);
		            }
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		}
		
		//获得企业指标分析信息：其他资产情况
		public ArrayList<ReportAnalysis> getReportAnalysisForCompany08(String AShareCode){
			ArrayList<ReportAnalysis> list = new ArrayList<>();
		    String sql = "SELECT * FROM reportanalysis WHERE AShareCode = ? AND indicatorID IN (?,?,?,?,?,?,?) ORDER BY indicatorID DESC";

		    try (PreparedStatement statement = con.prepareStatement(sql)) {
		        statement.setString(1, AShareCode);
		        statement.setString(2, "ID043");
		        statement.setString(3, "ID045");
		        statement.setString(4, "ID046");
		        statement.setString(5, "ID047");
		        statement.setString(6, "ID048");
		        statement.setString(7, "ID050");
		        statement.setString(8, "ID051");

		        try (ResultSet rs = statement.executeQuery()) {
		            while (rs.next()) {
		                ReportAnalysis ra = new ReportAnalysis();
		                ra.setAnalysisId(rs.getString("analysisId"));
		                ra.setAShareCode(rs.getString("AShareCode"));
		                ra.setAShareName(rs.getString("AShareName"));
		                ra.setReportYear(rs.getInt("reportYear"));
		                ra.setIndicatorName(rs.getString("indicatorName"));
		                ra.setIndicatorID(rs.getString("indicatorID"));
		                ra.setStatisticsGrade(rs.getString("statisticsGrade"));
		                ra.setAbnormalAnalysis(rs.getString("abnormalAnalysis"));
		                ra.setCreateDateTime(rs.getString("createDateTime"));
		                ra.setUpDateTime(rs.getString("upDateTime"));
		                list.add(ra);
		            }
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		}
		
		//获得企业指标分析信息：职工薪酬情况
		public ArrayList<ReportAnalysis> getReportAnalysisForCompany09(String AShareCode){
			ArrayList<ReportAnalysis> list = new ArrayList<>();
		    String sql = "SELECT * FROM reportanalysis WHERE AShareCode = ? AND indicatorID IN (?) ORDER BY indicatorID DESC";

		    try (PreparedStatement statement = con.prepareStatement(sql)) {
		        statement.setString(1, AShareCode);
		        statement.setString(2, "ID057");

		        try (ResultSet rs = statement.executeQuery()) {
		            while (rs.next()) {
		                ReportAnalysis ra = new ReportAnalysis();
		                ra.setAnalysisId(rs.getString("analysisId"));
		                ra.setAShareCode(rs.getString("AShareCode"));
		                ra.setAShareName(rs.getString("AShareName"));
		                ra.setReportYear(rs.getInt("reportYear"));
		                ra.setIndicatorName(rs.getString("indicatorName"));
		                ra.setIndicatorID(rs.getString("indicatorID"));
		                ra.setStatisticsGrade(rs.getString("statisticsGrade"));
		                ra.setAbnormalAnalysis(rs.getString("abnormalAnalysis"));
		                ra.setCreateDateTime(rs.getString("createDateTime"));
		                ra.setUpDateTime(rs.getString("upDateTime"));
		                list.add(ra);
		            }
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		}
		
		//获得企业指标分析信息：营业收入及增长情况
		public ArrayList<ReportAnalysis> getReportAnalysisForCompany10(String AShareCode){
			ArrayList<ReportAnalysis> list = new ArrayList<>();
		    String sql = "SELECT * FROM reportanalysis WHERE AShareCode = ? AND indicatorID IN (?,?,?) ORDER BY indicatorID DESC";

		    try (PreparedStatement statement = con.prepareStatement(sql)) {
		        statement.setString(1, AShareCode);
		        statement.setString(2, "ID060");
		        statement.setString(3, "ID061");
		        statement.setString(4, "ID063");

		        try (ResultSet rs = statement.executeQuery()) {
		            while (rs.next()) {
		                ReportAnalysis ra = new ReportAnalysis();
		                ra.setAnalysisId(rs.getString("analysisId"));
		                ra.setAShareCode(rs.getString("AShareCode"));
		                ra.setAShareName(rs.getString("AShareName"));
		                ra.setReportYear(rs.getInt("reportYear"));
		                ra.setIndicatorName(rs.getString("indicatorName"));
		                ra.setIndicatorID(rs.getString("indicatorID"));
		                ra.setStatisticsGrade(rs.getString("statisticsGrade"));
		                ra.setAbnormalAnalysis(rs.getString("abnormalAnalysis"));
		                ra.setCreateDateTime(rs.getString("createDateTime"));
		                ra.setUpDateTime(rs.getString("upDateTime"));
		                list.add(ra);
		            }
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		}
		
		//获得企业指标分析信息：毛利率情况
		public ArrayList<ReportAnalysis> getReportAnalysisForCompany11(String AShareCode){
			ArrayList<ReportAnalysis> list = new ArrayList<>();
		    String sql = "SELECT * FROM reportanalysis WHERE AShareCode = ? AND indicatorID IN (?) ORDER BY indicatorID DESC";

		    try (PreparedStatement statement = con.prepareStatement(sql)) {
		        statement.setString(1, AShareCode);
		        statement.setString(2, "ID065");

		        try (ResultSet rs = statement.executeQuery()) {
		            while (rs.next()) {
		                ReportAnalysis ra = new ReportAnalysis();
		                ra.setAnalysisId(rs.getString("analysisId"));
		                ra.setAShareCode(rs.getString("AShareCode"));
		                ra.setAShareName(rs.getString("AShareName"));
		                ra.setReportYear(rs.getInt("reportYear"));
		                ra.setIndicatorName(rs.getString("indicatorName"));
		                ra.setIndicatorID(rs.getString("indicatorID"));
		                ra.setStatisticsGrade(rs.getString("statisticsGrade"));
		                ra.setAbnormalAnalysis(rs.getString("abnormalAnalysis"));
		                ra.setCreateDateTime(rs.getString("createDateTime"));
		                ra.setUpDateTime(rs.getString("upDateTime"));
		                list.add(ra);
		            }
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		}
		
		//获得企业指标分析信息：费用率情况
		public ArrayList<ReportAnalysis> getReportAnalysisForCompany12(String AShareCode){
			ArrayList<ReportAnalysis> list = new ArrayList<>();
		    String sql = "SELECT * FROM reportanalysis WHERE AShareCode = ? AND indicatorID IN (?,?,?,?,?) ORDER BY indicatorID DESC";

		    try (PreparedStatement statement = con.prepareStatement(sql)) {
		        statement.setString(1, AShareCode);
		        statement.setString(2, "ID067");
		        statement.setString(3, "ID069");
		        statement.setString(4, "ID071");
		        statement.setString(5, "ID073");
		        statement.setString(6, "ID074");

		        try (ResultSet rs = statement.executeQuery()) {
		            while (rs.next()) {
		                ReportAnalysis ra = new ReportAnalysis();
		                ra.setAnalysisId(rs.getString("analysisId"));
		                ra.setAShareCode(rs.getString("AShareCode"));
		                ra.setAShareName(rs.getString("AShareName"));
		                ra.setReportYear(rs.getInt("reportYear"));
		                ra.setIndicatorName(rs.getString("indicatorName"));
		                ra.setIndicatorID(rs.getString("indicatorID"));
		                ra.setStatisticsGrade(rs.getString("statisticsGrade"));
		                ra.setAbnormalAnalysis(rs.getString("abnormalAnalysis"));
		                ra.setCreateDateTime(rs.getString("createDateTime"));
		                ra.setUpDateTime(rs.getString("upDateTime"));
		                list.add(ra);
		            }
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		}
		
		//获得企业指标分析信息：利润构成情况
		public ArrayList<ReportAnalysis> getReportAnalysisForCompany13(String AShareCode){
			ArrayList<ReportAnalysis> list = new ArrayList<>();
		    String sql = "SELECT * FROM reportanalysis WHERE AShareCode = ? AND indicatorID IN (?,?,?) ORDER BY indicatorID DESC";

		    try (PreparedStatement statement = con.prepareStatement(sql)) {
		        statement.setString(1, AShareCode);
		        statement.setString(2, "ID079");
		        statement.setString(3, "ID080");
		        statement.setString(4, "ID082");

		        try (ResultSet rs = statement.executeQuery()) {
		            while (rs.next()) {
		                ReportAnalysis ra = new ReportAnalysis();
		                ra.setAnalysisId(rs.getString("analysisId"));
		                ra.setAShareCode(rs.getString("AShareCode"));
		                ra.setAShareName(rs.getString("AShareName"));
		                ra.setReportYear(rs.getInt("reportYear"));
		                ra.setIndicatorName(rs.getString("indicatorName"));
		                ra.setIndicatorID(rs.getString("indicatorID"));
		                ra.setStatisticsGrade(rs.getString("statisticsGrade"));
		                ra.setAbnormalAnalysis(rs.getString("abnormalAnalysis"));
		                ra.setCreateDateTime(rs.getString("createDateTime"));
		                ra.setUpDateTime(rs.getString("upDateTime"));
		                list.add(ra);
		            }
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		}
		
		//获得企业指标分析信息：净利润情况
		public ArrayList<ReportAnalysis> getReportAnalysisForCompany14(String AShareCode){
			ArrayList<ReportAnalysis> list = new ArrayList<>();
		    String sql = "SELECT * FROM reportanalysis WHERE AShareCode = ? AND indicatorID IN (?,?,?) ORDER BY indicatorID DESC";

		    try (PreparedStatement statement = con.prepareStatement(sql)) {
		        statement.setString(1, AShareCode);
		        statement.setString(2, "ID084");
		        statement.setString(3, "ID085");
		        statement.setString(4, "ID087");

		        try (ResultSet rs = statement.executeQuery()) {
		            while (rs.next()) {
		                ReportAnalysis ra = new ReportAnalysis();
		                ra.setAnalysisId(rs.getString("analysisId"));
		                ra.setAShareCode(rs.getString("AShareCode"));
		                ra.setAShareName(rs.getString("AShareName"));
		                ra.setReportYear(rs.getInt("reportYear"));
		                ra.setIndicatorName(rs.getString("indicatorName"));
		                ra.setIndicatorID(rs.getString("indicatorID"));
		                ra.setStatisticsGrade(rs.getString("statisticsGrade"));
		                ra.setAbnormalAnalysis(rs.getString("abnormalAnalysis"));
		                ra.setCreateDateTime(rs.getString("createDateTime"));
		                ra.setUpDateTime(rs.getString("upDateTime"));
		                list.add(ra);
		            }
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		}
		
		//获得企业指标分析信息：归母净利润情况
		public ArrayList<ReportAnalysis> getReportAnalysisForCompany15(String AShareCode){
			ArrayList<ReportAnalysis> list = new ArrayList<>();
		    String sql = "SELECT * FROM reportanalysis WHERE AShareCode = ? AND indicatorID IN (?) ORDER BY indicatorID DESC";

		    try (PreparedStatement statement = con.prepareStatement(sql)) {
		        statement.setString(1, AShareCode);
		        statement.setString(2, "ID090");

		        try (ResultSet rs = statement.executeQuery()) {
		            while (rs.next()) {
		                ReportAnalysis ra = new ReportAnalysis();
		                ra.setAnalysisId(rs.getString("analysisId"));
		                ra.setAShareCode(rs.getString("AShareCode"));
		                ra.setAShareName(rs.getString("AShareName"));
		                ra.setReportYear(rs.getInt("reportYear"));
		                ra.setIndicatorName(rs.getString("indicatorName"));
		                ra.setIndicatorID(rs.getString("indicatorID"));
		                ra.setStatisticsGrade(rs.getString("statisticsGrade"));
		                ra.setAbnormalAnalysis(rs.getString("abnormalAnalysis"));
		                ra.setCreateDateTime(rs.getString("createDateTime"));
		                ra.setUpDateTime(rs.getString("upDateTime"));
		                list.add(ra);
		            }
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		}
		
		//获得企业指标分析信息：现金流量情况
		public ArrayList<ReportAnalysis> getReportAnalysisForCompany16(String AShareCode){
			ArrayList<ReportAnalysis> list = new ArrayList<>();
		    String sql = "SELECT * FROM reportanalysis WHERE AShareCode = ? AND indicatorID IN (?) ORDER BY indicatorID DESC";

		    try (PreparedStatement statement = con.prepareStatement(sql)) {
		        statement.setString(1, AShareCode);
		        statement.setString(2, "ID094");

		        try (ResultSet rs = statement.executeQuery()) {
		            while (rs.next()) {
		                ReportAnalysis ra = new ReportAnalysis();
		                ra.setAnalysisId(rs.getString("analysisId"));
		                ra.setAShareCode(rs.getString("AShareCode"));
		                ra.setAShareName(rs.getString("AShareName"));
		                ra.setReportYear(rs.getInt("reportYear"));
		                ra.setIndicatorName(rs.getString("indicatorName"));
		                ra.setIndicatorID(rs.getString("indicatorID"));
		                ra.setStatisticsGrade(rs.getString("statisticsGrade"));
		                ra.setAbnormalAnalysis(rs.getString("abnormalAnalysis"));
		                ra.setCreateDateTime(rs.getString("createDateTime"));
		                ra.setUpDateTime(rs.getString("upDateTime"));
		                list.add(ra);
		            }
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		}
		
		//获得企业指标分析信息：现金收支比较
		public ArrayList<ReportAnalysis> getReportAnalysisForCompany17(String AShareCode){
			ArrayList<ReportAnalysis> list = new ArrayList<>();
		    String sql = "SELECT * FROM reportanalysis WHERE AShareCode = ? AND indicatorID IN (?,?) ORDER BY indicatorID DESC";

		    try (PreparedStatement statement = con.prepareStatement(sql)) {
		        statement.setString(1, AShareCode);
		        statement.setString(2, "ID097");
		        statement.setString(3, "ID098");

		        try (ResultSet rs = statement.executeQuery()) {
		            while (rs.next()) {
		                ReportAnalysis ra = new ReportAnalysis();
		                ra.setAnalysisId(rs.getString("analysisId"));
		                ra.setAShareCode(rs.getString("AShareCode"));
		                ra.setAShareName(rs.getString("AShareName"));
		                ra.setReportYear(rs.getInt("reportYear"));
		                ra.setIndicatorName(rs.getString("indicatorName"));
		                ra.setIndicatorID(rs.getString("indicatorID"));
		                ra.setStatisticsGrade(rs.getString("statisticsGrade"));
		                ra.setAbnormalAnalysis(rs.getString("abnormalAnalysis"));
		                ra.setCreateDateTime(rs.getString("createDateTime"));
		                ra.setUpDateTime(rs.getString("upDateTime"));
		                list.add(ra);
		            }
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		}
		
		//获得企业指标分析信息：分红情况
		public ArrayList<ReportAnalysis> getReportAnalysisForCompany18(String AShareCode){
			ArrayList<ReportAnalysis> list = new ArrayList<>();
		    String sql = "SELECT * FROM reportanalysis WHERE AShareCode = ? AND indicatorID IN (?) ORDER BY indicatorID DESC";

		    try (PreparedStatement statement = con.prepareStatement(sql)) {
		        statement.setString(1, AShareCode);
		        statement.setString(2, "ID099");

		        try (ResultSet rs = statement.executeQuery()) {
		            while (rs.next()) {
		                ReportAnalysis ra = new ReportAnalysis();
		                ra.setAnalysisId(rs.getString("analysisId"));
		                ra.setAShareCode(rs.getString("AShareCode"));
		                ra.setAShareName(rs.getString("AShareName"));
		                ra.setReportYear(rs.getInt("reportYear"));
		                ra.setIndicatorName(rs.getString("indicatorName"));
		                ra.setIndicatorID(rs.getString("indicatorID"));
		                ra.setStatisticsGrade(rs.getString("statisticsGrade"));
		                ra.setAbnormalAnalysis(rs.getString("abnormalAnalysis"));
		                ra.setCreateDateTime(rs.getString("createDateTime"));
		                ra.setUpDateTime(rs.getString("upDateTime"));
		                list.add(ra);
		            }
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		}
		
		//获得企业指标分析信息：公司类型
		public ArrayList<ReportAnalysis> getReportAnalysisForCompany19(String AShareCode){
			ArrayList<ReportAnalysis> list = new ArrayList<>();
		    String sql = "SELECT * FROM reportanalysis WHERE AShareCode = ? AND indicatorID IN (?) ORDER BY indicatorID DESC";

		    try (PreparedStatement statement = con.prepareStatement(sql)) {
		        statement.setString(1, AShareCode);
		        statement.setString(2, "ID102");

		        try (ResultSet rs = statement.executeQuery()) {
		            while (rs.next()) {
		                ReportAnalysis ra = new ReportAnalysis();
		                ra.setAnalysisId(rs.getString("analysisId"));
		                ra.setAShareCode(rs.getString("AShareCode"));
		                ra.setAShareName(rs.getString("AShareName"));
		                ra.setReportYear(rs.getInt("reportYear"));
		                ra.setIndicatorName(rs.getString("indicatorName"));
		                ra.setIndicatorID(rs.getString("indicatorID"));
		                ra.setStatisticsGrade(rs.getString("statisticsGrade"));
		                ra.setAbnormalAnalysis(rs.getString("abnormalAnalysis"));
		                ra.setCreateDateTime(rs.getString("createDateTime"));
		                ra.setUpDateTime(rs.getString("upDateTime"));
		                list.add(ra);
		            }
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		}
		
		//获得企业指标分析信息：现金及等价物净增额
		public ArrayList<ReportAnalysis> getReportAnalysisForCompany20(String AShareCode){
			ArrayList<ReportAnalysis> list = new ArrayList<>();
		    String sql = "SELECT * FROM reportanalysis WHERE AShareCode = ? AND indicatorID IN (?,?) ORDER BY indicatorID DESC";

		    try (PreparedStatement statement = con.prepareStatement(sql)) {
		        statement.setString(1, AShareCode);
		        statement.setString(2, "ID103");
		        statement.setString(3, "ID105");

		        try (ResultSet rs = statement.executeQuery()) {
		            while (rs.next()) {
		                ReportAnalysis ra = new ReportAnalysis();
		                ra.setAnalysisId(rs.getString("analysisId"));
		                ra.setAShareCode(rs.getString("AShareCode"));
		                ra.setAShareName(rs.getString("AShareName"));
		                ra.setReportYear(rs.getInt("reportYear"));
		                ra.setIndicatorName(rs.getString("indicatorName"));
		                ra.setIndicatorID(rs.getString("indicatorID"));
		                ra.setStatisticsGrade(rs.getString("statisticsGrade"));
		                ra.setAbnormalAnalysis(rs.getString("abnormalAnalysis"));
		                ra.setCreateDateTime(rs.getString("createDateTime"));
		                ra.setUpDateTime(rs.getString("upDateTime"));
		                list.add(ra);
		            }
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		}
}
