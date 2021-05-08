<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 5/4/21
  Time: 1:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Submitted Information</title>

    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css"
          integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700" rel="stylesheet">
    <style>
        html, body {
            min-height: 100%;
            padding: 0;
            margin: 0;
            font-family: Roboto, Arial, sans-serif;
            font-size: 14px;
            color: #666;
        }

        h1 {
            margin: 100px 650px;
            font-weight: 800;
            color: #000000;
        }

        h3 {
            margin: 100px 20px 20px 650px;
            font-weight: 500;
            color: #00316E;
        }

        p {
            margin: 0 0 5px;
        }

        .main-block {
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            background: #1c87c9;
        }

        form {
            padding: 25px;
            margin: 25px;
            box-shadow: 0 2px 5px #f5f5f5;
            background: #f5f5f5;
        }

        input, textarea {
            width: calc(100% - 18px);
            padding: 8px;
            margin-bottom: 20px;
            border: 1px solid #1c87c9;
            outline: none;
        }

        input::placeholder {
            color: #666;
        }

        button {
            width: 100%;
            padding: 10px;
            border: none;
            background: #1c87c9;
            font-size: 16px;
            font-weight: 400;
            color: #fff;
        }

        button:hover {
            background: #2371a0;
        }

    </style>

</head>
<body>
<h1>Customer Details</h1>
<h3>Customer ID: ${id}</h3>
<h3>Customer Name: ${name}</h3>
<h3>Customer Email: ${email}</h3>
</body>
</html>
