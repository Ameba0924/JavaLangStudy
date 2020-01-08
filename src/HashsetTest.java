import java.util.HashSet;
import java.util.Iterator;

public class HashsetTest {

	public static void main(String[] args) {
	HashSet<Integer> setA = new HashSet<Integer>();
	HashSet<Integer> setB = new HashSet<Integer>();
	
	setA.add(3); setA.add(5); setA.add(7);
	setA.add(8); setA.add(7); setA.add(9);
	System.out.print("A = ");
	print(setA);
	System.out.println("    A = " +setA);
	
	setB.add(5); setB.add(3); setB.add(2);
	System.out.print("B =");
	print(setB);
	System.out.println("    B= " +setB);
	
	boolean isChanged = setA.removeAll(setB);
	System.out.print("          A - B =");
	if(isChanged) System.out.println(setA);

	}
	public static void print(HashSet<Integer> s) {
		Iterator<Integer> i = s.iterator();
		while ( i.hasNext()) {
			System.out.print(i.next()+ " ");
		}
	}

}