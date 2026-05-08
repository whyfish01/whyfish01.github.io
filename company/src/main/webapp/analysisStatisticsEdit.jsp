<%@ page language="java" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page contentType="text/html"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="company" %>
<%@ page import="report.bean.entity.*" %>
<%@ page import="report.bean.daolmp.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="utf-8">
<title>修改分析指标</title>
<link href="${contextPath}styles/mid.css?v=<%=System.currentTimeMillis()%>"  rel="stylesheet" type="text/css">
</head>
<script>
    document.getElementById('indicatorCategories').addEventListener('change', function() {
        var selectedValue = this.value;
        // 更新页面上显示的内容或执行其他操作
        console.log('Selected value: ' + selectedValue);
    });
</script>

<body>
	<div><company:head></company:head></div>
	<div class="mid_kong"></div>
	<table class="mid_table">
	<tr>
	<td style="width:140px;vertical-align:text-top;"><company:left02></company:left02></td>
	<td style="vertical-align:text-top;">
	<div class="mid_title">修改分析指标</div>
	<form action="EditIndicator" method="post">
<c:forEach var="idt" items="${idList}">
<div class="mid_kong"></div>
	<div class="mid_div">
		
		<div class="mid_analysis1">指标名称：</div>
		<div class="mid_analysis3"><input type="text" class="mid_box03" name="indicatorName" value="${idt.indicatorName}"></div>
		<div class="mid_analysis1">优质边界：</div>
		<div class="mid_analysis3">
		<select name="scopeOperation" id="scopeOperation" class="mid_page_box">
			<option value="大于" ${idt.scopeOperation =='大于'? 'selected' : ''}>大于</option>
			<option value="等于" ${idt.scopeOperation =='等于'? 'selected' : ''}>等于</option>
			<option value="小于" ${idt.scopeOperation =='小于'? 'selected' : ''}>小于</option>
		</select>  <input type="text" class="mid_box02" name="highQualityBoundaries"  value="${idt.highQualityBoundaries}">
		</div>
		<div class="mid_analysis1">指标类别：</div>
		<div class="mid_analysis3">
		<div class="mid_div03">
		<select name="indicatorCategories" id="indicatorCategories" class="mid_box02">
    		<option value="资产负债指标" ${idt.indicatorCategories == '资产负债指标' ? 'selected' : ''}>资产负债指标</option>
    		<option value="营收利润指标" ${idt.indicatorCategories == '营收利润指标' ? 'selected' : ''}>营收利润指标</option>
   			<option value="现金流量指标" ${idt.indicatorCategories == '现金流量指标' ? 'selected' : ''}>现金流量指标</option>
		</select>
		</div>
	</div>
	</div>
	<div class="mid_kong"></div>
	<div class="mid_analysis">
		<div class="mid_analysis1">指标说明：</div>
		<div class="mid_analysis2a">
		<textarea name="indicatorDescription" class="mid_box04" >${idt.indicatorDescription}</textarea>
		</div>
	</div>	

	<div class="mid_div">
	<input type="hidden" name="indicatorID" value="${idt.indicatorID}">
		<div class="mid_div06"><input type="submit" class="mid_an" value="保存" ></div>	
	</div>
	</c:forEach>
	</form>
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
	<div class="mid_kong"></div>
<div><company:end></company:end></div>
</body>
</html>
