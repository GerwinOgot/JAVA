package myprojects;

import java.util.*;

class eexample
{
    void output(int num)
    {
        System.out.println(num);
    }
    
    void output(String num)
    {
        System.out.println(num);
    }
    
    void output(int num, int num2)
    {
        System.out.println(num + num2);
    }
    
    void output(int num, String msg)
    {
        System.out.println(num + msg);
    }
    
    void output(String msg, int num)
    {
        System.out.println(msg + num);
    }
    
    int output(int num1, int num2, int num3)
    {
        return num1 * num2 * num3;
    }
}

class eexamplee extends eexample
{
    int output(int num1, int num2, int num3)
    {
        return num1 + num2 + num3; 
    }
}

public class example
{
	public static void main(String[] args) {
	    /*int product;
		Example e = new Example();
		e.output(7);
		e.output("13");
		e.output(8, 10);
		e.output(60, " is even");
		e.output("Odd : ", 13);
		product = e.output(50, 12, 6);
		System.out.println("The product is : " + product);*/
		
		int sum;
		eexamplee e2 = new eexamplee();
		e2.output(7);
		e2.output("13");
		e2.output(8, 10);
		sum = e2.output(12, 2, 15);
		System.out.println("The sum is : " + sum);
	}
}