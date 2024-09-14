import java.util.Scanner;

public class bubble_sort {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu trong mang: ");
        int n = scanner.nextInt();
        int[] numbers = getNumbers(n, scanner);
        bubbleSort(numbers,n);
        showArr(numbers);
    }

    private static void bubbleSort(int[] numbers,int n) {
        for(int i = 0; i < n-1; i++)
        {
            for(int j = i+1; j < n; j++){
                if(numbers[i] > numbers[j]){
                    int x = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = x;
                }
            }
        }
    }

    private static void showArr(int[] numbers) {
        System.out.println("Cac phan tu cua mang sau khi sap xep la: ");
        for(int x : numbers)
        {
            System.out.printf("%d ",x);
        }
    }

    private static int[] getNumbers(int n, Scanner scanner) {
        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = scanner.nextInt();
        }
        return number;
    }

}
