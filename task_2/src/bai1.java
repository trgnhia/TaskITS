public class bai1 {
    public static void main(String[] args) {
        System.out.println("Bang cuu chuong phep cong: ");
        for(int i = 1; i <= 10; i++)
        {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " + " +j + " = " + (i+j));
            }
            System.out.println();
        }
        System.out.println("Bang cuu chuong phep tru: ");
        for(int i = 11; i <= 20; i++)
        {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " - " +j + " = " + (i-j));
            }
            System.out.println();
        }
        System.out.println("Bang cuu chuong phep nhan: ");
        for(int i = 1; i <= 10; i++)
        {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " +j + " = " + (i*j));
            }
            System.out.println();
        }
        System.out.println("Bang cuu chuong phep chia: ");
        for(int i = 2; i <= 9; i++)
        {
            for (int j = 2; j <= 10; j++) {
                System.out.println((i*j) + " / " +i + " = " + j);
            }
            System.out.println();
        }
    }
}
