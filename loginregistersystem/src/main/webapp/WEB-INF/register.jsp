<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%--
  User: erfan
  Date: 4/15/21
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>

<div class="container">
    <div class="row">
        <div class="col-md-4"></div>

        <div class="col-md-4" style="padding-top: 20%">
            <legend>Create New Account</legend>

            <form:form method="POST" modelAttribute="user" class="form-signin">

                <div class="mb-3">
                    <div>
                        <form:input type="text"
                                    path="firstname"
                                    class="form-control"
                                    placeholder="Enter First Name"
                                    autofocus="true"/>
                    </div>
                </div>
                <div class="mb-3">
                    <div>
                        <form:input type="text"
                                    path="lastname"
                                    class="form-control"
                                    placeholder="Enter Last Name"
                                    autofocus="true"/>
                    </div>
                </div>
                <div class="mb-3">
                    <div>
                        <form:input type="text"
                                    path="username"
                                    class="form-control"
                                    placeholder="Enter User Name"
                                    autofocus="true"/>
                    </div>
                    <div style="margin-top: 5px">
                        <form:errors path="username" cssClass="alert alert-danger form-control"/>
                    </div>
                </div>

                <div class="mb-3">
                    <div>
                        <form:input type="email"
                                    path="email"
                                    class="form-control"
                                    placeholder="Enter Email Address"
                                    autofocus="true"/>
                    </div>
                </div>

                <div class="mb-3">
                    <div>
                        <form:input type="password"
                                    path="password"
                                    class="form-control"
                                    placeholder="Enter Password"/>
                    </div>

                    <div style="margin-top: 5px">
                        <form:errors path="password" cssClass="form-control alert alert-danger"/>
                    </div>
                </div>
                <button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
            </form:form>
            <div class="mb-3" style="margin-top: 10px">
                <a href="/login">Already have an account? Sign in here!</a>
            </div>
        </div>
    </div>
</div>

</body>
</html>