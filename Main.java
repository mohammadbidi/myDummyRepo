package com.bidi;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("tedad aza ro moshakhas kon");
        Scanner myscanner = new Scanner(System.in);
        int tedadaza = myscanner.nextInt();
        int[] age = new int[tedadaza];
        long[] id = new long[tedadaza];
        char[] genders = new char[tedadaza];
        String[] name = new String[tedadaza];
        int ids = 0;
        int exit=1;
        while (tedadaza >0) {
            if (exit!=0) {
                System.out.println("1.add memebr");
                System.out.println("2.edit member info");
                System.out.println("3.show minfo mem");
                System.out.println("4.exit");
                Scanner chose = new Scanner(System.in);
                byte a = chose.nextByte();
                switch (a) {
                    case 1: {
                        if (tedadaza > ids) {
                            System.out.println("name:");
                            name[ids] = myscanner.next();
                            System.out.println("age?");
                            age[ids] = myscanner.nextInt();
                            System.out.println("gener m or f ?");
                            genders[ids] = myscanner.next().charAt(0);

                            System.out.println("your id=" + ids);
                            ids++;

                        }

                    }
                    break;

                    case 2: {
                        System.out.println("inter ids:");
                        int b = myscanner.nextInt();
                        System.out.println("konde deghat kon hala zer bezab kodomesho mikhay avaz koni");
                        System.out.println("enter name:");
                        name[b] = myscanner.next();
                        System.out.println("age?");
                        age[b] = myscanner.nextInt();
                        System.out.println("gener m or f ?");
                        genders[b] = myscanner.next().charAt(0);

                    }
                    break;
                    case 3: {
                        System.out.println("enter ids");
                        int d = myscanner.nextInt();
                        System.out.println("name:" + name[d]);
                        System.out.println("age:" + age[d]);
                        System.out.println("gener:" + genders[d]);
                    }
                    break;
                    case 4:
                        System.out.println("blakhare dokmeye siketo zadi");
                        exit = 0;


                }
                if (tedadaza == ids) System.out.println("tavile pore");
            }

        }
        myscanner.close();

    }
}