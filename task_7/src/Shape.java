import java.util.Scanner;

public class Shape {
    public double TinhDienTich(){
        return 0.0;
    }

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        Circle c1 = new Circle(1.0);
        System.out.println("Nhap ban kinh: ");
        Double radius = scanner.nextDouble();
        c1.setR(radius);
        System.out.println("Dien tich hinh tron la: " + c1.TinhDienTich());
        System.out.println("Nhap chieu rong: ");
        Double w = scanner.nextDouble();
        System.out.println("Nhap chieu dai: ");
        Double h = scanner.nextDouble();
        Rectangle c2 = new Rectangle(1.0,1.0);
        c2.setHeight(h);
        c2.setWidth(w);
        System.out.println("Dien tich hinh chu nhat la: " + c2.TinhDienTich());
    }
}
