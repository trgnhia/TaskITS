import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("---------*Nhập lựa chọn*---------");
        System.out.println("1: Cộng");
        System.out.println("2: Trừ");
        System.out.println("3: Nhân");
        System.out.println("4: Chia");
        var choice = scanner.nextInt();
        System.out.println("Nhập a: ");
        var a =  scanner.nextDouble();
        System.out.println("Nhập b: ");
        var b =  scanner.nextDouble();
        var res = switch (choice) {
            case 1 -> a + " + " + b + " = " + (a + b);     // Trả về kết quả phép cộng
            case 2 -> a + " - " + b + " = " + (a - b);     // Trả về kết quả phép trừ
            case 3 -> a + " * " + b + " = " + (a * b);     // Trả về kết quả phép nhân
            case 4 -> {
                if (b != 0) {
                    yield a + " / " + b + " = " + (a / b); // Trả về kết quả phép chia
                } else {
                    yield "Không thể chia cho 0!";
                }
            }
            default -> "Sai chức năng, nhập lại!";
        };
        System.out.println(res);
    }
}
