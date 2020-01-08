class SumThread  implements Runnable{
	private int end;
	
	public SumThread(int end) { // 인자값을 가지는 스레드 생성자 생성 
		this.end = end;
		}
	
	public void run() {  // 스레드가 동작되는 메소드 run()
		int sum = 0;
		for(int i =1; i<= this.end; i++) {
			sum += i;
			System.out.print("현재 스레드 수: " + Thread.activeCount());
			System.out.print(", " + Thread.currentThread().getName());
			System.out.printf(": sum(1:%d) = %d %n" , i , sum);
		}
	}
	
	public static void main(String args[]) {
		//main 스레드가 main() 메소드를 호출하므로 이 부분에도 스레드가 이미 실행됨++++주의 
		
		System.out.print("main 스레드 ID : ");
		System.out.print(Thread.currentThread().getId());
		System.out.print(", 현재 스레드 수: ");
		System.out.print(Thread.activeCount());
		System.out.print(", 현재 스레드 이름: ");
		System.out.println(Thread.currentThread().getName());
		
		//직접 구현한 스레드를 실행 
		Runnable r = new SumThread(9);
		Thread th1 = new Thread(r);
		th1.start(); // 스레드시작 
	}
}
