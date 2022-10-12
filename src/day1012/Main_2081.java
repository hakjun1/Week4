package day1012;

import java.util.Scanner;

public class Main_2081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            int input = sc.nextInt();
            arr[i] = input;
        }
        int max = arr[0];
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                num = i;
            }
        }
        System.out.println(max);
        System.out.println(num+1);
    }
}
