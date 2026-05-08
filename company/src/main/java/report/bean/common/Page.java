package report.bean.common;

public class Page {

	//获取总页数
		public int getTotalPages(int totalCounts, int pageSize) {
			int totalPages;
			totalPages=totalCounts%pageSize==0?totalCounts / pageSize : totalCounts / pageSize + 1;
			return totalPages;
		}
		
		//获取起始行
		public int getStartRows(int pageIndex, int pageSize) {
			int startRows = (pageIndex - 1) * pageSize;
	    	if (startRows < 0) {
	    	    startRows = 0;
	    	}
	    	startRows++; // 将起始行加1，从第一条数据开始
	    	return startRows;
		}
		
		//获取结束行
		public int getEndRows(int pageIndex, int pageSize, int totalCounts ) {
			int endRows = pageIndex * pageSize;
	    	if (endRows > totalCounts) {
	    	    endRows = totalCounts;
	    	}
	    	return endRows;
		}
		
		//处理翻页操作
		public int getPageIndex(String prevPage, String nextPage, int pageIndex, int totalPages ) {
	    	//处理翻页操作
	        if(prevPage!=null){
	        	pageIndex--;
	        		if(pageIndex<1) {
	        			pageIndex=1;}
	    	}else if(nextPage!=null){
	        	pageIndex++;
	        	if (pageIndex>totalPages) {
	  	    	  pageIndex=totalPages;
	  	    	}
	    	}
	    	return pageIndex;
		}
}
