import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
//        Mục tiêu: Viết chương trình yêu cầu người dùng nhập một số nguyên và kiểm tra tính hợp lệ.
//                Yêu cầu:
//        Sử dụng try-catch để bắt ngoại lệ nếu người dùng nhập dữ liệu không phải là số.
        var scanner = new Scanner(System.in);
        int number;
        while(true)
        {
            try{
                System.out.println("Vui long nhap vao 1 so nguyen!");
                number = Integer.parseInt(scanner.nextLine());
                System.out.println("So nguyen vua nhap la: "+ number);
                break;
            }catch (NumberFormatException e){
                System.out.println("Ban vua nhap 0 phai la so nguyen. vui long nhap lai!!");
            }
        }
    }
}
