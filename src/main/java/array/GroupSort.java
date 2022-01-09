package array;

import java.util.function.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Persistent
 * @author vishr
 *
 */
public class GroupSort {

	public static void main(String[] args) {

		List<Integer> inData = Arrays.asList(2,2,1,2);
		List<List<Integer>> outData = groupSet(inData);
		System.out.println(outData);
	}

	private static List<List<Integer>> groupSet(List<Integer> inData) {

		List<List<Integer>> oData = new ArrayList<>();
        Map<Integer, Long> frequencyMap = inData.stream()
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));
        
        
     //   List<Entry<Integer,Integer>> entryList = new ArrayList<>(map.entrySet());
     //   entryList.sort(Entry.comparingByValue(Comparator.reverseOrder()));
/*
        List<Entry<K,V>> sortedEntries = new ArrayList<Entry<K,V>>(map.entrySet());

        Collections.sort(sortedEntries, 
                new Comparator<Entry<K,V>>() {
                    @Override
                    public int compare(Entry<K,V> e1, Entry<K,V> e2) {
                        return e2.getValue().compareTo(e1.getValue());
                    }
                }
        );
*/
    

        Map<Integer, Long> reverseSortedMap = new LinkedHashMap<>();

        frequencyMap.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) 
        .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
        
        
        
        for(int a : reverseSortedMap.keySet()) {
        	List<Integer> aData = new ArrayList<Integer>();
        	aData.add(a);
        	aData.add(frequencyMap.get(a).intValue());
        	oData.add(aData);
        }
        
		
		return oData;
	}

}
