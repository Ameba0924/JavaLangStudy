package emulation;

public class EnumTest {
	public enum pl {c,cpp,java,csharp};
	
	

	public static void main(String[] args) {
		pl clang = pl.c; // enum ������ ���Ǹ��ϸ� �ٷ� ����� ����ó�� ����Ҽ��ִ�. ���ڿ� ����� ����  
		System.out.println(clang);
		
		clang = pl.csharp;
		switch(clang) {
		case csharp:
			System.out.println(clang + " : C# ��� " );
		}
		
		for(pl p : pl.values())
			System.out.println(p+" ");
			System.out.println()
			;

	}

}
