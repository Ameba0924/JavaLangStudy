
public class WrapperCharacter {

	public static void main(String[] args) {
		Character ch ='@';
	//Character ch = new Character('@');
		
		System.out.println(ch + " ");
		System.out.println(ch.charValue()+" ");
		System.out.println(ch.toString());
		System.out.println(ch.compareTo('@'));
		System.out.println(ch.hashCode());
		System.out.println();
		
		//정적메소드
		System.out.println(Character.toUpperCase('d'));
		System.out.println(Character.toLowerCase('D'));
		System.out.println(Character.getName('@'));
		System.out.println(Character.getName('^'));
		System.out.println(Character.isDigit('$'));
		System.out.println(Character.isDigit('5'));
		
		
	}

}
