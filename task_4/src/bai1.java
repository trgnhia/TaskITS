import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bai1 {
//    Mục tiêu: Sử dụng ArrayList để quản lý danh sách sách trong thư viện, cho phép thêm, sửa, xóa và tìm kiếm sách.
//    Yêu cầu:
//    Quản lý thông tin của các sách bằng cách lưu trữ trong ArrayList.
    public static void main(String[] args) {
        ArrayList <String> Books = new ArrayList<>();
        // them cac gia tri cho list
        Collections.addAll(Books, "A1", "A0", "B0", "B1", "B2","C3");
        var scanner = new Scanner(System.in);
        String nameBook;
        int choice;
        do{
            System.out.println("----------*VUI LONG CHON CHUC NANG*----------");
            System.out.println("0:Thoat chuong trinh");
            System.out.println("1:Them sach trong thu vien");
            System.out.println("2:Sua sach trong thu vien");
            System.out.println("3:Xoa sach trong thu vien");
            System.out.println("4:Tim kiem sach trong thu vien");
            System.out.println("5:Hien thi tat ca sach trong thu vien");
            System.out.println("6:Hien thi so loai sach trong thu vien");
            choice = scanner.nextInt();

            //Them
            if(choice == 1){
                System.out.println("Nhap ten sach can them: ");
                nameBook = scanner.next();
                Books.add(nameBook);
                System.out.println("Them sach thanh cong!!\n");
            }

            //Sua
            if(choice == 2){
                System.out.println("Nhap ten sach muon sua: ");
                nameBook = scanner.next();
                if(Books.contains(nameBook))
                {
                    System.out.println("Nhap ten sach moi: ");
                    String newName = scanner.next();
                    int index = Books.indexOf(nameBook);
                    Books.set(index,newName);
                    System.out.println("Sua thanh cong!!\n");
                }
                else{
                    System.out.println("Ten sach khong hop le!\n");
                }
            }


            //Xoa
            if(choice == 3){
                System.out.println("Nhap ten sach can xoa: ");
                nameBook = scanner.next();
                if(Books.contains(nameBook)){
                    Books.remove(nameBook);
                    System.out.println("Da xoa thanh cong sach!\n");
                }
                else {
                    System.out.println("Sach khong ton tai trong thu vien\n");
                }
            }

            //Tim kiem
            if(choice == 4)
            {
                System.out.println("Nhap ten sach can tim: ");
                nameBook = scanner.next();
                if(Books.contains(nameBook)){
                    System.out.println("Sach ton tai trong thu vien\n");
                }
                else{
                    System.out.println("Sach khong ton tai trong thu vien\n");
                }
            }
            //Hien thi
            if(choice == 5)
            {
                System.out.println("Tat ca sach co trong thu vien la: ");
                for(String book : Books)
                {
                    System.out.printf("%s ", book);
                }
                System.out.println("\n");
            }

            if(choice == 6)
            {
                System.out.println("So sach trong thu vien la: " + Books.size() + "\n");
            }


        }while(choice > 0 && choice <=6);
    }
}
