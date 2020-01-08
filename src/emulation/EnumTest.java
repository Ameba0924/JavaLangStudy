package emulation;

public class EnumTest {
	public enum pl {c,cpp,java,csharp};
	
	

	public static void main(String[] args) {
		pl clang = pl.c; // enum 열거형 정의를하면 바로 상수를 변수처럼 사용할수있다. 문자열 상수를 생성  
		System.out.println(clang);
		
		clang = pl.csharp;
		switch(clang) {
		case csharp:
			System.out.println(clang + " : C# 언어 " );
		}
		
		for(pl p : pl.values())
			System.out.println(p+" ");
			System.out.println()
			;

	}

}
