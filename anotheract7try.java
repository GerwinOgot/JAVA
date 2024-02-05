package myprojects;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;  
public class anotheract7try {	
		public void testSortAscendingDescending() throws Exception {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int i; 
		int[] array = new int[10];
		String[] strAr = {"NCR","Cavite","Laguna","Rizal","Bulacan"}; 		
		for( i=0; i<5; i++)  
		{  
		System.out.print(strAr[i]+" CO-VID 19 cases: ");  		
		array[i]=Integer.parseInt(br.readLine());			
		}  		
		 ArrayList<String> cases = new ArrayList<>();  
         cases.add(array[0],"NCR");
         cases.add(array[1],"Cavite");
         cases.add(array[2],"Laguna");
         cases.add(array[3],"Rizal");
         cases.add(array[4],"Bulacan");   
         Collections.sort(cases);  
         for(String counter: cases){
 			System.out.println(counter);
	}
		
}}