package scanner;

//import: 특정기능을 가져온다
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		
		System.out.println("문자열 입력:");
		String str = input.next();
		System.out.println("입력 받은 값:"+str);
		
		int num;
		System.out.println("수 입력 :");
		num = input.nextInt();
		System.out.println("입력 수:"+num);
		double dou = input.nextDouble();
		System.out.println("입력 수 :"+dou);
		
				
		
	}

}
