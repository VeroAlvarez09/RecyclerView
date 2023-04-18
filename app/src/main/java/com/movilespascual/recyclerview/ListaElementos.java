package com.movilespascual.recyclerview;

public class ListaElementos {
    public  String name, tel, email, yearOld, city;

    public ListaElementos(String name, String tel, String email, String yearOld, String city) {
        this.name = name;
        this.tel = tel;
        this.email = email;
        this.yearOld = yearOld;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;

    }

    public String getYearOld() {
        return yearOld;
    }

    public void setYearOld(String yearOld) {
        this.yearOld = yearOld;

    }
}
