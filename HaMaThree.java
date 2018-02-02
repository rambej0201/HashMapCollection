import java.util.*;
class HaMaThree 
{
	public static void main(String[] args) 
	{
		HashMap<Emp, Student> hd = new HashMap<Emp, Student>();
		hd.put(new Emp(111, "Bhagavan"), new Student(1, "Santosh"));
		hd.put(new Emp(222, "Padmanabam"), new Student(2, "Prabhakar"));

		Set x = hd.entrySet();

		Iterator y = x.iterator();
		while (y.hasNext())
		{
			Map.Entry m = (Map.Entry)y.next();

			Emp a = (Emp)m.getKey();
			System.out.println(a.eid+"---"+a.ename);

			Student b = (Student)m.getValue();
			System.out.println(b.sid+"---"+b.sname);
		}
		
	}
}
