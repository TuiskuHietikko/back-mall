<%--
  Created by IntelliJ IDEA.
  User: liuxi
  Date: 2017/10/31
  Time: 22:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>mall管理平台</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery-1.11.3.js"></script>
    <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/static/js/bootstrap.js"></script>
    <script src="${pageContext.request.contextPath}/static/plugins/bootstrap-table/bootstrap-table.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/plugins/bootstrap-table/bootstrap-table.min.css" rel="stylesheet">

    <script src="${pageContext.request.contextPath}/static/plugins/bootstrap-table/bootstrap-table-zh-CN.min.js"></script>

    <style>

    </style>
</head>
<script type="text/javascript">
    $(function () {
        tableInit();
        //绑定查询按钮
        $("#queryBtn").bind("click", tableInit);
    })

    //表格初始化
    function tableInit() {
        $('#table').bootstrapTable('destroy');
        $('#table').bootstrapTable({
            url: '${pageContext.request.contextPath}/product/list/data',         //请求后台的URL（*）
            method: 'get',                      //请求方式（*）
            striped: true,                      //是否显示行间隔色
            cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
            pagination: true,                   //是否显示分页（*）
            sortable: false,                     //是否启用排序
            sortOrder: "asc",                   //排序方式
            queryParams: queryParams,           //传递参数（*）
            sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
            pageNumber:1,                       //初始化加载第一页，默认第一页
            pageSize: 2,                       //每页的记录行数（*）
            pageList: [2,10],             //可供选择的每页的行数（*）
            //search: true,                      //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
            strictSearch: true,
            showRefresh: true,                  //是否显示刷新按钮
            clickToSelect: true,                //是否启用点击选中行
            uniqueId: "name",                     //每一行的唯一标识，一般为主键列
            cardView: false,                    //是否显示详细视图
            detailView: false,
            singleSelect:true,
            columns: [{
                field: 'name',
                title: '名称'
            }, {
                field: 'sex',
                title: '性别'
            }]
        });
    }

    /**
     * 查询参数
     */
    function queryParams (params) {
        var temp = {   //这里的键的名字和控制器的变量名必须一致，这边改动，控制器也需要改成一样的
            limit: params.limit,   //页面大小
            pagination: params.offset, //页码
        };
        return temp;
    };

</script>

<body>
<div class="panel-body" style="padding-bottom:0px;">

        <table id="table"></table>
</div>
</body>

</html>
