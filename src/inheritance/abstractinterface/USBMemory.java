package inheritance.abstractinterface;

public class USBMemory extends Device implements Connectable {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println(Connectable.name + ", USB�޸𸮸� �����մϴ�");

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(" �Ｚ USB �޸��Դϴ�");

	}

}
