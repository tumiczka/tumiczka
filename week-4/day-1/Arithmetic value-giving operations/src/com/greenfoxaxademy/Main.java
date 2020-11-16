package com.greenfoxaxademy;

public class Main {

    public static void main(String[] args) {
        //Swap
        // Cseréld meg a 2 változó értékét programozás útján.
        // Az a értéke legyen az, ami a b változóban van és fordítva.
        int a = 123;
        int b = 526;
        int c=a;
        a=b;
        b=c;

        //BMI
        System.out.println(a);
        System.out.println(b);
        double massInKg = 91.2;
        double heightInM = 1.67;
        // Számíttasd és írasd ki a testtömeg-indexet (BMI)
        // a változókat használva
        double bmi=massInKg/(heightInM*heightInM);
        System.out.println("A testtömeg-indexem: "+bmi);
        
    }
}
