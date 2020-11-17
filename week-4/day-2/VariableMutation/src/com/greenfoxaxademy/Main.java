package com.greenfoxaxademy;

public class Main {

    public static void main(String[] args) {
        int h = 135798745;
        // Mondja meg a program, hogy osztható-e 11-el maradék nélkül?
        // Írasd is ki logikai (boolean) értékként
        System.out.println("A h változó osztható-e maradék nélkül 11-el?: "+(h%11==0 ? "true":"false"));

        int i1 = 10;
        int i2 = 3;
        // Mondja meg a program hogy i1 nagyobb-e i2 négyzeténél
        // ÉS ugyanakkor kisebb-e i2 köbénél (boolean)
        boolean examination=i1>i2*i2 && i1<i2*i2*i2;
        String examinationResult=examination? "true" : "false";
        System.out.println(examinationResult);

        int j = 1521;
        // Írasd ki, hogy j osztható-e 3-mal vagy 5-tel (boolean)
        boolean jDivisibility=j%3==0 || j%5==0;
        String jDivisibilityResult=jDivisibility ? "true" : "false";
        System.out.println(jDivisibilityResult);
        }
    }


