package assignment1;

import java.util.Scanner;

public class bai3 {   //tìm UCLN và BCNN của 2 số
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();
        int gcd = findGCD(a, b);
        int lcm = findLCM(a, b);
        System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là " + gcd);
        System.out.println("Bội chung nhỏ nhất của " + a + " và " + b + " là " + lcm);
    }
}
