<%@ page language="java" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page contentType="text/html"%>
<%@ page import="report.bean.entity.*" %>
<%@ page import="report.bean.daolmp.*" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="company" %>
<jsp:useBean id="pb" class="report.bean.entity.PageBean" scope="session"/>

<html>
<head>
<meta charset="utf-8">
<title>分析指标维护</title>
<link href="${contextPath}styles/mid.css?v=<%=System.currentTimeMillis()%>"  rel="stylesheet" type="text/css">
</head>

<body>
	<div><company:head></company:head></div>
	<div class="mid_kong"></div>
		<form action="QueryIndicator" method="post">
	<table class="mid_table">
	<tr>
	<td style="width:140px;vertical-align:text-top;"><company:left02></company:left02></td>
	<td style="vertical-align:text-top;">
	<div class="mid_title">分析指标维护
	<a href="analysisStatisticsAdd.jsp" target="_blank"><input type="button" class="mid_an01a" value="增加分析指标"></a>
	</div>
	<div class="mid_kong"></div>

	<div class="mid_div">
		<div class="mid_div01">指标类别：</div>
		<div class="mid_div03">
		<select name="indicatorCategories" id="indicatorCategories" class="mid_box02">
			<option></option>
			<option value="资产负债指标">资产负债指标</option>
			<option value="营收利润指标">营收利润指标</option>
			<option value="现金流量指标">现金流量指标</option>
		</select>
		</div>
		<div class="mid_div01e">指标名称：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="indicatorName"></div>
		<div class="mid_div01e"><input type="submit" value="查询"></div>
	</div>

		<div class="mid_kong"></div>
<table class="mid_table">
	  <tbody>
	    <tr>
	      <th scope="col" class="mid_table_title" style="width:5%">序号</th>
	      <th scope="col" class="mid_table_title" style="width:10%">指标名称</th>
	      <th scope="col" class="mid_table_title" style="width:10%">参考优质边界</th>
	      <th scope="col" class="mid_table_title" style="width:60%;">指标说明</th>
	      <th scope="col" class="mid_table_title" style="width:10%">所属类别</th>
	      <th scope="col" class="mid_table_title" style="width:5%">操作</th>
        </tr>
       <c:forEach var="id" items="${idList}" begin="${pb.startRows-1}" end="${pb.endRows}" varStatus="status">
	    <tr>
	      <c:set var="indicatorID" value="${id.indicatorID}" />
	      <td class="mid_table_content">${status.index + 1}</td>
	      <td class="mid_table_content"><a href="IndicatorDetailForLook?indicatorID=${id.indicatorID}"  target="_blank">${id.indicatorName}</a></td>
	      <td class="mid_table_content">${id.scopeOperation}${id.highQualityBoundaries}</td>
	      <td  style="text-align: left;" class="mid_table_content">${id.indicatorDescription}</td>
	      <td class="mid_table_content">${id.indicatorCategories}</td>
	      <td class="mid_table_content" style="width:90px;">
			  <div class="mid_table_operate">  
			  
			  <a href="IndicatorDetailForEdit?indicatorID=${id.indicatorID}" target="_blank">修改</a>
			    |  
			  <a href="DelIndicator?indicatorID=${id.indicatorID}" >删除</a>
			  </div></td>
        </tr>
	 </c:forEach>
      </tbody>
</table>
<script type="text/javascript">
        window.onload = function() {
            var message = "${a}";
            if (message) {
                alert(message);
            }
        };
    </script>
</td>
	</tr>
	</table>
	<div><company:page></company:page></div>
	</form>
	<div class="mid_kong"></div>
<div><company:end></company:end></div>
</body>
</html>
