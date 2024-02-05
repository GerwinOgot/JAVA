package myprojects;
class fourACT{
    private int studentnumber;
    private String studentname;
    private int studentage;

    //Getter and Setter methods
    public int getstudentnumber(){
        return studentnumber;
    }

    public String getstudentname(){
        return studentname;
    }

    public int getstudentage(){
        return studentage;
    }
    
    public void setstudentnumber(int newValue){
        studentnumber = newValue;
    }
    
    public void setstudentname(String newValue){
        studentname = newValue;
    }
    
    public void setstudentage(int newValue){
        studentage = newValue;
    }
}
public class encapsulation{
    public static void main(String args[]){
    	fourACT obj = new fourACT();
         obj.setstudentname("Gerwin Jahziel N. Ogot");
         obj.setstudentage(20);
         obj.setstudentnumber(202010110);
         System.out.println("Student Name: " + obj.getstudentname());
         System.out.println("Student Number: " + obj.getstudentnumber());
         System.out.println("Student's Age: " + obj.getstudentage());
    } 
}