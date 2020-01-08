
public class PrintChar2 extends Thread {
	
	public PrintChar2(String name) {
		super(name);
	}
	
	public void run() {
		System.out.print(getName() + ": ");
		for(char ch = 'g'; ch<='m'; ch++) {
			System.out.printf("%c",ch);
			
		}
	System.out.println();
	}
	

	public static void main(String[] args) {
		PrintChar2 pc = new PrintChar2("현호 스레드1");
		PrintChar2 pc2 = new PrintChar2("현호 스레드2");
		pc.start();
		pc2.start();
	}

}
