import java.util.Collection;
import java.util.Iterator;

import com.google.common.collect.*;

public class guava {

  /**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		final ArrayTable<String, Integer, Object> table = ArrayTable.create(
			    ImmutableList.of("1", "2", "3"), ImmutableList.of(0, 1, 2));
	
	
		table.put("1", 0, "value1");
		table.put("1", 1, "value2");
		table.put("1", 2, "value3");

		table.put("2", 0, "value11");
		table.put("2", 1, "value22");
		table.put("2", 2, "value33");

		table.put("3", 0, "value111");
		table.put("3", 1, "value222");
		table.put("3", 2, "value333");

		
		//System.out.println(table.column(1).values());
		//System.out.println(table.row("1").values());
		
//		System.out.println(table.get("1", 0));
		//for (final Integer columnKey : table.columnKeyList()) {
		//	  System.out.println(table.column(columnKey).values());
//	}

		final Table<String, String, Integer> table_channel = HashBasedTable.create();
		table_channel.put("sony", "Smith", 1);
		table_channel.put("SET MAX", "Smith", 1);
		table_channel.put("DISCOVER", "Jones", 1);
		table_channel.put("sony", "Jones", 115);
	
		final Collection<Integer> bobs = table_channel.row("sony").values();
	
//		while (bobs.iterator().hasNext()) {
//			System.out.println("Amount " + bobs.iterator().next());
//		}
		
		
		Iterator iterator = bobs.iterator();

		// while loop
	while (iterator.hasNext()) {
		System.out.println("value= " + iterator.next());
}
		


		
	//	bobs.
		
	}
}
