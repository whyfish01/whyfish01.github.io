<%@ tag pageEncoding="utf-8"%>
<jsp:useBean id="pb" class="report.bean.entity.PageBean" scope="session"/>

<!-- 翻页按钮 -->
<div class="mid_page">
共${pb.totalCounts}条记录，每页显示${pb.pageSize}条记录，当前在第${pb.pageIndex}页，共${pb.totalPages} 页
<button type="submit" name="prevPage" class="mid_page_box">上一页</button>
<button type="submit" name="nextPage" class="mid_page_box">下一页</button>
<br><br>
</div>