package Codeup;

import java.util.Scanner;

public class Main_1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int result1 = Integer.parseInt(arr[0]);
        int result2 = Integer.parseInt(arr[1]);

        int result3 = (int) Math.pow(2, result2);
        System.out.println(result1*result3);
    }
}
