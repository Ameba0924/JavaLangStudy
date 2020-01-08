package inheritance.abstractinterface;

public class USBMemory extends Device implements Connectable {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println(Connectable.name + ", USB메모리를 연결합니다");

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(" 삼성 USB 메모리입니다");

	}

}
