<%--
  Created by IntelliJ IDEA.
  User: xgxx
  Date: 2021-9-8
  Time: 17:58
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
<div class="layui-row layui-col-space10" style="margin-top: 2%;margin-left: 5%">
    <div class="layui-col-md4">
        <button type="button" class="layui-btn" id="device">
            <i class="layui-icon">&#xe67c;</i>上传桌管设备
        </button>
    </div>
    <div class="layui-col-md4">
        <button type="button" class="layui-btn" id="vpnUser">
            <i class="layui-icon">&#xe67c;</i>上传VPN用户
        </button>
    </div>
    <div class="layui-col-md4">
        <button type="button" class="layui-btn" id="virusLog">
            <i class="layui-icon">&#xe67c;</i>上传病毒查杀日志
        </button>
    </div>
</div>


<script src="${pageContext.request.contextPath}/layui/layui.js"></script>
<script type="text/javascript">
    layui.use('upload', function(){
        var upload = layui.upload;
        //执行实例
        upload.render({
            elem: '#device' //绑定元素
            ,url: '<%=basePath%>upload/device' //上传接口
            ,accept: 'file'
            ,exts: 'xlsx'
            ,done: function(res){
                //上传完毕回调
                layer.msg(res.message);
            }
            ,error: function(){
                //请求异常回调
            }
        });

        upload.render({
            elem: '#vpnUser' //绑定元素
            ,url: '<%=basePath%>upload/vpnUser' //上传接口
            ,accept: 'file'
            ,exts: 'xlsx'
            ,done: function(res){
                //上传完毕回调
                layer.msg(res.message);
            }
            ,error: function(){
                //请求异常回调
            }
        });

        upload.render({
            elem: '#virusLog' //绑定元素
            ,url: '<%=basePath%>upload/virusLog' //上传接口
            ,accept: 'file'
            ,exts: 'xlsx'
            ,done: function(res){
                //上传完毕回调
                layer.msg(res.message);
            }
            ,error: function(){
                //请求异常回调
            }
        });
    });
</script>
</body>
</html>
