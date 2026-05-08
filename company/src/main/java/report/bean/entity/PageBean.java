package report.bean.entity;

public class PageBean {
	private Integer pageSize=20;						//每页显示的记录数
	private Integer totalPages=1;						//总页数
	private Integer totalCounts=0;						//全部记录
	private Integer pageIndex;							//页码
	private Integer startRows=1;						//起始行
	private Integer endRows;							//结束行

	
	//获得当前页
	public void setPageIndex(int page) {
		this.pageIndex=page;
	}
	
	public Integer getPageIndex() {
		return pageIndex;
	}
	
	//每页显示的记录数
	public Integer getPageSize() {
		return pageSize;
	}
	
	public void setPageSize(Integer pageSize) {
		this.pageSize=pageSize;
	}
	
	//获得全部记录数
	public Integer getTotalCounts() {
		return totalCounts;
	}
	
	public void setTotalCounts(Integer totalCounts) {
		this.totalCounts=totalCounts;
	}
	
	//获得总页数
	public Integer getTotalPages() {
        return totalPages;
    }
 
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }
 
  //获得结束行
    public void setStartRows(Integer startRows) {
        this.startRows =startRows;
    }
    
    public Integer getStartRows() {
        return startRows;
    }
    
    //获得结束行
    public void setEndRows(Integer endRows) {
        this.endRows =endRows;
    }
    
    public Integer getEndRows() {
        return endRows;
    }
    


}