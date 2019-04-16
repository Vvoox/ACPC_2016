package com.example.java;

import java.util.Scanner;

public class Main {

    public static int N = 0, E = 0, Q = 0;

    public static void main(String[] args) {
        System.out.println("We need to help Khaleesi to split the army into 2 sides : ");
        System.out.println("Insert your input : ");
        Scanner cs = new Scanner(System.in);
        int T = cs.nextInt();
        Scanner num = new Scanner(System.in);
        Scanner riv = new Scanner(System.in);
        Scanner que = new Scanner(System.in);


        for (int i = 0; i < T; i++) {
            String nn = num.next();
            String ee = riv.next();
            String qq = que.next();
            N = Integer.parseInt(nn);
            E = Integer.parseInt(ee);
            Q = Integer.parseInt(qq);
            valar(N ,E, Q);
        }
    }

    public static void valar(int N ,int E, int Q) {

        Scanner rivl = new Scanner(System.in);
        Scanner quer = new Scanner(System.in);
        String[] rivalries1[] = new String[E][2];
        String[] queries1[] = new String[Q][2];
        int[] rivalries[] = new int[E][2];
        int[] queries[] = new int[Q][2];
        int[] resultat[] = new int[Q][2];

        for (int i = 0; i < E; i++) {
            for (int j = 0; j < 2; j++) {

                rivalries1[i][j] = rivl.next();
                rivalries[i][j] = Integer.parseInt(rivalries1[i][j]);

            }
        }
        for (int i = 0; i < Q; i++) {
            for (int j = 0; j < 2; j++) {

                queries1[i][j] = quer.next();
                queries[i][j] = Integer.parseInt(queries1[i][j]);

            }
        }

        /*for (int i = 0; i < E; i++) {
            for (int j = 0; j < 2; j++) {

                System.out.print(rivalries[i][j] + " ");
            }
            System.out.println();
        }
       /* for (int i = 0; i < Q; i++) {
            for (int j = 0; j < 2; j++) {

                System.out.print(queries[i][j] + " ");
            }
            System.out.println();
        }*/

        for (int i = 0; i < Q; i++) {

            int length = queries[i][1] - queries[i][0] + 1 ;
            int[] interval = new int[length];

            int value=0;
            for (int p = queries[i][0] ; p <= queries[i][1] ; p++){

                interval[value]=p;
                value++;
            }
            /*for(int g = 0 ; g<length ; g++){
                System.out.print(interval[g]+" ");
            }
            System.out.println();*/

            for (int j = 0; j < length; j++) {

                if (rivalries[i][0] == interval[j]) {

                    for (int k =0; k < length; k++) {

                        if (rivalries[i][1] == interval[k]) {

                            resultat[i][0] = -1;
                            resultat[i][1] = -1;

                        }
                        if(rivalries[i][1]!=interval[k]){

                            resultat[i][1] = length - 1;
                            resultat[i][0] = N - resultat[i][1];


                        }
                        else break;
                    }
                }
                if (rivalries[i][1] == interval[j]) {

                    for (int k =0; k < length; k++) {

                        if (rivalries[i][0] == interval[k]) {

                            resultat[i][0] = -1;
                            resultat[i][1] = -1;


                        }
                        if(rivalries[i][0]!=interval[k]){

                            resultat[i][1] = length - 1;
                            resultat[i][0] = N - resultat[i][1];


                        }
                        else break;
                    }
                }
                if(length==1){

                    resultat[i][1]=1;
                    resultat[i][0]=N-1;

                }

                /*if(rivalries[i][0]!=interval[j]) {

                    for(int y =0 ; y<length ; y++){

                        if(rivalries[i][1]!=interval[y]){

                            resultat[i][0] = 5;
                            resultat[i][1] = 5;
                        }
                        else break;
                    }



                }*/
            }

            }


        for(int i =0 ; i<Q ; i++){

            System.out.print(resultat[i][0]+" "+resultat[i][1]+"\n");
        }

    }
}
