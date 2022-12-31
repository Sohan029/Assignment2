package Assign2;

import javax.swing.*;
import java.util.Scanner;

public class Prob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int tot = (m1+m2+m3);
        System.out.println("Total marks:" + tot);
        System.out.println("Percentage marks:"+(tot/3)+"%");
    }
}
