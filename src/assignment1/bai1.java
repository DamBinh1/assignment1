package assignment1;

import java.util.Scanner;

public class bai1 {     //kiểm tra số hoàn hảo
    public static boolean isPerfectNumber(int n) {
        int sumOfDivisors = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sumOfDivisors += i;
            }
        }
        return sumOfDivisors == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên n: ");
        int num = scanner.nextInt();

        if (isPerfectNumber(num)) {
            System.out.println(num + " là số hoàn hảo.");
        } else {
            System.out.println(num + " không phải là số hoàn hảo.");
        }
    }
}
