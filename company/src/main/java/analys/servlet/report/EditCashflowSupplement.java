package analys.servlet.report;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import report.bean.entity.CashflowSupplement;
import report.bean.daolmp.ReportDaoImp;
import report.bean.common.CreateTime;

public class EditCashflowSupplement extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public void init(ServletConfig config) throws ServletException{
		super.init(config);									
		}
	
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	CashflowSupplement cfs=new CashflowSupplement();
    	request.setAttribute("cfs", cfs);
    	ReportDaoImp rdi=new ReportDaoImp();
    	
    	//获取JSP页面信息
    	String financialReportingNo=request.getParameter("financialReportingNo");
    	System.out.print(financialReportingNo);
    	
    	String impairmentOfAssets_str = request.getParameter("impairmentOfAssets");
    	double impairmentOfAssets;
    	if (impairmentOfAssets_str == null || impairmentOfAssets_str.isEmpty()) {
    		impairmentOfAssets = 0.00;
    	} else {
    		impairmentOfAssets = Double.parseDouble(impairmentOfAssets_str.replace(",", ""));
    	}
    	
    	String depreciation_str = request.getParameter("depreciation");
    	double depreciation;
    	if (depreciation_str == null || depreciation_str.isEmpty()) {
    		depreciation = 0.00;
    	} else {
    		depreciation = Double.parseDouble(depreciation_str.replace(",", ""));
    	}
    	
    	String depreciationOfRightOfUseAssets_str = request.getParameter("depreciationOfRightOfUseAssets");
    	double depreciationOfRightOfUseAssets;
    	if (depreciationOfRightOfUseAssets_str == null || depreciationOfRightOfUseAssets_str.isEmpty()) {
    		depreciationOfRightOfUseAssets = 0.00;
    	} else {
    		depreciationOfRightOfUseAssets = Double.parseDouble(depreciationOfRightOfUseAssets_str.replace(",", ""));
    	}
    	
    	String amortizationOfIntangibleAssets_str = request.getParameter("amortizationOfIntangibleAssets");
    	double amortizationOfIntangibleAssets;
    	if (amortizationOfIntangibleAssets_str == null || amortizationOfIntangibleAssets_str.isEmpty()) {
    		amortizationOfIntangibleAssets = 0.00;
    	} else {
    		amortizationOfIntangibleAssets = Double.parseDouble(amortizationOfIntangibleAssets_str.replace(",", ""));
    	}
    	
    	String amortizationOfLongTermDeferredExpenses_str = request.getParameter("amortizationOfLongTermDeferredExpenses");
    	double amortizationOfLongTermDeferredExpenses;
    	if (amortizationOfLongTermDeferredExpenses_str == null || amortizationOfLongTermDeferredExpenses_str.isEmpty()) {
    		amortizationOfLongTermDeferredExpenses = 0.00;
    	} else {
    		amortizationOfLongTermDeferredExpenses = Double.parseDouble(amortizationOfLongTermDeferredExpenses_str.replace(",", ""));
    	}
    	
    	String lossOnDisposalOfAssets_str = request.getParameter("lossOnDisposalOfAssets");
    	double lossOnDisposalOfAssets;
    	if (lossOnDisposalOfAssets_str == null || lossOnDisposalOfAssets_str.isEmpty()) {
    		lossOnDisposalOfAssets = 0.00;
    	} else {
    		lossOnDisposalOfAssets = Double.parseDouble(lossOnDisposalOfAssets_str.replace(",", ""));
    	}
    	
    	String lossesOnScrappingOfFixedAssets_str = request.getParameter("lossesOnScrappingOfFixedAssets");
    	double lossesOnScrappingOfFixedAssets;
    	if (lossesOnScrappingOfFixedAssets_str == null || lossesOnScrappingOfFixedAssets_str.isEmpty()) {
    		lossesOnScrappingOfFixedAssets = 0.00;
    	} else {
    		lossesOnScrappingOfFixedAssets = Double.parseDouble(lossesOnScrappingOfFixedAssets_str.replace(",", ""));
    	}
    	
    	String lossFromChangesInFairValue_str = request.getParameter("lossFromChangesInFairValue");
    	double lossFromChangesInFairValue;
    	if (lossFromChangesInFairValue_str == null || lossFromChangesInFairValue_str.isEmpty()) {
    		lossFromChangesInFairValue = 0.00;
    	} else {
    		lossFromChangesInFairValue = Double.parseDouble(lossFromChangesInFairValue_str.replace(",", ""));
    	}
    	
    	String financialExpenses_str = request.getParameter("financialExpenses");
    	double financialExpenses;
    	if (financialExpenses_str == null || financialExpenses_str.isEmpty()) {
    		financialExpenses = 0.00;
    	} else {
    		financialExpenses = Double.parseDouble(financialExpenses_str.replace(",", ""));
    	}
    	
    	String investmentLosses_str = request.getParameter("investmentLosses");
    	double investmentLosses;
    	if (investmentLosses_str == null || investmentLosses_str.isEmpty()) {
    		investmentLosses = 0.00;
    	} else {
    		investmentLosses = Double.parseDouble(investmentLosses_str.replace(",", ""));
    	}
    	
    	String decreaseInDeferredIncomeTaxAssets_str = request.getParameter("decreaseInDeferredIncomeTaxAssets");
    	double decreaseInDeferredIncomeTaxAssets;
    	if (decreaseInDeferredIncomeTaxAssets_str == null || decreaseInDeferredIncomeTaxAssets_str.isEmpty()) {
    		decreaseInDeferredIncomeTaxAssets = 0.00;
    	} else {
    		decreaseInDeferredIncomeTaxAssets = Double.parseDouble(decreaseInDeferredIncomeTaxAssets_str.replace(",", ""));
    	}
    	
    	String increaseInDeferredIncomeTaxLiabilities_str = request.getParameter("increaseInDeferredIncomeTaxLiabilities");
    	double increaseInDeferredIncomeTaxLiabilities;
    	if (increaseInDeferredIncomeTaxLiabilities_str == null || increaseInDeferredIncomeTaxLiabilities_str.isEmpty()) {
    		increaseInDeferredIncomeTaxLiabilities = 0.00;
    	} else {
    		increaseInDeferredIncomeTaxLiabilities = Double.parseDouble(increaseInDeferredIncomeTaxLiabilities_str.replace(",", ""));
    	}
    	
    	String reductionOfInventory_str = request.getParameter("reductionOfInventory");
    	double reductionOfInventory;
    	if (reductionOfInventory_str == null || reductionOfInventory_str.isEmpty()) {
    		reductionOfInventory = 0.00;
    	} else {
    		reductionOfInventory = Double.parseDouble(reductionOfInventory_str.replace(",", ""));
    	}
    	
    	String reductionOfOperatingReceivables_str = request.getParameter("reductionOfOperatingReceivables");
    	double reductionOfOperatingReceivables;
    	if (reductionOfOperatingReceivables_str == null || reductionOfOperatingReceivables_str.isEmpty()) {
    		reductionOfOperatingReceivables = 0.00;
    	} else {
    		reductionOfOperatingReceivables = Double.parseDouble(reductionOfOperatingReceivables_str.replace(",", ""));
    	}
    	
    	String increaseInOperationalPayables_str = request.getParameter("increaseInOperationalPayables");
    	double increaseInOperationalPayables;
    	if (increaseInOperationalPayables_str == null || increaseInOperationalPayables_str.isEmpty()) {
    		increaseInOperationalPayables = 0.00;
    	} else {
    		increaseInOperationalPayables = Double.parseDouble(increaseInOperationalPayables_str.replace(",", ""));
    	}
    	
    	String conversionOfDebtIntoCapital_str = request.getParameter("conversionOfDebtIntoCapital");
    	double conversionOfDebtIntoCapital;
    	if (conversionOfDebtIntoCapital_str == null || conversionOfDebtIntoCapital_str.isEmpty()) {
    		conversionOfDebtIntoCapital = 0.00;
    	} else {
    		conversionOfDebtIntoCapital = Double.parseDouble(conversionOfDebtIntoCapital_str.replace(",", ""));
    	}
    	
    	String convertibleCorporatebondsDueWithinOneYear_str = request.getParameter("convertibleCorporatebondsDueWithinOneYear");
    	double convertibleCorporatebondsDueWithinOneYear;
    	if (convertibleCorporatebondsDueWithinOneYear_str == null || convertibleCorporatebondsDueWithinOneYear_str.isEmpty()) {
    		convertibleCorporatebondsDueWithinOneYear = 0.00;
    	} else {
    		convertibleCorporatebondsDueWithinOneYear = Double.parseDouble(convertibleCorporatebondsDueWithinOneYear_str.replace(",", ""));
    	}
    	
    	String fixedAssetsUnderFinancingLease_str = request.getParameter("fixedAssetsUnderFinancingLease");
    	double fixedAssetsUnderFinancingLease;
    	if (fixedAssetsUnderFinancingLease_str == null || fixedAssetsUnderFinancingLease_str.isEmpty()) {
    		fixedAssetsUnderFinancingLease = 0.00;
    	} else {
    		fixedAssetsUnderFinancingLease = Double.parseDouble(fixedAssetsUnderFinancingLease_str.replace(",", ""));
    	}
    	
    	String createTime=CreateTime.createtime();
    	String updateTime=CreateTime.createtime();
    	
    	cfs.setFinancialReportingNo(financialReportingNo);
    	cfs.setImpairmentOfAssets(impairmentOfAssets);
    	cfs.setDepreciation(depreciation);
    	cfs.setDepreciationOfRightOfUseAssets(depreciationOfRightOfUseAssets);
    	cfs.setAmortizationOfIntangibleAssets(amortizationOfIntangibleAssets);
    	cfs.setAmortizationOfLongTermDeferredExpenses(amortizationOfLongTermDeferredExpenses);
    	cfs.setLossOnDisposalOfAssets(lossOnDisposalOfAssets);
    	cfs.setLossesOnScrappingOfFixedAssets(lossesOnScrappingOfFixedAssets);
    	cfs.setLossFromChangesInFairValue(lossFromChangesInFairValue);
    	cfs.setFinancialExpenses(financialExpenses);
    	cfs.setInvestmentLosses(investmentLosses);
    	cfs.setDecreaseInDeferredIncomeTaxAssets(decreaseInDeferredIncomeTaxAssets);
    	cfs.setIncreaseInDeferredIncomeTaxLiabilities(increaseInDeferredIncomeTaxLiabilities);
    	cfs.setReductionOfInventory(reductionOfInventory);
    	cfs.setReductionOfOperatingReceivables(reductionOfOperatingReceivables);
    	cfs.setIncreaseInOperationalPayables(increaseInOperationalPayables);
    	cfs.setConversionOfDebtIntoCapital(conversionOfDebtIntoCapital);
    	cfs.setConvertibleCorporatebondsDueWithinOneYear(convertibleCorporatebondsDueWithinOneYear);
    	cfs.setFixedAssetsUnderFinancingLease(fixedAssetsUnderFinancingLease);
    	cfs.setCreateDateTime(createTime);
    	cfs.setUpdateDateTime(updateTime);
    	
    	boolean updateResult=rdi.updateCashflowSupplement(cfs);
    	if(updateResult) {
            // 修改成功，设置成功消息
            request.setAttribute("a", "修改成功!");
        } else {
            // 修改失败，设置失败消息
            request.setAttribute("a", "修改失败!");
        }
    	RequestDispatcher dispatcher=request.getRequestDispatcher("financialReportEdit3.jsp");
    	dispatcher.forward(request, response);
    }
    
}
