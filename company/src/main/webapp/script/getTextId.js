
// 在页面加载时检查本地存储并填充文本框
window.addEventListener('load', function() {
    var savedAShareCode = localStorage.getItem('savedAShareCode');
    var savedFinancialReportingYear = localStorage.getItem('savedFinancialReportingYear');

    if (savedAShareCode) {
        document.getElementById('AShareCode').value = savedAShareCode;
    }

    if (savedFinancialReportingYear) {
        document.getElementById('financialReportingYear').value = savedFinancialReportingYear;
    }
});

// 在表单提交前保存文本框数据到本地存储
document.getElementById('myForm').addEventListener('submit', function(event) {
    var inputAShareCode = document.getElementById('AShareCode').value;
    var inputFinancialReportingYear = document.getElementById('financialReportingYear').value;

    localStorage.setItem('savedAShareCode', inputAShareCode);
    localStorage.setItem('savedFinancialReportingYear', inputFinancialReportingYear);
});