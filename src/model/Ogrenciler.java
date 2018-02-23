package model;

public class Ogrenciler {

    Integer id;
    String isim;
    String soyisim;
    String kullaniciadi;
    String sifre;
    Integer ders_id;
    Dersler ders;

    public Ogrenciler() {
    }

    public Ogrenciler(String kullaniciadi, String sifre) {
        this.kullaniciadi = kullaniciadi;
        this.sifre = sifre;
    }

    public Ogrenciler(Integer id, Integer ders_id, String isim, String soyisim, String kullaniciadi, String sifre) {
        this.id = id;
        this.ders_id = ders_id;
        this.isim = isim;
        this.soyisim = soyisim;
        this.kullaniciadi = kullaniciadi;
        this.sifre = sifre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDers_id() {
        return ders_id;
    }

    public void setDers_id(Integer ders_id) {
        this.ders_id = ders_id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public Dersler getDers() {
        return ders;
    }

    public void setDers(Dersler ders) {
        this.ders = ders;
    }

}
