import java.io.*;
import java.util.Scanner;

//Mục tiêu: Tạo chương trình quản lý thông tin sách, cho phép người dùng nhập thông tin và lưu vào file.
//Yêu cầu:
//Thông tin bao gồm tên sách, tác giả, năm xuất bản.
//Sử dụng FileWriter để lưu thông tin vào file.


public class bai1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Nhap ten sach: ");
        String name = scanner.nextLine();
        System.out.println("Nhap ten tac gia: ");
        String author = scanner.nextLine();
        System.out.println("Nhap nam xuat ban: ");
        int date = scanner.nextInt();
        // ghi dữ liệu vào file
        try {
            // Đường dẫn đc chỉ định bằng cách sử dụng hai dấu '\\' để thoát ký tự '\'
            FileWriter fw = new FileWriter("D:\\java\\theory\\Task_5\\src\\test.txt",true);
            // append để thêm dữ liệu vào file. nếu 0 có thì moi lần chạy sẽ vt lại file từ đầu
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(String.format("Ten sach: %s\n Ten tac gia: %s\n Nam xuat ban: %d\n",name,author,date ));

            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //đọc dữ liệu vào file
        try{
            FileReader fr = new FileReader("D:\\java\\theory\\Task_5\\src\\test.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            StringBuilder check = new StringBuilder();
            while ((line = br.readLine()) != null) {
                check.append(line);
                System.out.println(line);
            }
            if(check.length() == 0)
            {
                System.out.println("File khong co du lieu");
            }
            br.close();  // Đóng BufferedReader sau khi đọc xong
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
