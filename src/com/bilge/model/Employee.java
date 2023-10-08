package com.bilge.model;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(int id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }

    // kişiye sağlık planı ekleme fonk ( TEKRAR ET BURAYI: 20:00 - 46:45 )
    // ["normal" , "plus"] 3- special
    // ["A", "B", null]
    public void addHealthPlan(int index, String name) {
        if (index < 0) {
            System.out.println("Saçmalama, git ve 0+ bir değer gir.");
        } else {
            try {
                boolean isExist = false; // break'i kullanabilmek için böyle bişe var mı yok mu check'i yaptık. ilerisi için. varsa kırılım.
                for (String healthPlan : healthPlans) {
                    if (healthPlan != null && healthPlan.equals(name)) {
                        isExist = true;
                        break;
                    }
                }
                // ["PINK", null, null, "PINKSPECIAL"] örneğin bunları çağırdım (! işareti  == false check eder):
                if (!isExist) {
                    if (healthPlans[index] == null) { // Exist değilse (true)
                        healthPlans[index] = name;
                    } else {
                        System.out.println("Gelen index dolu.");
                    }
                } else { // exist ise (false)
                    System.out.println("Yazdığın isim sistemde mevcut. Başka bir girdiyle tekrar dene." + name);
                }
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Invalid Index: " + index);
            }
            catch (NullPointerException npe) {
                System.out.println("Null Pointer Exception: " + npe.getMessage());
            } catch (Exception ex) {
                System.out.println( "Genel hata" + ex.getMessage()); // "Genellikle kullanıcıların yapabileceği hatalara yöneliktir."
            }
        }
    }
}
/**
 * booleans isBla ile isimlendirilir. olup olmadığını sorguluyoruz yani. true-false.
 * booleans 'ın get methodunda get yazmaz çünkü zaten 2 olasılığı var okunabilecek.
 * Validations da böyledir:
 * <p>
 * private boolean isMarried;
 * public boolean isMarried() {return isMarried;}
 * public void setMarried(boolean married) {isMarried = married;}
 */
