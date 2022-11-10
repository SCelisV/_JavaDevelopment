/**
 * 
 */
package Collections;

import java.util.List;

/**
 * @author hadoop
 *
 */
public class Problem {
	
	private Data data;
	private Task task;
	private Order order;
	private Decision decision;

	public static Decision Problem(Data data, Order order, Task task){
		this.data = data;
		this.task = task;
		this.order = order;
		
		
		return decision;
	}
		


    // Este método recibe objetos de tipo Data, pero también subtipos de este, por ejemplo 	ValuesWithDuplicates, ValuesWithoutDuplicates, KeyValuePair
    static void build(Data datas){
        System.out.println("Construyendo un nuevo... " + datas.toString());
    }
    // Este método recibe una lista de Data como argumento, esta lista PROVIDES DATA se usa INSIDE the method = INVARIABLE = EXTENDS
    // List<? extends: means now pass in list of any type that extends the Data class
    static void printDatas(List<? extends Data> datas){
        for (int i = 0; i < datas.size(); i++){
            System.out.println(i + 1 + ": " +  datas.get(i).toString() + " " + (i+1));
        }
    }

	public static void main(String[] args) {

		// Creo los objetos
	
		Data data = new Data();
		ValuesWithDuplicates valuesWithDuplicates = new ValuesWithDuplicates();
		ValuesWithoutDuplicates valuesWithoutDuplicates = new ValuesWithoutDuplicates();
		KeyValuePair keyValuePair = new KeyValuePair();
		
		build(data);
		build(valuesWithDuplicates);
		build(valuesWithoutDuplicates);
		build(keyValuePair);
		
		
		Order order = new Order();
		build(order);
		InsertionOrdering insertionOrdering = new InsertionOrdering();
		SortedOrdering sortedOrdering = new SortedOrdering();
		AnyOrdering anyOrdering = new AnyOrdering();
		Task task = new Task();
		AnyTask anyTask = new AnyTask();
		SearchAndRemove searchAndRemove = new SearchAndRemove();
		Decision decision = new Decision();
		TreeMap treeMap = new TreeMap();
		LinkedHashMap linkedHashMap = new LinkedHashMap();
		HashMap hashMap = new HashMap();
		ArrayList arrayList = new ArrayList();
		LinkedHashSet linkedHashSet = new LinkedHashSet();
		TreeSet treeSet = new TreeSet();
		HashSet hashSet = new HashSet();
		
		
		
		
		
		
		
		
		
		

	}

}
