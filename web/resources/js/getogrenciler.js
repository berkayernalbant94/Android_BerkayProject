$( document ).ready(function() {

    // GET REQUEST
    $("#getOgrenciler").click(function(event){
        event.preventDefault();
        ajaxGet();
    });

    // DO GET
    function ajaxGet(){
        $.ajax({
            type : "GET",
            url : window.location + "/login/getAllStudents",
            success: function(result){
                if(result.status == "Done"){
                    $('#getResultDiv .list-group li').remove();
                    $.each(result.data, function(i, ogrenci){
                        var ogrenci =
                            "- Öğrenci ID = " + ogrenci.id + ", isim = " + ogrenci.isim + ", soyisim = " +
                            ogrenci.soyisim +"Kullanıcı Adı" +ogrenci.kullaniciadi +"Sifre" + ogrenci.sifre +"Ders"
                            +ogrenci.dersler.ders + "<br>";
                        $('#getResultDiv .list-group').append('<li><h4 class="list-group-item"> ' +ogrenci +'</h4></li>')
                    });
                    console.log("Success: ", result);
                }else{
                    $("#getResultDiv").html("<strong>Error</strong>");
                    console.log("Fail: ", result);
                }
            },
            error : function(e) {
                $("#getResultDiv").html("<strong>Error</strong>");
                console.log("ERROR: ", e);
            }
        });
    }
});