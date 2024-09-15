import java.util.Scanner;

public class BankAccount {

//    Mục tiêu: Tạo lớp BankAccount với các thuộc tính accountNumber, balance và các phương thức deposit(), withdraw().
//    Yêu cầu:
//    Viết chương trình mô phỏng việc gửi tiền, rút tiền và kiểm tra số dư tài khoản.
    private String accountNumber;
    private Double balance;

    //constructor
    public BankAccount(String accountNumber, Double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    //getter

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public Double getBalance(){
        return this.balance;
    }

    //setter
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance (double balance){
        this.balance = balance;
    }

    //pt gui tien

    public void deposit(Double money){
        if(money >0 ){
            this.balance += money;
            System.out.println("Da them " + money + " vao tai khoan!!");
        }
        else{
            System.out.println("So tien them phai lon hon 0!");
        }
    }
    // phuong thuc rut tien
    public void withdraw(Double money){
        if(money > this.balance) {
            System.out.println("khong the rut qua han muc so du");
        }else if(money <= 0){
            System.out.println("Khong the rut so nho hon 0!");
        }
        else{
            this.balance-= money;
            System.out.println("Ban da rut: "+ money + " thanh cong");
        }
    }
    // pt hien thi
    public void Hienthi(){
        System.out.println("So du tai khoan cua ban hien co la: "+ this.balance);
    }

    public static void main(String[] args) {
        BankAccount MBBank = new BankAccount("TRNGHIA157", 1200000.0);
        var scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("---------*Chon chuc nang*----------");
            System.out.println("0: thoat chuong trinh");
            System.out.println("1: gui tien");
            System.out.println("2: rut tien");
            System.out.println("3: xem so du");
            choice = scanner.nextInt();
            Double money;
            if(choice == 1)
            {
                System.out.println("Nhap so tien muon gui: ");
                money = scanner.nextDouble();
                MBBank.deposit(money);
            }
            else if(choice == 2){
                System.out.println("Nhap so tien muon rut: ");
                money = scanner.nextDouble();
                MBBank.withdraw(money);
            }
            else{
                MBBank.Hienthi();
            }
        }while(choice != 0);
    }

}
