package inheritance.abstractinterface;

public class Hpprint extends Device implements Connectable {

//Connectalbe �������̽� �߻�޼ҵ屸��
	@Override
	public void connect() {
		System.out.println(Connectable.name+",HP�����͸� �����մϴ�");
		// TODO Auto-generated method stub
		
	}
//Device Ŭ���� �߻�޼ҵ� ���� 
	@Override
	public void print() {
	System.out.println("HP�������Դϴ�");
		// TODO Auto-generated method stub
		
	}
}
