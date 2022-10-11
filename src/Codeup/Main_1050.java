package Codeup;

import java.util.Scanner;

public class Main_1050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int result1 = Integer.parseInt(arr[0]);
        int result2 = Integer.parseInt(arr[1]);

        if(result1==result2){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
