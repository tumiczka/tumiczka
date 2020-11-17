package com.greenfoxaxademy;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {

    public static void main(String[] args) {

        /*int[] tomb = new int[10];
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = (int) (Math.random() * 100 - 1);
        }
        for (int i = 0; i < tomb.length; i++) {
            System.out.println(tomb[i]+" ");
        }
        System.out.println();*/

        String[] Felsorolas = {"répa", "retek", "mogyoró"};
        for (String s : Felsorolas) {
            System.out.println(s);
        }
        //0    1    2
        //3    4    4
        //0    0    0

        int[][] twoDimensionalArray = new int[3][3];
        int[][] array = {
                {0, 1, 2},
                {3, 4, 4},
                {0, 0, 0},
        };
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print((array[i][j] + " "));
            }
        }
        System.out.println();
        //Készíts programot,
        // amely egy 20 elemű tömböt feltölt 'a' karakterekkel,
        // majd a tömb minden 2. elemét kicseréli 'b' karakterre,
        // majd kiírja egymásmellé az elemeket, szóközzel elválasztva!

        char[] letter = new char[20];
        for (char i = 0; i <= 19; i++) {
            letter[i] = 'a';
        }
        for (char i = 1; i <= 19; i += 2) {
            letter[i] = 'b';
        }
        for (char i = 0; i <= 19; i++) {
            System.out.print(letter[i] + " ");
        }
        System.out.println("   ");
        //Írjál programot, amely az 5x5-ös egységmátrixot hozza létre!
        int[][] matrix = new int[5][5];
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }


        }
        System.out.println(matrix);
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print(matrix[i][j]+" ");

            }
        }
        System.out.println();
        //példa tömb kiíratása
        int[] arrayExample = {1, 2, 3, 6};

        // Írasd ki a tömb második elemét
        System.out.println("A tömb második eleme: " + arrayExample[1]);

        // Írasd ki a tömb minden elemét
        for (int i = 0; i < arrayExample.length; i++) {
            System.out.println(arrayExample[i] + " ");
        }

    }
}



