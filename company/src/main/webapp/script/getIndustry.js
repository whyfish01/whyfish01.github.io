
$(document).ready(function() {
    // 监听一级行业下拉框值改变事件
    $("#industry1").change(function() {
        getIndustry2ByInd1();
    });

    // 监听二级行业下拉框值改变事件
    $("#industry2").change(function() {
        getIndustry3ByInd2();
    });
});

function getIndustry2ByInd1() {
    var industry1 = document.getElementById("industry1").value;
    console.log(industry1);

    $.ajax({
        type: "GET",
        url: "InsertCompany?industry1=" + industry1,
        success: function(data) {

            // 使用 jQuery 解析返回的 HTML 数据
            var options = $(data).find('#industry2 option'); // 查找 id 为 industry2 的 select 元素下的所有 option 元素

            var values = [];
            options.each(function() {
                var value = $(this).val(); // 获取每个 option 元素的 value 属性值
                values.push(value); // 将 value 值添加到数组中
            });

            console.log('Option values:', values);
            
            if (Array.isArray(values)) {
                updateIndustry2(values);
            } else {
                console.error('values is not an array');
                console.log(values);
            }
        },
        error: function(xhr, status, error) {
            console.error('Ajax request failed:', error);
        }
    });
}

function getIndustry3ByInd2() {
    var industry2 = document.getElementById("industry2").value;
    console.log(industry2);
    $.ajax({
        type: "GET",
        url: "InsertCompany?industry2=" + industry2,
        success: function(data) {
        	
        	// 使用 jQuery 解析返回的 HTML 数据
            var options1 = $(data).find('select[name="industry3"] option'); // 查找 name 为 industry3 的 select 元素下的所有 option 元素
			var values1 = [];
			options1.each(function() {
  			  var value1 = $(this).val(); // 获取每个 option 元素的 value 属性值
 			   values1.push(value1); // 将 value 值添加到数组中
			});
			console.log('Option1 values1:', values1);
            
       	 if (Array.isArray(values1)) {
       		 updateIndustry3(values1);
            } else {
                console.error('values is not an array');
                console.log(values1);
            }
        },
        error: function(xhr, status, error) {
            console.error('Ajax request failed:', error);
        }
    });
}

function updateIndustry2(values) {
    var industry2 = document.getElementById("industry2");
    industry2.innerHTML = "";
    console.log(values);
    if (Array.isArray(values)) {
    	values.forEach(function(item) {
        	var option = document.createElement("option");
        	option.value=item;
        	option.text = item;
            industry2.add(option);
        });
    } else {
        console.error('Data is not an array');
        // 其他处理逻辑
    }
}

function updateIndustry3(values1) {
    var industry3 = document.getElementById("industry3");

    if (industry3) { // 检查是否成功获取到 industry3 元素
        industry3.innerHTML = "";
        console.log(values1);

        if (Array.isArray(values1)) {
            values1.forEach(function(item) {
                var option = document.createElement("option");
                option.value = item;
                option.text = item;
                industry3.add(option);
            });
        } else {
            console.error('Data is not an array');
            // 其他处理逻辑
        }
    } else {
        console.error('Industry3 element not found');
        // 可以添加其他处理逻辑，如重新获取元素或提示用户
    }
}
