<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Giriş Sayfası</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <link rel="stylesheet" href="resources/css/style.css">
</head>
<body>
<div class="container">
    <div class="wrapper">
    <form action="login" class="form-signin">
        <h3 class="form-signin-heading">Öğrenci Girişi</h3>
        <hr class="colorgraph">
        <label class="sr-only">Kullanıcı Adı</label>
        <input type="text" name="kullaniciadi" class="form-control" placeholder="Kullanıcı Adı" required autofocus>
        <label class="sr-only">Şifre</label>
        <input type="password" name="sifre" class="form-control" placeholder="Şifre" required>
        <div style="color: red; margin-bottom: 12px;">${error}</div>
        <input class="btn btn-lg btn-primary btn-block" type="submit" value="Giriş">
    </form>
    </div>
</div>
</body>
</html>
