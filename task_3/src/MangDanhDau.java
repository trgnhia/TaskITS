import java.util.Scanner;

public class MangDanhDau {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Nhap xau ki tu: ");
        String input = scanner.next();
        int[] cnt = new int[1000001];
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            cnt[c] +=1;
        }
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(cnt[c] != 0) // tranh in 1 ki tu nhieu lan
            {
                System.out.println(c + " : "+ cnt[c]);
            }
            cnt[c] = 0;
        }
    }
}
