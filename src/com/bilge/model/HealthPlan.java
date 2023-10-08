package com.bilge.model;

import com.bilge.enums.Plan;

public class HealthPlan {
    private int id;
    private String name;
    private Plan plan;

    public HealthPlan(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public HealthPlan(int id, String name, Plan plan) {
        this.id = id;
        this.name = name;
        this.plan = plan;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getName() {
        return name;
    }
    public void setName(String name) {this.name = name;}

    public Plan getPlan() {return plan;}
    public void setPlan(Plan plan) {this.plan = plan;}

    /**
        SETTER  (setter methods => void olurlar çünkü geri dönüş vermesine gerek yok.
        Eğer Data Set edildikten sonra bana geri dönüş dönsün, bunu bir yerde kullanıcam gibi özel bir sebep varsa 'gelen değeri' döndürebilirsin.
        Ama sadece değeri alıp atamasını yapacaksam bunun için bir değer döndürmeme gerek yok.)
     */

    @Override
    public String toString() {
        return "Health Plan {" +
                "Id= " + id +
                ", Name= " + name +
                ", Plan= (Name: " + plan.getName() + " - Price:" + plan.getPrice() +
                '}';
    }
}
