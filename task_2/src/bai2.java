import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong n: ");
        int n = scanner.nextInt();
        boolean check = true;
        if(n < 2)
        {
            check = false;
        }
        else{
            for (int i = 2; i < Math.sqrt(n) ; i++) {
                if(n%i==0){
                    check = false;
                    break;
                }
            }
        }
        if(check) System.out.println("Day la so nguyen to");
        else System.out.println("Day KHONG phai so nguyen to");
    }
}
