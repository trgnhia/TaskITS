import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
//        Mục tiêu: Viết chương trình chuyển đổi nhiệt độ giữa hai đơn vị Celsius và Fahrenheit.
//        Yêu cầu:
//        Người dùng nhập giá trị nhiệt độ và đơn vị cần chuyển đổi.
//                Sử dụng các công thức:
//        Từ Celsius sang Fahrenheit: F = C * 9/5 + 32
//        Từ Fahrenheit sang Celsius: C = (F - 32) * 5/9.
        var scanner = new Scanner(System.in);
        System.out.println("---------*Chon chuc nang*----------");
        System.out.println("1:Doi tu do C sang do F");
        System.out.println("2:Doi tu do F sang do C");
        int choice = scanner.nextInt();
        Double degree;
        if(choice == 1){
            System.out.println("Nhap do C: ");
            degree = scanner.nextDouble();
            var F = String.format("%.2f", (degree * 9/5 + 32) );
            System.out.println(degree + " do C = "+ F + " do F");
        }
        else{
            System.out.println("Nhap do F: ");
            degree = scanner.nextDouble();
            var C = String.format("%.2f", ((degree - 32) * 5/9.) );
            System.out.println(degree + " do F = "+ C + " do C");
        }
    }

}
