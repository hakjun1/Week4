package Codeup;

import java.util.Scanner;

public class Main_1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int result1 = Integer.parseInt(input[0]);
        int result2 = Integer.parseInt(input[1]);

        if (result1 <= result2) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }

    }
}
