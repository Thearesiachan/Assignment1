package fibonacci;
import java.util.Scanner;
public class Exercise1 {
	Scanner input = new Scanner(System.in);
	System.out.println("Nhap vao mot so n:");
	int n = input.nextInt();
	System.out.println("Cac so nguyen to truoc"+n+"la:");
	
	for(int i = 0; i<n;i++){
	System.out.println(i);
	}
}
