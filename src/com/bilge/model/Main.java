package com.bilge.model;
import com.bilge.enums.Plan;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        HealthPlan Plan1 = new HealthPlan(1,"1. Sigorta", Plan.PINKSPECIAL);
        HealthPlan Plan2 = new HealthPlan(2,"2. Sigorta", Plan.PINKBONUS);

        System.out.println(Plan1);
        System.out.println(Plan2);

        // Array oluşturma:
        String[] healthPlans = new String[3];

        healthPlans[0] = Plan1.getName(); // Array ===== Array tanımlamalısın. String ===== String olmalı. Plan1 burda bir obje. HealthPlan class 'ında tanımlı bir obje, enum. o yüzden enum 'ın Name 'ini getir diyorum.
        healthPlans[1] = Plan2.getName();

        // Şimdi asıl olaya geldim.
        Employee employee = new Employee(1,"Bilge", "bilge@g.com", "12345", healthPlans);

        // Test1
        employee.addHealthPlan(0,"3. Sigorta"); // NullPointerException noktası buldum, healthPlan !=null §§ yi ekledim addHealthPlan 'a
        employee.addHealthPlan(2,"2. Sigorta"); // Yazdığın isim... hatası veriyor.
        employee.addHealthPlan(3,"2. Sigorta"); // (Yazdığın isim sistemde mevcut. Başka bir girdiyle tekrar dene.2. Sigorta.) hatası veriyor. index uyarısı vermiyor. önce alan (index kontrolü yazdırmak lazımdı kodda.)
        employee.addHealthPlan(3,"3. Sigorta"); // Invalid Index: 3
        employee.addHealthPlan(2,"3. Sigorta"); // 3. Sigorta değeri 2. index'e eklendi
        System.out.println(Arrays.toString(employee.getHealthPlans())); // ya da for döngüsüyle her bir elemanını gezip bastırabilirdim.
        // çıktısı => [1. Sigorta, 2. Sigorta, 3. Sigorta]
    }
}