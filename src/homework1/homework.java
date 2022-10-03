package homework1;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {

        //3 task
        int n = 2;
        System.out.println(n * n);

        //  4 task
        int a = 1000;
        int b = 500;
        int skidka = 100;
        System.out.println(a + b - skidka);
        System.out.println("скидка " + skidka);

        //5 task
        Scanner scanner = new Scanner(System.in);
        int nan = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        int bulka = scanner1.nextInt();
        System.out.println(nan + bulka);
        System.out.println(nan - bulka);


    }
}
