import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = getNum(n,scanner);
        System.out.println("Cac so nguyen to trong mang la: ");
        for(int x : numbers)
        {
            if(checkPrime(x))
            {
                System.out.printf("%d ", x);
            }
        }
    }

    private static boolean checkPrime(int x) {
        for(int i = 2; i < Math.sqrt(x); i++)
        {
            if(x % i == 0) return false;
        }
        return x > 2;
    }

    private static int[] getNum(int n, Scanner scanner) {
        int[] num = new int[n];
        System.out.println("Nhap cac phan tu trong mang: ");
        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }
        return num;
    }
}
