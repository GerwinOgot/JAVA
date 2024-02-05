package myprojects;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class trydis {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int first , second, third;
		String area = " ";
		String area1 = " ";
		String area2 = " ";
		String area3 = " ";
		String area4 = " ";


		System.out.print("NCR CO-VID 19 cases: ");
		int num = Integer.parseInt(br.readLine());
		System.out.print("Cavite CO-VID 19 cases: ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("Laguna CO-VID 19 cases: ");
		int num2 = Integer.parseInt(br.readLine());
		System.out.print("Rizal CO-VID 19 cases: ");
		int num3 = Integer.parseInt(br.readLine());
		System.out.print("Bulacan CO-VID 19 cases: ");
		int num4 = Integer.parseInt(br.readLine());
		first = second = third = Integer.MIN_VALUE;
		for (int i = 0; i < 5; ++i) {
                if (num > first) 
                    third = second;
                    second = first;
                    first = num;	
				if (num1 > first) 
	                third = second;
	                second = first;
	                first = num1;
				if (num2 > first) 
	                third = second;
	                second = first;
	                first = num2;     	     
				if (num3 > first) 
	                third = second;
	                second = first;
	                first = num3;		       
				if (num4 > first) 
	                third = second;
	                second = first;
	                first = num4;
			
        }
            
			
		System.out.println("Highest integer is " +area+" (" + first+")");
		System.out.println("2nd Highest integer is " +area+" (" + second+")");
		System.out.println("3rd Highest integer is " +area+" (" + third+")");
		System.out.println("2nd Lowest integer is " +area+" ("+ ")");
		System.out.println("Lowest integer is " +area1+" ("+ ")");
	}}
	

	

	
	



