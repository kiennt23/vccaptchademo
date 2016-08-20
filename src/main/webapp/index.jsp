<%--
  Created by IntelliJ IDEA.
  User: kiennguyen
  Date: 7/31/16
  Time: 01:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="https://www.google.com/recaptcha/api.js?onload=vcRecaptchaApiLoaded&render=explicit" async defer></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/components/angular/angular.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/components/angular-animate/angular-animate.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/components/angular-touch/angular-touch.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/components/angular-bootstrap/ui-bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/components/angular-bootstrap/ui-bootstrap-tpls.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/components/angular-ui-router/release/angular-ui-router.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/components/angular-resource/angular-resource.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/components/angular-recaptcha/release/angular-recaptcha.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/app/view/registration/register.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/app/view/registration/result.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/app/view/registration/popup.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/app/app.js"></script>
    <title>Registration</title>
</head>
<body ng-app="demoApp">

<div>
    <h1>You will receive a free book if you register!</h1>
    <a ui-sref="register">Register</a>
    <%--<a ui-sref="result">Result</a>--%>
    <div ui-view></div>

</div>

</body>
</html>
