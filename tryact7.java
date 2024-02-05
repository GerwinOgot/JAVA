package myprojects;
import java.io.*;
public class tryact7 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int i, first, second, third,fourth = 0,fifth = 0;
		String area = " ";
		 
		int[] array = new int[10];
		String[] strAr = {"NCR","Cavite","Laguna","Rizal","Bulacan"}; 
		
		for( i=0; i<5; i++)  
		{  
		System.out.print(strAr[i]+" CO-VID 19 cases: ");  
		
		array[i]=Integer.parseInt(br.readLine());			
		}  
        third = first = second = Integer.MIN_VALUE;
        for (i = 0; i < 5; i++) {
            if (array[i] > first) {
            	fifth = fourth;
            	fourth = third;
                third = second;
                second = first;
                first = array[i];                
            }
            else if (array[i] > second) {
            	fifth = fourth;
            	fourth = third;
                third = second;
                second = array[i];
                
            }
            else if (array[i] > third) {
            	fifth = fourth;
        		fourth = third;       
                third = array[i];
                
            }
           else if (array[i] > fourth) {
               	fifth = fourth;
                fourth = array[i];                             
           }
        }
        System.out.println("Pinakamakulit ang mga taga " +area+" (" + first+")");
		System.out.println("Medyo makulit ang mga taga "+area +" (" + second+")");
		System.out.println("Makulit ang mga taga " +area+" (" + third+")");
		System.out.println("Bigyan ng ayuda ang mga taga " +area+ " (" +fourth+" , "+fifth+ ")");
    }
}
 
	


