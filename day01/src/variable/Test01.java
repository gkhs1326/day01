package variable;

public class Test01 {
	public static void main(String[] args) {
		int age = 30;
	    double weight = 55.0 , height = 100.123;
	    //double height = 100.123;
	    System.out.println("나의 나이는"+age+"살 입니다");
	    System.out.println("나의 몸무게는"+weight+"kg");
	    
	    age= 123;
	    //int는 변수를만들때 한번만사용
	    System.out.println("변경 후 "+age+"살 입니다");

	    
	    int number =123;
	    System.out.println("변경 전:"+number);
	    number = 100;
	    System.out.println("변경 후:"+number);
	    number=number + 300;
	    System.out.println("변경 후:"+number);
	}

}
