package lambda;

public class lambdaEx1 {

	public static void main(String[] args) {
		//인터페이스의 객체를 생성하기 위해 구현 클래스 ClassA를 추가후, 
		//ClassA를 이용하여 인스턴스를 생성
		InterfaceA ia1 =  new ClassA();
		ia1.print();
		
		
		//익명 클래스를 추가해서 인스턴스를 생성
		InterfaceA ia2 =new InterfaceA() {

			@Override
			public void print() {
				System.out.println("안녕하세요.");
			
			}
		};
		ia2.print();
		//람다식을 이용하여 익명 클래스를 추가한 후, 인스턴스를 생성
		InterfaceA ia3 = ()->{
			System.out.println("안녕하세요.");
		};
		
		ia3.print(); 
		
		
}
	
}
interface InterfaceA{
	
	void print();
	
}

class ClassA implements InterfaceA{

	@Override
	public void print() {
		System.out.println("안녕하세요.");
	}
	
	
}