import java.util.*;
class HaMaOne 
{
	public static void main(String[] args) 
	{
		HashMap ha = new HashMap();
		ha.put(111, "Raghu");
		ha.put(222, "Ramu");
		ha.put(333, "Tyson");
		ha.put(444, "Ranjith");
		System.out.println("hashmap ha key-value pairs");
		System.out.println(ha);

		Set x = ha.keySet();
		System.out.println("key objects of hashmap");
		System.out.println(x);

		Collection y = ha.values();
		System.out.println("value objects of hashmap");
		System.out.println(y);

		Set z = ha.entrySet();
		
		Iterator u = z.iterator();
		while (u.hasNext())
		{
			Map.Entry v = (Map.Entry)u.next();
			System.out.println("again key objects of hashmap");
		System.out.println(v);
		}

	}
}
