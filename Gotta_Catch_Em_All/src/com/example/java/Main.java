package com.example.java;

import java.util.Scanner;

public class Main {

    public static int T=0;

    public static void main(String[] args) {
        System.out.println("Hello ,we need to create a net to catch all Pokemons : ");
        System.out.println("Insert your values");
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        int max[] = new int[T];
        Scanner nm = new Scanner(System.in);
        Scanner tp = new Scanner(System.in);
        Scanner tab = new Scanner(System.in);

        // String N1,K1 ;
        // int N,K;
        String input1[][] = new String[T][2];
        int input[][] = new int[T][2];

        for (int i = 0; i < T; i++) {

            for (int j = 0; j < 2; j++) {

                input1[i][j] = nm.next();
                input[i][j] = Integer.parseInt(input1[i][j]);

            }
            Ash(input[i],max);


        }
        for(int i=0 ;i<max.length;i++){

            System.out.println(max[i]);
        }

    }

    public static void Ash(int tab[],int[] max) {
        Scanner pok = new Scanner(System.in);
        int N = tab[0];
        int K = tab[1];
        String pokemon1[][] = new String[N][3];
        int pokemon[][] = new int[N][3];

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < 3; j++) {

                pokemon1[i][j] = pok.next();
                pokemon[i][j] = Integer.parseInt(pokemon1[i][j]);
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(pokemon[i][j] + " ");
            }
            System.out.println();
        }
        int cnt = 0;


            for (int i = 0; i < N; i++) {

                for (int l = 0; l < T; l++) {

                if (i + 1 == N) {
                break; }

                if (pokemon[i][2] != pokemon[i + 1][2]) {

                    for (int j = i; j <= i + 1; j++) {

                    if (pokemon[j][0] <= pokemon[j][1]) {


                        if (max[l] <= pokemon[j][1]) {

                            max[l] = pokemon[j][1];

                        }
                    }
                    if (pokemon[j][1] <= pokemon[j][0]) {

                        if (max[l] <= pokemon[j][0]) {

                            max[l] = pokemon[j][0];

                        }

                    }
                    else break;
                }
            }


        }

    }

        //System.out.print(max);


    }
}
