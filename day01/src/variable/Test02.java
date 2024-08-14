package variable;

public class Test02 {
	public static void main(String[] args) {
    //파일명바꾸기: 파일클릭후 f2, 직접적으로 변경x 
    //char:2byte 크기의 문자하나 저장
    //char는 작은 따옴표로 묶어야한다
	  char ch = 'A';
	//String은 큰 따옴표로 묶어야한다 문자열(하나 여러개 모두가능)  
	  String str = "A";
	  int num = 5;
	  System.out.println(ch);
	  System.out.println(str);
	  System.out.println(num);
	  
	  int result=0;
	  System.out.println(result+10);
	  
	  //문자하나는 숫자로 처리한다 A=65 아스키도표 참고
	  result = ch + num;
	  System.out.println("연산 후:"+result);
	  
			  
	}

}
