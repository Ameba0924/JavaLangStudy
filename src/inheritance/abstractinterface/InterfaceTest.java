package inheritance.abstractinterface;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Device pdev[] = {new Hpprint(), new USBMemory()};

		
		pdev[0].print();
		pdev[1].print();
		((Connectable) pdev[0]).connect(); // connect 메소드 name <-- Connect interface 메소드이기 때문에
		((Connectable) pdev[1]).connect(); // 앞에 Connectable 사용해줘야 실행 가능 
		// pdev[0].connect(); <--- 불가능 
		// pdev[1].connect(); <--- 불가능	질문 !!!!	
	
	
	}

}
