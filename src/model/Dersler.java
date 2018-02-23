package model;

public class Dersler {

    Integer id;
    String ders;

    public Dersler() {
    }

    public Dersler(Integer id, String ders) {
        this.id = id;
        this.ders = ders;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDers() {
        return ders;
    }

    public void setDers(String ders) {
        this.ders = ders;
    }


}
