<%@ page language="java" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page contentType="text/html"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="company" %>
<%@ page import="report.bean.entity.*" %>
<%@ page import="report.bean.daolmp.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="is" class="report.bean.entity.CashflowStatement" scope="request"/>
<jsp:useBean id="bs" class="report.bean.entity.BalanceSheet" scope="request"/>
<jsp:useBean id="rdi" class="report.bean.daolmp.ReportDaoImp" scope="request"/>
<html>
<head>
<meta charset="utf-8">
<title>财报数据采集</title>
<link href="${contextPath}styles/mid.css?v=<%=System.currentTimeMillis()%>" rel="stylesheet" type="text/css">
</head>
<%
ReportDaoImp ri=new ReportDaoImp();
ArrayList<BalanceSheet> riList =ri.frHead();
pageContext.setAttribute("riList", riList);
%>
<body>
	<div><company:head></company:head></div>
	<div class="mid_kong"></div>
	<table class="mid_table">
	<tr>
	<td style="width:140px;vertical-align:text-top;"><company:left02></company:left02></td>
	<td style="vertical-align:text-top;">
	<div class="mid_title">财报数据采集
		<input type="button" class="mid_an02" value="PDF导入">
		<a href="financialReportAdd3.jsp" target="_self"><input type="button" class="mid_an01a" value="现金流量表补充"></a>
		<a href="financialReportAdd2.jsp" target="_self"><input type="button" class="mid_an01" value="现金流量表"></a>
		<a href="financialReportAdd1.jsp" target="_self"><input type="button" class="mid_an01" value="利润表"></a>
		<a href="financialReportAdd.jsp" target="_self"><input type="button" class="mid_an01" value="资产负债表"></a>
	</div>
	<form action="InsertCashflowSupplement" method="post">
	<div class="mid_title1">基本信息</div>
	<c:forEach var="il" items="${riList}">
	<div class="mid_div">
		<div class="mid_div01a_red">A股代码：</div>
		<div class="mid_div03">${il.AShareCode}</div>
		<div class="mid_div01a">A股简称：</div>
		<div class="mid_div03">${il.AShareName}</div>
		<div class="mid_div01a_red">所属年份：</div>
		<div class="mid_div03">${il.financialReportingYear}</div>
		<input type="hidden" name="financialReportingNo" value="${il.financialReportingNo}">
	</div>
	</c:forEach>
	<div class="mid_title1">现金流量表补充（单位：元人民币）</div>

	<div class="mid_div">
		<div class="mid_div01f">加：资产减值准备：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="impairmentOfAssets"></div>
		<div class="mid_div01f">固定资产折旧、油气资产折耗、生产性生物资产折旧：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="depreciation"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01f">使用权资产折旧：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="depreciationOfRightOfUseAssets"></div>
		<div class="mid_div01f">无形资产摊销：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="amortizationOfIntangibleAssets"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01f">长期待摊费用摊销：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="amortizationOfLongTermDeferredExpenses"></div>
		<div class="mid_div01f">处置固定资产、无形资产和其他长期资产的损失（收益以“－”号填列）：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="lossOnDisposalOfAssets"></div>
	</div>
	
	<div class="mid_div">
		<div class="mid_div01f">固定资产报废损失（收益以“－”号填列）：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="lossesOnScrappingOfFixedAssets"></div>
		<div class="mid_div01f">公允价值变动损失（收益以“－”号填列）：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="lossFromChangesInFairValue"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01f">财务费用（收益以“－”号填列）：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="financialExpenses"></div>
		<div class="mid_div01f">投资损失（收益以“－”号填列）：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="investmentLosses"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01f">递延所得税资产减少（增加以“－”号填列）：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="decreaseInDeferredIncomeTaxAssets"></div>
		<div class="mid_div01f">递延所得税负债增加（减少以“－”号填列）：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="increaseInDeferredIncomeTaxLiabilities"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01f">存货的减少（增加以“－”号填列）：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="reductionOfInventory"></div>
		<div class="mid_div01f">经营性应收项目的减少（减少以“－”号填列）：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="reductionOfOperatingReceivables"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01f">经营性应付项目的增加（减少以“－”号填列）：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="increaseInOperationalPayables"></div>
		<div class="mid_div01f">债务转为资本：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="conversionOfDebtIntoCapital"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01f">一年内到期的可转换公司债券：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="convertibleCorporatebondsDueWithinOneYear"></div>
		<div class="mid_div01f">融资租入固定资产：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="fixedAssetsUnderFinancingLease"></div>
	</div>
	<div class="mid_div">
		
	</div>
	
	<div class="mid_div">
		<div class="mid_div06"><input type="submit" class="mid_an" value="保存"></div>	
	</div>
	<div class='message_font'>${a}</div>
	</form>
	</td>
	</tr>
	</table>
	<div class="mid_kong"></div>
<div><company:end></company:end></div>
</body>
</html>
