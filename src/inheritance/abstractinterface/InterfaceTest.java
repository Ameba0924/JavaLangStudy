package inheritance.abstractinterface;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Device pdev[] = {new Hpprint(), new USBMemory()};

		
		pdev[0].print();
		pdev[1].print();
		((Connectable) pdev[0]).connect(); // connect �޼ҵ� name <-- Connect interface �޼ҵ��̱� ������
		((Connectable) pdev[1]).connect(); // �տ� Connectable �������� ���� ���� 
		// pdev[0].connect(); <--- �Ұ��� 
		// pdev[1].connect(); <--- �Ұ���	���� !!!!	
	
	
	}

}
