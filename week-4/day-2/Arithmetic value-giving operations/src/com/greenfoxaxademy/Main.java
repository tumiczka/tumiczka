package com.greenfoxaxademy;

public class Main {

    public static void main(String[] args) {
        //Swap
        // Cseréld meg a 2 változó értékét programozás útján.
        // Az a értéke legyen az, ami a b változóban van és fordítva.
        /*int a = 123;
        int b = 526;
        int c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);*/
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
        String status=(maritalStatus==true)?"Házas vagyok":"Nem vagyok házas";
        System.out.println(status);

        //VariableMutation
        int a = 3;
        // Növeld meg az "a" változó értékét 10-zel
        a += 10;
        System.out.println(a);
        int b = 100;
        // Csökkentsd a "b" változó értékeét 7-tel
        b -= 7;
        System.out.println(b);

        int c = 44;
        // A c értéke legyen dupla akkora
        c *=2;
        System.out.println(c);

        int d = 125;
        // Oszd el a d-t 5-tel
        d /=5;
        System.out.println(d);

        int e = 8;
        // Emeld köbre az e változó értékét
        e *= e*e;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        // Logikai (boolean) értékként írasd ki hogy f1 nagyobb-e f2-nél
        if (f1>f2){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        int g1 = 350;
        int g2 = 200;
        // Mondja meg a program, hogy g2 duplája nagyobb-e g1-nél (boolean)
        if(g2*2>g1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        int h = 135798745;
        // Mondja meg a program, hogy osztható-e 11-el maradék nélkül?
        // Írasd is ki logikai (boolean) értékként
        System.out.println("A h változó osztható-e maradék nélkül 11-el?: "+(h%11==0 ? "true":"false"));

        int i1 = 10;
        int i2 = 3;
        // Mondja meg a program hogy i1 nagyobb-e i2 négyzeténél ÉS ugyanakkor kisebb-e i2 köbénél (boolean)

        int j = 1521;
        // Írasd ki, hogy j osztható-e 3-mal vagy 5-tel (boolean)

    }
}
