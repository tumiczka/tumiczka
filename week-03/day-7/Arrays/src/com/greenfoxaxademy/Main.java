package com.greenfoxaxademy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello!");
        /*String[] names = {"Janos", "Bela", "Éva"};
        for (String name : names) {
            System.out.println(name);*/
        int[][] table = new int[4][4];
        for (int i = 0; i < table.length; i++) {
            System.out.println(Arrays.toString(table[i]));
        }
        int[][] differentLengthArray = new int[4][];
        for (int i = 0; i < differentLengthArray.length; i++) {
            differentLengthArray[i] = new int[i + 1];
        System.out.println(Arrays.toString(differentLengthArray[i]));
        }
    }


}
