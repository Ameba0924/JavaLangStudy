

class IncThread extends Thread {
		
		public IncThread(String name) {
			setName(name);
			
		}
		public void run() {
		
System.out.println(getName()+" : " +activeCount() );
		}
	
	public static void main(String[] args) {
		
		IncThread inc = new IncThread("¾È³ç");
		inc.start();
		
		

	}

}
