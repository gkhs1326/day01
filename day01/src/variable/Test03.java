package variable;

public class Test03 {
	public static void main(String[] args) {
		/*
		 형변환 ( type casting )
		 -강제 형변환: 강제로 자료형을 변경
		 -자동 형변환: 프로그램에서 자동으로 자료형 변경
		 */
		int num = 0;
		char ch= 'A';
		System.out.println("변경 전 num:"+num);
		num = ch; //자동 형변환 
		System.out.println("변경 후 num:"+num);
		//ch = num; (x) int 4byte char 2byte 큰공간에 작은공간을넣을수있고 작은공간에 큰공간을넣을수없다
		//강제 형변환: 앞쪽에다가 자료형 부여
		char ch2 = (char)num;
		System.out.println("ch2:"+ ch2);
		System.out.println("ch2:"+ (int)ch2);
		
		double dou =1.123; //실수값은 기본8byte로 인식  double = 8byte float 4byte
		//float f1 = 1.234;  4byte므로 형변환을해야한다
		float f1 = (float)1.234;
		float f12 = 1.234f; 
		
		final String KOREA = "대한민국"; //final:해당하는 변수 값 변경 불가능. 가능한대문자로만든다.
		System.out.println("변경 전:"+KOREA);
		//korea = "미국";
		System.out.println("변경 후:"+KOREA);
	}

}
