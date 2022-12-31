package Assign2;

import java.util.Scanner;

public class Prob1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name1 = sc.next();
        String name2 = sc.next();
        int rno = sc.nextInt();
        String sub = sc.next();
        System.out.println("Name:"+name1+name2);
        System.out.println("Roll Number:"+rno);
        System.out.println("Field of Interest:"+sub);
    }
}
