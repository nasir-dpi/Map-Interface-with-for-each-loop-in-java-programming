import java.util.HashMap;
import java.util.Map;

public class StartUP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <Integer, String> a =new HashMap<Integer, String>();
		a.put(10, "Something");
		a.put(7, "doing");
		a.put(11,"different");
		System.out.println(a);
		System.out.println();
		System.out.println(a.get(11));
		System.out.println();
		System.out.println(a.values());
		System.out.println();
		
		for(Map.Entry<Integer, String>i : a.entrySet()) {
			System.out.println(i.getKey());
			System.out.println();
			//System.out.println(i.getValue());
			System.out.println();
			//System.out.println(i.getKey()+" "+i.getValue());

		}
	}

}
