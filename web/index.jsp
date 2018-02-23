<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Anasayfa</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="resources/js/getogrenciler.js"></script>
</head>
<body>
<div class="alert alert-success" role="alert">
    <a href="#" class="alert-link">Hoşgeldin <span style="color: green;">${kullaniciadi}</span></a>
</div>
<h3><a class="btn btn-info" href="getOgrenciler">Verileri Getir</a></h3>
<button id="getOgrenciler" type="button" class="btn btn-primary">Tüm Öğrencileri Göster AJAX</button>
<div id="getResultDiv" style="padding:20px 10px 20px 50px">
    <ul class="list-group">
    </ul>
</div>
</body>
</html>
