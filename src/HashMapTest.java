import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("���ѹα�", "����");
		hm.put("�߱�","�ϰ�");
		hm.put("�Ϻ�","����");
		
		hm.put("�±�","����");	 		
		hm.put("�߱�","�ϰ�");

		System.out.print("Ű : " + hm.keySet());
		System.out.println(" �� : " + hm.values());
		
		Iterator<String> keys = hm.keySet().iterator();
		while (keys.hasNext()) {
		String key = keys.next();
		String value = hm.get(key);
		System.out.println(key + " : " + value);
		}
		}

}
