<%@ tag pageEncoding="utf-8"%>
<%@ tag import="java.time.LocalDate" %>
<%@ tag import="java.time.LocalTime" %>
<%@ tag import="java.time.LocalDateTime" %>
<%@ tag import="java.time.format.DateTimeFormatter" %>
<%@ tag import="java.time.DayOfWeek" %>

<%	//java程序片：
	LocalDate date=LocalDate.now();
	LocalDateTime now = LocalDateTime.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	String ct = now.format(formatter);
	DayOfWeek week=date.getDayOfWeek();
	String weekCn=null;
	switch(week){
	case SUNDAY: weekCn="星期日";break;
	case MONDAY: weekCn="星期一";break;
	case TUESDAY: weekCn="星期二";break;
	case WEDNESDAY: weekCn="星期三";break;
	case THURSDAY: weekCn="星期四";break;
	case FRIDAY: weekCn="星期五";break;
	case SATURDAY: weekCn="星期六";break;
	}
%>

<html>
<head>
<meta charset="utf-8">
<title>head</title>
<link href="styles/head.css" rel="stylesheet" type="text/css">
</head>

<body>
	<div class="head1">
	<div class="head1_title">企业分析系统</div>
	<div class="head1_an"><a href="investmentAdmin.jsp"><img src="images/head-an04.jpg" width="140" height="40" alt=""/></a></div>
	<div class="head1_an1"><a href="financialReportAdd.jsp"><img src="images/head-an02.jpg" width="140" height="40" alt=""/></a></div>
	<div class="head1_an1"><a href="companyAdd.jsp"><img src="images/head-an01.jpg" width="140" height="40" alt=""/></a></div>
	<div class="head1_an1"><a href="industryQuery.jsp"><img src="images/head-an03.jpg" width="140" height="40" alt=""/></a></div>
	
	</div>
<div class="head2">
	<div class="head2_red">价值投资，化繁为简</div>
	<div class="head2_time">
	<%=ct %>，<%=weekCn %>
	</div>
	</div>
</body>
</html>
