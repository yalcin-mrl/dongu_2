import java.util.Scanner;

public class Dongu2 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.print("4'ün kuvveetleri: ");
        for(int i=1;i<=num;i*=4){
            System.out.print(i + " ");
        }
        System.out.print("\n5'ün kuvveetleri: ");
        for(int i=1;i<=num;i*=5){
            System.out.print(i + " ");
        }
    }
}
