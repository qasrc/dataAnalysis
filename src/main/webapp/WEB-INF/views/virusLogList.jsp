<%--
  Created by IntelliJ IDEA.
  User: xgxx
  Date: 2021-9-9
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    pageContext.setAttribute("basePath", basePath);
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/layui/css/layui.css">
<html>
<head>
    <title>Title</title>
</head>
<body>
<table id="deviceList" lay-filter="test"></table>

<script src="${pageContext.request.contextPath}/layui/layui.js"></script>
<script type="text/javascript">

    layui.use('table', function(){
        var table = layui.table;
        //第一个实例
        table.render({
            elem: '#deviceList'
            ,height: 'full-20'
            ,url: '<%=basePath%>views/virusLogList' //数据接口
            ,page: true //开启分页
            ,cols: [[ //表头
                {field: 'id', title: 'ID', sort: true, fixed: 'left'}
                ,{field: 'terminal', title: '终端'}
                ,{field: 'domain', title: '域'}
                ,{field: 'loginName', title: '登录名'}
            ]]
        });
    });
</script>
</body>
</html>
