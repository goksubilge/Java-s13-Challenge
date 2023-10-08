package com.bilge.model;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    // giro değeri hiçbir şekilde 0 altında değer alamamalı" şartını sağlamak için bakıyorum giro iki yerde de kulanılmış öyleyse ben buna private bir method yazabilirim.
    private void checkGiro(double giro) {
        if (giro < 0) {
            this.giro = 0;
        } else {
            this.giro = giro;
        }
    }

    // boilerplate code : Default olarak bir şeyi çalıştırabilmemiz için gerekli olan kod bloğudur.
    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        checkGiro(giro);
        this.developerNames = developerNames;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        checkGiro(giro);
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name) {
        try {
            if(developerNames[index] == null) {
                developerNames[index] = name;
            } else {
                System.out.println("İlgili index dolu! Developer mevcut.");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Olmayan index için atama yapıldı: " + index);
        }
    }
    @Override
    public String toString() {
        return "Company Details: {" +
                "id= " + id +
                ", name:" + name +
                ", giro=" + giro +
                ", developerNames:" + Arrays.toString(developerNames) +
                '}';
    }
}
/**
 * Arrays.toString : Static bir method 'tur. Çünkü sınıfının üstünden çağırır. (kendi kütüphanesinden çağırır)
 * 500 (http) hataları: direkt sunucunun üstünden (NullPointerex.. gibi) olan hatalar. Ben sunucunun üstünde handle edilmemiş hata kalmasın isterim her zaman.
 */
