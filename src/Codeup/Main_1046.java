package Codeup;

import java.util.Scanner;

public class Main_1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int result1 = Integer.parseInt(arr[0]);
        int result2 = Integer.parseInt(arr[1]);
        int result3 = Integer.parseInt(arr[2]);
        int sum = result1+result2+result3;

        System.out.println(sum);
        System.out.printf("%.1f",(float)sum/3);

    }
}
