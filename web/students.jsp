<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
</head>
<body>
<div class="container table-responsive" style="margin-top: 50px;" align="center">
    <table class="table" border="1">
        <th>ID</th>
        <th>İsim</th>
        <th>Soyisim</th>
        <th>Kullanıcı Adı</th>
        <th>Şifre</th>
        <th>Ders</th>

        <c:forEach var="ogrenci" items="${listOgrenciler}">
            <tr>
                <td>${ogrenci.id}</td>
                <td>${ogrenci.isim}</td>
                <td>${ogrenci.soyisim}</td>
                <td>${ogrenci.kullaniciadi}</td>
                <td>${ogrenci.sifre}</td>
                <td>${ogrenci.ders.ders}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
