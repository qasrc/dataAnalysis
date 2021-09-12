<%--
  Created by IntelliJ IDEA.
  User: xgxx
  Date: 2021-9-8
  Time: 13:12
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="head.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="./layui/css/layui.css">
<html>
<head>
    <title>数据统计</title>
</head>
<body>
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo layui-hide-xs layui-bg-black">数据统计</div>
        <!-- 头部区域（可配合layui 已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <!-- 移动端显示 -->
            <li class="layui-nav-item layui-show-xs-inline-block layui-hide-sm" lay-header-event="menuLeft">
                <i class="layui-icon layui-icon-spread-left"></i>
            </li>
        </ul>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item layui-hide layui-show-md-inline-block">
                <a href="javascript:void(0);">
                    <img src="image/test.jpg" class="layui-nav-img">
                    tester
                </a>
<%--                <dl class="layui-nav-child">--%>
<%--                    <dd><a href="">Your Profile</a></dd>--%>
<%--                    <dd><a href="">Settings</a></dd>--%>
<%--                    <dd><a href="">Sign out</a></dd>--%>
<%--                </dl>--%>
            </li>
            <li class="layui-nav-item" lay-header-event="menuRight" lay-unselect>
                <a href="javascript:void(0);">
                    <i class="layui-icon layui-icon-more-vertical"></i>
                </a>
            </li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree" lay-filter="test">
                <li class="layui-nav-item layui-nav-itemed">
                    <a class="" href="javascript:void(0);">menu</a>
                    <dl class="layui-nav-child">
                        <dd><a href="<%=basePath%>views/deviceListPage" target="content">桌管设备</a></dd>
                        <dd><a href="<%=basePath%>views/vpnUserPage" target="content">VPN用户</a></dd>
                        <dd><a href="<%=basePath%>views/virusLogPage" target="content">查杀日志</a></dd>
                        <dd><a href="<%=basePath%>views/import" target="content">Excel导入</a></dd>
                        <dd><a href="<%=basePath%>views/import" target="content">统计分析</a></dd>
                    </dl>
                </li>
            </ul>
        </div>
    </div>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <iframe src="" frameborder="0" name="content" style="width: 100%; height: 100%; border-radius: 2px;"></iframe>
    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
        底部固定区域
    </div>
</div>
<script src="./layui/layui.js"></script>
<script type="text/javascript">
    //JS
    layui.use(['element', 'layer', 'util'], function(){
        var element = layui.element
            ,layer = layui.layer
            ,util = layui.util
            ,$ = layui.$;

        //头部事件
        util.event('lay-header-event', {
            //左侧菜单事件
            menuLeft: function(othis){
                layer.msg('展开左侧菜单的操作', {icon: 0});
            }
            ,menuRight: function(){
                layer.open({
                    type: 1
                    ,content: '<div style="padding: 15px;">处理右侧面板的操作</div>'
                    ,area: ['260px', '100%']
                    ,offset: 'rt' //右上角
                    ,anim: 5
                    ,shadeClose: true
                });
            }
        });

    });
</script>
</body>
</html>
