package Codeup;

import java.util.Scanner;

public class Main_1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int result = Integer.parseInt(arr[0]);
        int result2= Integer.parseInt(arr[1]);
        System.out.println(result/result2);
    }
}
