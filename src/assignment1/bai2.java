package assignment1;

import java.util.Scanner;

public class bai2 {    //tìm số có vị trí thứ n của dãy fibonacci
    public static int fibonacci(int n) {
        if (n <= 0) {
            return -1; // Giá trị không hợp lệ
        } else if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            int a = 0, b = 1;
            for (int i = 3; i <= n; i++) {
                int temp = a + b;
                a = b;
                b = temp;
            }
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên n: ");
        int num = scanner.nextInt();

        int fibonacciNum = fibonacci(num);
        if (fibonacciNum != -1) {
            System.out.println("Số Fibonacci thứ " + num + " là " + fibonacciNum);
        } else {
            System.out.println("Không thể tìm số Fibonacci thứ " + num);
        }
    }
}
