public class TestMethod{//메소드는 클래스 안에 있어야 함. 
	//메소드를 만들어서 호출하는거
	
	public static void printRepeat(){//메소드 머리(head): void methodname(){}
		//메소드 몸통(body) 기능 동작 적어놓는 부분
		for(int i=0; i<3;i++){
			System.out.println("반복 중~!");
		}
	}
	
	// printHello
	public static void printHello(){//메소드 몸통은 비워져 있어도 괜찮음. 
		int number=10;
		System.out.println("Hello");
		System.out.println("초기화한 변수 값 :"+ number);
		
	}
	
	public static void main(String[] args){ //메인메소드만 읽힘!!
		System.out.println("프로그램 시작~!");
		
		printHello();
		System.out.println("헬로 안에서 초기화한 변수 값 :"+ number);
		
		/*
		for(int i=0; i<2; i++){
			printRepeat();//위에 메소드를 호출하고 있다
		}
		*/
		System.out.println("프로그램 끝~!");
	}
}