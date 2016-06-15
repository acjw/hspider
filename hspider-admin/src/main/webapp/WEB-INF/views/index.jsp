<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <title>宏蛇管理系统 - 首页</title>
    <jsp:include page="global/global.jsp"/>
    <link rel="stylesheet" href="${basePath}/static/index.css">
</head>
<body ng-app="admin">
<div class="g-hd">
    honshe
</div>
<div class="g-sd">
    <div>
        <ul>
            <li>
                <a href="#/">概览</a>
                <a href="#/list">实例</a>
            </li>
        </ul>
    </div>
</div>
<div class="g-mn">
    <div ng-view class="row">
        <div class="col-sm-12 u-console-title">
            <h5>我的服务器</h5>
        </div>
        <c:forEach begin="1" end="10">
            <div class="col-sm-6 u-sm-6">
                <div class="u-region-box">
                    <div class="u-title-bar">
                        <div class="u-title">
                            <span>阿里云 saoft</span>
                        </div>
                        <div class="u-other">

                        </div>
                    </div>
                    <div class="u-content">
                        s
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>
<div class="g-ft">

</div>
<jsp:include page="global/global-script.jsp"/>
<script src="${basePath}/static/index/index.js"></script>
</body>
</html>
