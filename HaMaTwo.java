import java.util.*;
class HaMaTwo 
{
	public static void main(String[] args) 
	{
		HashMap hb = new HashMap();
		hb.put(123456, "Shourya");
		hb.put(234561, "Shourya Sibling");

		HashMap hc = new HashMap(hb);
		hc.put(345612, "Sreeja");
		hc.put(456123, "Anvita");

		System.out.println(hc);
	}
}
