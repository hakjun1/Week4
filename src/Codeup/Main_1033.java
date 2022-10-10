package Codeup;

import java.util.Scanner;

public class Main_1033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String num16 = Integer.toHexString(input);

        System.out.println(num16.toUpperCase());
    }
}
