<%@ page language="java" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page contentType="text/html"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="company" %>
<%@ page import="report.bean.entity.*" %>
<%@ page import="report.bean.daolmp.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>


<html>
<head>
<meta charset="utf-8">
<title>财报数据分析</title>
<link href="${contextPath}styles/mid.css?v=<%=System.currentTimeMillis()%>"  rel="stylesheet" type="text/css">
<link href="https://cdn.jsdelivr.net/npm/chosen-js@1.8.7/chosen.min.css" rel="stylesheet" />
</head>

<body>
	<div><company:head></company:head></div>
	<div class="mid_kong"></div>
	<table class="mid_table">
	<tr>
	<td style="width:140px;vertical-align:text-top;"><company:left02></company:left02></td>
	<td style="vertical-align:text-top;">
	<div class="mid_title">财报数据分析:</div>
	
	<form action="InsertReportAnalysis" method="post">
<div class="mid_kong"></div>
<div class="mid_title1">${ra.AShareName}   ${ra.reportYear}年财报分析</div>
<div class="mid_analysis">
	<div class="mid_analysis1">指标选择：</div>
	<div class="mid_analysis3b">
	<select id="indicatorName" name="indicatorName">
		<option></option>
		<option value="ID001总资产">总资产</option>
		<option value="ID003总资产增长率">总资产增长率</option>
		<option value="ID004权益乘数">权益乘数</option>
		<option value="ID006资产负债率">资产负债率</option>
		<option value="ID014净现金(货币资金-有息负债)">净现金(货币资金-有息负债)</option>
		<option value="ID020准货币资金占总资产比率">准货币资金占总资产比率</option>
		<option value="ID032应付预收-应收预付">应付预收-应收预付</option>
		<option value="ID036固产合计占总资产的比率">固产合计占总资产的比率</option>
		<option value="ID041投资类资产占总资产的比率">投资类资产占总资产的比率</option>
		<option value="ID043商誉占总资产的比率">商誉占总资产的比率</option>
		<option value="ID045无形资产占总资产的比率">无形资产占总资产的比率</option>
		<option value="ID046应收账款占总资产的比率">应收账款占总资产的比率</option>
		<option value="ID047预付款项占总资产的比率">预付款项占总资产的比率</option>
		<option value="ID048其他应收款占总资产的比率">其他应收款占总资产的比率</option>
		<option value="ID050存货占总资产的比率">存货占总资产的比率</option>
		<option value="ID051存货增长率">存货增长率</option>
		<option value="ID057人均年薪">人均年薪</option>
		<option value="ID060营业收入增长率">营业收入增长率</option>
		<option value="ID061总资产周转率">总资产周转率</option>
		<option value="ID063销售商品、提供劳务收到的现金营收占比">销售商品、提供劳务收到的现金营收占比</option>
		<option value="ID065毛利率">毛利率</option>
		<option value="ID067销售费用率">销售费用率</option>
		<option value="ID069管理费用率">管理费用率</option>
		<option value="ID071研发费用率">研发费用率</option>
		<option value="ID073费用率">费用率</option>
		<option value="ID074费用率占毛利率的比率">费用率占毛利率的比率</option>
		<option value="ID079主营利润率">主营利润率</option>
		<option value="ID080主营利润占利润总额比例">主营利润占利润总额比例</option>
		<option value="ID082主营利润占营业利润比例">主营利润占营业利润比例</option>
		<option value="ID084净利润增长率">净利润增长率</option>
		<option value="ID085净利润率">净利润率</option>
		<option value="ID087净利润现金比率">净利润现金比率</option>
		<option value="ID103经营活动产生的现金流量净额增长率">经营活动产生的现金流量净额增长率</option>
		<option value="ID090ROE">ROE</option>
		<option value="ID094现金流量净额">现金流量净额</option>
		<option value="ID097购建固产占经营活动产生的现金比">购建固产占经营活动产生的现金比</option>
		<option value="ID098处置固定无形和其他长期资产收回现金占购置比率">处置固定无形和其他长期资产收回现金占购置比率</option>
		<option value="ID099分红率">分红率</option>
		<option value="ID102公司类型">公司类型</option>
		<option value="ID105加现金分红的现金及现金等价物净增加额">加现金分红的现金及现金等价物净增加额</option>
	</select>
	</div>
	<div class="mid_analysis1">风险级别：</div>
	<div class="mid_analysis3">
		<select id="statisticsGrade" name="statisticsGrade" class="mid_box03">
			<option></option>
			<option value="优质指标">优质指标</option>
			<option value="非优质指标">非优质指标</option>
			<option value="风险指标">风险指标</option>
		</select>
	</div>
</div>
	
<div class="mid_analysis">
	<div class="mid_analysis1">指标分析：</div>
	<div class="mid_analysis3a">
		<textarea rows="15" cols="116" name="abnormalAnalysis" id="abnormalAnalysis"></textarea>
	</div>
</div>	

		<div class="mid_div">
		<div class="mid_div06">
		<input type="hidden" value="${ra.AShareCode}" name="AShareCode">
		<input type="hidden" value="${ra.AShareName}" name="AShareName">
		<input type="hidden" value="${ra.reportYear}" name="reportYear">
		<input type="submit" class="mid_an" value="保存">
		</div>	
		</div>
	</form>
	</td>
	</tr>
	</table>
	<script type="text/javascript">
        window.onload = function() {
            var message = "${a}";
            if (message) {
                alert(message);
            }
        };
    </script>
<script src="https://cdn.jsdelivr.net/npm/chosen-js@1.8.7/chosen.jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/chosen-js@1.8.7/chosen.jquery.min.js"></script>
<script>
    $(document).ready(function() {
        $('#indicatorName').chosen();
    });
</script>
<script type="text/javascript">
//获取TextArea元素
var textarea = document.getElementById('abnormalAnalysis');

// 监听TextArea的输入事件
textarea.addEventListener('input', function() {
    // 将TextArea中的换行符替换为<br>标签
    var text = textarea.value.replace(/\n/g, '<br>');

    // 更新TextArea中的内容
    textarea.value = text;
});
</script>
	<div class="mid_kong"></div>
<div><company:end></company:end></div>
</body>
</html>
