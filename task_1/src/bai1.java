import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
//        Mục tiêu: Viết chương trình tính toán chỉ số BMI (Body Mass Index) từ chiều cao và cân nặng của người dùng.
//                Yêu cầu:
//        Nhập vào chiều cao (mét) và cân nặng (kg).
//                Tính BMI theo công thức: BMI = weight / (height * height).
//                In ra thông báo kết luận người dùng thuộc loại cân nặng nào (gầy, bình thường, thừa cân, béo phì).
        var scanner = new Scanner(System.in);
        System.out.println("Nhap can nang (kg): ");
        Double weight = scanner.nextDouble();
        System.out.println("Nhap chieu cao (m): ");
        Double height = scanner.nextDouble();
        if(height <= 0 || weight <= 0){
            System.out.println("Nhap can nang va chieu cao hop le!!");
        }
        else {
            var res = weight / (height*height);
            String BMI = String.format("%.2f", res); // Định dạng res với 2 số sau dấu phẩy
            System.out.println("BMI cua ban la: " + BMI);
            if(res < 18.5)
            {
                System.out.println("Ban dang thieu can");
            }
            else if(res < 25)
            {
                System.out.println("Dat can nang tieu chuan");
            }
            else if(res < 30)
            {
                System.out.println("Ban dang thua can");
            }
            else if(res < 35)
            {
                System.out.println("Ban dang beo phi loai I");
            }
            else   System.out.println("Ban dang beo phi loai II");
        }

    }
}
