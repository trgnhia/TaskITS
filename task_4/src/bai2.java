import java.util.HashMap;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
//        Mục tiêu: Sử dụng HashMap để quản lý thông tin khách hàng theo mã khách hàng. Viết chương trình tìm kiếm
//        khachs hàng theo mã.
//                Yêu cầu:
//        Mã khách hàng là key và thông tin chi tiết là value.
        HashMap<String, String> Guest = new HashMap<>();
        Guest.put("G001", "A");
        Guest.put("G002", "B");
        Guest.put("G003", "C");
        Guest.put("G004", "D");
        Guest.put("G005", "E");
        var scanner = new Scanner(System.in);
        System.out.println("Nhap ma khach hang can tim");
        String ma = scanner.next();
        boolean check = Guest.containsKey(ma);
        if(check)
        {
            String name = Guest.get(ma);
            System.out.println("Ten khach hang la: " + name);
        }
        else{
            System.out.println("Khach hang khong ton tai");
        }
    }
}
