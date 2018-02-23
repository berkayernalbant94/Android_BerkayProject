<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Giriş Sayfası</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <style type="text/css">
        body {
            padding-top: 40px;
            padding-bottom: 40px;
            background-color: #eee;
        }

        .form-signin {
            max-width: 330px;
            padding: 15px;
            margin: 0 auto;
        }
        .form-signin .form-signin-heading,
        .form-signin .checkbox {
            margin-bottom: 10px;
        }
        .form-signin .checkbox {
            font-weight: normal;
        }
        .form-signin .form-control {
            position: relative;
            height: auto;
            -webkit-box-sizing: border-box;
            -moz-box-sizing: border-box;
            box-sizing: border-box;
            padding: 10px;
            font-size: 16px;
        }
        .form-signin .form-control:focus {
            z-index: 2;
        }
        .form-signin input[type="email"] {
            margin-bottom: -1px;
            border-bottom-right-radius: 0;
            border-bottom-left-radius: 0;
        }
        .form-signin input[type="password"] {
            margin-bottom: 10px;
            border-top-left-radius: 0;
            border-top-right-radius: 0;
        }
    </style>
</head>
<body>
<div class="container">
    <form action="login" class="form-signin">
        <h2 class="form-signin-heading">Öğrenci Girişi</h2>
        <label class="sr-only">Kullanıcı Adı</label>
        <input type="text" name="kullaniciadi" class="form-control" placeholder="Kullanıcı Adı" required autofocus>
        <label class="sr-only">Şifre</label>
        <input type="password" name="sifre" class="form-control" placeholder="Şifre" required>
        <div style="color: red">${error}</div>
        <input class="btn btn-lg btn-primary btn-block" type="submit" value="Giriş">
    </form>
</div>
</body>
</html>
