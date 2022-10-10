package Codeup;

import java.util.Scanner;

public class Main_1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        long result = Long.parseLong(input[0])+Long.parseLong(input[1]);

        System.out.println(result);
    }
}
