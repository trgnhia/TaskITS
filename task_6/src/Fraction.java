import java.util.Scanner;

public class Fraction {
//    Mục tiêu: Viết lớp Fraction để đại diện cho phân số, với các phương thức add(), subtract(), multiply(), divide().
//    Yêu cầu:
//    Khởi tạo hai phân số và thực hiện các phép tính cơ bản giữa chúng.
    // tim UCLN
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    // tim BCNN
    public static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
    private int Tuso;
    private int Mauso;

    public Fraction(int tuso, int mauso){
        this.Tuso = tuso;
        this.Mauso = mauso;
    }
    //getter
    public int getTuso(){
        return this.Tuso;
    }
    public int getMauso(){
        return this.Mauso;
    }
    //setter
    public void setTuso(int ts){
        this.Tuso = ts;
    }
    public void setMuso(int ms){
        this.Mauso = ms;
    }
// ham rut gon phan so
    public void RutGon(){
        int g = gcd(this.Mauso,this.Tuso);
        this.Tuso /= g;
        this.Mauso/=g;
    }
// pt cong
    public Fraction add(Fraction a, Fraction b){
        a.RutGon();
        b.RutGon();
        Fraction res = new Fraction(1,1);
        int msc = lcm(a.Mauso, b.Mauso);
        res.Tuso = (msc / a.Mauso) * a.Tuso + (msc / b.Mauso) * b.Tuso;
        res.Mauso = msc;
        res.RutGon();
        return res;
    }
//pt tru
    public Fraction subtract(Fraction a, Fraction b){
        a.RutGon();
        b.RutGon();
        Fraction res = new Fraction(1,1);
        int msc = lcm(a.Mauso, b.Mauso);
        res.Tuso = (msc / a.Mauso) * a.Tuso - (msc / b.Mauso) * b.Tuso;
        res.Mauso = msc;
        res.RutGon();
        return res;
    }
// pt nhan
    public Fraction multiply(Fraction a, Fraction b){
        a.RutGon();
        b.RutGon();
        Fraction res = new Fraction(1,1);
        res.Tuso = a.Tuso * b.Tuso;
        res.Mauso = a.Mauso * b.Mauso;
        res.RutGon();
        return res;
    }
// pt chia
    public Fraction divide(Fraction a, Fraction b){
        a.RutGon();
        b.RutGon();
        Fraction res = new Fraction(1,1);
        res.Tuso = a.Tuso * b.Mauso;
        res.Mauso = a.Mauso * b.Tuso;
        res.RutGon();
        return res;
    }

public void Input(Fraction a){
    System.out.println("Tu so: ");
    var scanner = new Scanner(System.in);
    int tu = scanner.nextInt();
    System.out.println("Mau so: ");
    int mau = scanner.nextInt();
    if(mau == 0)
    {
       do{
           System.out.println("Nhap lai mau so khac 0!!");
           mau = scanner.nextInt();
       } while(mau == 0);
    }
    else a.setTuso(tu);a.setMuso(mau);
}
    public static void main(String[] args) {
        int choice;
        int tu,mau;
        var scanner = new Scanner(System.in);
        Fraction a = new Fraction(1,1);
        Fraction b = new Fraction(1,1);
        Fraction res = new Fraction(1,1);
        System.out.println("Nhap phan so a va b");
        a.Input(a);
        b.Input(b);
        do {
            System.out.println("---------*Chon chuc nang*----------");
            System.out.println("0: thoat chuong trinh");
            System.out.println("1: Cong");
            System.out.println("2: tru");
            System.out.println("3: nhan");
            System.out.println("3: chia");
            choice = scanner.nextInt();
            if(choice == 1){
                res = res.add(a,b);
                System.out.println("Tong hai phan so la: "+ res.Tuso + "/" + res.Mauso);
            }
            if(choice == 2){
                res = res.subtract(a,b);
                System.out.println("Hieu hai phan so la: "+ res.Tuso + "/" + res.Mauso);
            }
            if(choice == 3){
                res = res.multiply(a,b);
                System.out.println("Tich hai phan so la: "+ res.Tuso + "/" + res.Mauso);
            }
            if(choice == 4){
                res = res.divide(a,b);
                System.out.println("Thuong hai phan so la: "+ res.Tuso + "/" + res.Mauso);
            }

        } while (choice != 0);
    }
}


