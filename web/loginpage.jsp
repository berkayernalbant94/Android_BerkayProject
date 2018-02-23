<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Giriş Sayfası</title>
</head>
<body>
<form action="login">
    <h2>Öğrenci Girişi</h2>
    <table>
        <tr>
            <td>Kullanıcı Adı:</td>
            <td><input type="text" name="kullaniciadi"></td>
        </tr>
        <tr>
            <td>Şifre</td>
            <td><input type="password" name="sifre"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Giriş"></td>
        </tr>
    </table>
    <div style="color: red">${error}</div>
</form>
</body>
</html>
