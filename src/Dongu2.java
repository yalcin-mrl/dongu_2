import java.util.Scanner;

public class Dongu2 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for(int i =1;i<=num;i++){
            if(i%4==0 && i%5 == 0){
                System.out.println(i);
            }
        }
    }
}
