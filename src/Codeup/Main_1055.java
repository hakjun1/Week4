package Codeup;

import java.util.Scanner;

public class Main_1055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        if (input[0].equals("1")||input[1].equals("1")){
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}
