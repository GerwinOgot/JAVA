package myprojects;
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
public class ACTIVITY_7 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int num,num1,num2,num3,num4, g=0;
		System.out.print("NCR CO-VID 19 cases: ");
		 num = Integer.parseInt(br.readLine());
		System.out.print("Cavite CO-VID 19 cases: ");
		 num1 = Integer.parseInt(br.readLine());
		System.out.print("Laguna CO-VID 19 cases: ");
		 num2 = Integer.parseInt(br.readLine());
		System.out.print("Rizal CO-VID 19 cases: ");
		 num3 = Integer.parseInt(br.readLine());
		System.out.print("Bulacan CO-VID 19 cases: ");
		 num4 = Integer.parseInt(br.readLine());		 
		 sevenact obj = new sevenact("NCR",num);
		 sevenact obj1 = new sevenact("Cavite",num1);
		 sevenact obj2 = new sevenact("Laguna",num2);
		 sevenact obj3 = new sevenact("Rizal",num3);
		 sevenact obj4 = new sevenact("Bulacan",num4);		 
		 sevenact [] Act7 = new sevenact [5];
		 Act7 [0] = obj;
		 Act7 [1] = obj1;
		 Act7 [2] = obj2;
		 Act7 [3] = obj3;
		 Act7 [4] = obj4;		 
			 Integer[]let = new Integer[5];
	         let[0]=num;
	         let[1]=num1;
	         let[2]=num2;
	         let[3]=num3;
	         let[4]=num4;
	         Arrays.sort(let, Comparator.reverseOrder());
	         Arrays.sort(Act7, Comparator.reverseOrder());
	         if(let[0]==let[1]) {
					System.out.print("Pinaka Makulit ang mga taga: "+""+Act7[g]);
					g++;
					System.out.println(","+Act7[g]);
					g++;
				}
	         	else if(let[0]==let[1]&&let[0]==let[2]) {
	         			System.out.println("Pinaka Makulit ang mga taga: "+""+Act7[g]);
	         			g++;
	         			System.out.println(","+Act7[g]);
	         			g++;
	         			System.out.println(","+Act7[g]);
	         			g++;
	         		}
	         else {
					System.out.println("Pinaka Makulit ang mga taga: "+""+Act7[g]);
					g++;
				}
				 
	         if(let [1] != let[0] && let[1]==let[2]) {
					System.out.print("Medyo Makulit ang mga taga: "+""+Act7[g]);
					g++;
					System.out.println(","+Act7[g]);
					g++;				
				}	         
	         else {
	        	 	System.out.println("Medyo Makulit ang mga taga: "+""+Act7[g]);
					g++;}				
			 if(let[1] != let[2] && let[2]==let[3]) {
					System.out.println("Makulit ang mga taga: "+""+Act7[g]);
					g++;
					System.out.println(","+Act7[g]);
					g++;
				}
			 else {
				 	System.out.println("Makulit ang mga taga: "+""+Act7[g]);
				 	g++;
				}
			 if(let[0]==let[1]&& let[3]==let[4]) {
					System.out.print(","+Act7[g]);
				}				
			 if (let[0]==let[1]&&let[1]==let[2]){
					System.out.println("Bigyan ng ayuda ang mga taga: "+"");
				}
			 	else if(let[0]==let[1]&& let[2]==let[3]) {
			 			System.out.println("Bigyan ng ayuda ang mga taga: "+"");
			 		}
			 	else if(let[0]==let[1]&& let[3]==let[4]) {
			 			System.out.println("Bigyan ng ayuda ang mga taga: "+"");
			 		}
			 	else if(let[0]==let[1]&&let[1]!=let[2]&& let[2]!=let[3]&&let[3]!=let[4]) {					
			 			System.out.println("Bigyan ng ayuda ang mga taga: "+""+Act7[g]);		
			 		}
			 	else if(let[0]!=let[1]&&let[1]==let[2]&& let[2]!=let[3]&&let[3]!=let[4]) {					
			 			System.out.println("Bigyan ng ayuda ang mga taga: "+""+Act7[g]);
			 		}
			 	else if(let[0]!=let[1]&&let[1]!=let[2]&& let[2]==let[3]&&let[3]!=let[4]) {					
			 			System.out.println("Bigyan ng ayuda ang mga taga: "+""+Act7[g]);
			 		}
			 	else if(let[0]!=let[1]&&let[1]!=let[2]&& let[2]!=let[3]&&let[3]==let[4]) {					
			 			System.out.println("Bigyan ng ayuda ang mga taga: "+""+Act7[g]);
			 		}
			 else {					
					System.out.print("Bigyan ng ayuda ang mga taga: "+""+Act7[g]);
					g++;
					System.out.print(", "+Act7[g]);
				}
		}
}
class sevenact implements Comparable <sevenact>{
	private int numbers;
	private String area;
	public int getPlaces() {
		return numbers;
	}
	public void setPlaces(int places) {
		this.numbers = places;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {       
		this.area = area;
	}
	public String toString() {
		return    area + "(" + numbers +")" ;
		}		
	public sevenact(String area, int numbers) {
		super();
		this.numbers = numbers;
		this.area = area;
	}
	public int compareTo(sevenact arg0) {
		// TODO Auto-generated method stub
		return this.numbers - arg0.numbers;
	}	
}