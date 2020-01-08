class SumThread  implements Runnable{
	private int end;
	
	public SumThread(int end) { // ���ڰ��� ������ ������ ������ ���� 
		this.end = end;
		}
	
	public void run() {  // �����尡 ���۵Ǵ� �޼ҵ� run()
		int sum = 0;
		for(int i =1; i<= this.end; i++) {
			sum += i;
			System.out.print("���� ������ ��: " + Thread.activeCount());
			System.out.print(", " + Thread.currentThread().getName());
			System.out.printf(": sum(1:%d) = %d %n" , i , sum);
		}
	}
	
	public static void main(String args[]) {
		//main �����尡 main() �޼ҵ带 ȣ���ϹǷ� �� �κп��� �����尡 �̹� �����++++���� 
		
		System.out.print("main ������ ID : ");
		System.out.print(Thread.currentThread().getId());
		System.out.print(", ���� ������ ��: ");
		System.out.print(Thread.activeCount());
		System.out.print(", ���� ������ �̸�: ");
		System.out.println(Thread.currentThread().getName());
		
		//���� ������ �����带 ���� 
		Runnable r = new SumThread(9);
		Thread th1 = new Thread(r);
		th1.start(); // ��������� 
	}
}
