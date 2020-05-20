package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("BOTTLES SONG");
        int LiczbaButelek = 99;
        System.out.println();
        {

            while (LiczbaButelek > 2) {
                System.out.println(LiczbaButelek + " green bottles hanging on the wall,");
                System.out.println(LiczbaButelek + " green bottles hanging on the wall,");
                LiczbaButelek = LiczbaButelek - 1;
                System.out.println("and if one green bottle should accidentally fall.");
                System.out.println("There'll be " + LiczbaButelek + " green bottle on the wall.");

                if (LiczbaButelek == 2) {
                    System.out.println(LiczbaButelek + " green bottles hanging on the wall,");
                    System.out.println(LiczbaButelek + " green bottles hanging on the wall,");
                    LiczbaButelek = LiczbaButelek - 1;
                    System.out.println("and if one green bottle should accidentally fall.");
                    System.out.println("There'll be " + LiczbaButelek + " green bottle on the wall.");
                }
                if (LiczbaButelek == 1) {
                    System.out.println(LiczbaButelek + " green bottle hanging on the wall,");
                    System.out.println(LiczbaButelek + " green bottle hanging on the wall,");
                    LiczbaButelek = LiczbaButelek - 1;
                    System.out.println("and if one green bottle should accidentally fall.");
                    System.out.println("There'll be " + LiczbaButelek + " green bottles on the wall.");
                }
                if (LiczbaButelek == 0) {
                    System.out.println("There'll be no green bottles hanging on a wall. ");
                }
                }
            }
        }
}

