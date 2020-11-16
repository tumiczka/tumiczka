package com.greenfoxaxademy;

public class Main {

    public static void main(String[] args) {
        //Swap
        // Cseréld meg a 2 változó értékét programozás útján.
        // Az a értéke legyen az, ami a b változóban van és fordítva.
        int a = 123;
        int b = 526;
        int c = a;
        a = b;
        b = c;

        //BMI
        System.out.println(a);
        System.out.println(b);
        double massInKg = 91.2;
        double heightInM = 1.67;
        // Számíttasd és írasd ki a testtömeg-indexet (BMI)
        // a változókat használva
        double bmi = massInKg / (heightInM * heightInM);
        System.out.println("A testtömeg-indexem: " + bmi);
        //DefineBasicInfo
        // Hozz létre pár dolgot változóként és utána írasd ki az értékeiket:
        // - A neved karakterláncként (string)
        // - Korod egész számként (integer)
        // - Magasságod méterben törtszámként (float / double)
        // - Házas vagy-e logikai értékként (boolean)string
        String nameLetter1 = "K";
        String nameLetter2 = "a";
        String nameLetter3 = "t";
        String nameLetter4 = "a";
        String nameLetter5 = "l";
        String nameLetter6 = "i";
        String nameLetter7 = "n";
        System.out.println("Nevem: " + nameLetter1 + nameLetter2 + nameLetter3 + nameLetter4 + nameLetter5 + nameLetter6 + nameLetter7);
        int myAge = 40;
        System.out.println("Korom: " + myAge + " év");
        double heigth = 1.67;
        System.out.println("Magasságom: " + heigth + " m");
        boolean maritalStatus = true;
        System.out.println("Házas vagyok-e: "+maritalStatus);

    }
}
