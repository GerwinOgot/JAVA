package myprojects;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;
public class array {	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int i; 
		int[] array = new int[10];
		String[] strAr = {"NCR","Cavite","Laguna","Rizal","Bulacan"}; 		
		for( i=0; i<5; i++)  
		{  
		System.out.print(strAr[i]+" CO-VID 19 cases: ");  		
		array[i]=Integer.parseInt(br.readLine());			
		}  
        HashMap<String, Integer> cases = new HashMap<String, Integer>();
         cases.put("NCR",array[0]);
         cases.put("Cavite",array[1]);
         cases.put("Laguna",array[2]);
         cases.put("Rizal",array[3]);
         cases.put("Bulacan",array[4]);
         LinkedHashMap<String, Integer> sort = new LinkedHashMap<>();
         cases.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                 .forEachOrdered(x -> sort.put(x.getKey(), x.getValue()));   
         System.out.println("Reverse Sorted Map   : " + sort);
	}
}