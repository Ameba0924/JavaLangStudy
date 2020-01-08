package inheritance.abstractinterface;

public class Hpprint extends Device implements Connectable {

//Connectalbe 인터페이스 추상메소드구현
	@Override
	public void connect() {
		System.out.println(Connectable.name+",HP프린터를 연결합니다");
		// TODO Auto-generated method stub
		
	}
//Device 클래스 추상메소드 구현 
	@Override
	public void print() {
	System.out.println("HP프린터입니다");
		// TODO Auto-generated method stub
		
	}
}
