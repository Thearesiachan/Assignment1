package fibonacci;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        int t1 = 0, t2 = 1;
        System.out.println("Nhap so cac chu so:");
        int n = input.nextInt();
        System.out.print("Tong"+ n + " so dau tien: ");
        for (int i = 1; i <= n; ++i){
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;	
        }
    }
}