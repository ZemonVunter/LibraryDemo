$(function () {
    $.ajax({
        type: 'GET',                //ajax请求方式: GET/POST, 默认:GET
        url: 'test/zhengfan1', // ajax请求的url
        dataType: 'json',        // 发送的数据格式，常用json格式
        timeout: 3000,           //超时（单位：毫秒）。
        cache: true,            // 是否缓存上一次的数据，默认:true
        async: false,
        // 同步和异步，true是异步请求
        success: function (data) { // 请求成功后的回调函数
            var tr1 = '<table border="1px solid #ccc" cellspacing="0" >';
            var tr2 = "<tr class='select'><td class='spec'>书名</td><td >作者</td><td >出板社</td><td >ISBN</td><td >简介</td><td >语言</td><td >价格</td><td >出版日期</td><td >种类</td><td >剩余数量</td></tr>";
            var tr3 = '<p hidden>null</p>';
            for (i = 0;
                 i <= 13;
                 i++
            ) {

                tr3 = tr3 + "<tr><td >" + data[i].name + "</td><td >" + data[i].author + "</td><td>" + data[i].publish + "</td><td >" + data[i].isbn + "</td><td >" + data[i].introduction + "</td><td >" + data[i].language + "</td><td >" + data[i].price + "</td><td >" + data[i].pubDate + "</td><td >" + data[i].className + "</td><td >" + data[i].number + "</td></tr>";
            }
            var tr4 = '</table>';
            $("#bookList").prepend(tr1 + tr2 + tr3 + tr4);
        },
        error: function (XMLHttpRequest, errMsg, errThrown) { //请求失败调用
        }
    });
})

$(function foo() {
    $("#btn1").bind('click', function () {
        if ($("#bookList").is(':hidden')) { //本来是显示的，所以就隐藏咯
            $("#bookList").show();
        } else {
            $("#bookList").hide();
        }
    })
})