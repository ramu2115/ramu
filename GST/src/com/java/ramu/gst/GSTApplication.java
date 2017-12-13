/*package com.java.ramu.gst;

import java.util.Scanner;

public class GSTApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter an Amount");
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int amount = sc.nextInt();
		
		
		int GST = (int) (amount * 0.18);
		
		System.out.println("The value of GST:"+ GST);
		
		int totalAmount = amount + GST;
		
		System.out.println("Total Amount:"+ totalAmount);

	}

}
*/
// Java code to explain how to generate random
// password
 
// Here we are using random() method of util
// class in Java

package com.java.ramu.gst;
/*import java.util.*;
 
public class GSTApplication
{
    public static void main(String[] args)
    {
        // Length of your password as I have choose
        // here to be 8
        int length = 10;
        System.out.println(geek_Password(length));
    }
 
    // This our Password generating method
    // We have use static here, so that we not to
    // make any object for it
    static char[] geek_Password(int len)
    {
        System.out.println("Generating password using random() : ");
        System.out.print("Your new password is : ");
 
        // A strong password has Cap_chars, Lower_chars,
        // numeric value and symbols. So we are using all of
        // them to generate our password
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
                String symbols = "!@#$%^&*_=+-/.?<>)";
 
 
        String values = Capital_chars + Small_chars +
                        numbers + symbols;
 
        // Using random method
        Random rndm_method = new Random();
 
        char[] password = new char[len];
 
        for (int i = 0; i < len; i++)
        {
            // Use of charAt() method : to get character value
            // Use of nextInt() as it is scanning the value as int
            password[i] =
              values.charAt(rndm_method.nextInt(values.length()));
 
        }
        return password;
    }
}*/

/*import java.util.*;

public class GSTApplication
{
    static char[] OTP(int len)
    {
        System.out.println("Generating OTP using random() : ");
        System.out.print("You OTP is : ");
 
        // Using numeric values
        String numbers = "0123456789";
 
        // Using random method
        Random rndm_method = new Random();
 
        char[] otp = new char[len];
 
        for (int i = 0; i < len; i++)
        {
            // Use of charAt() method : to get character value
            // Use of nextInt() as it is scanning the value as int
            otp[i] =
             numbers.charAt(rndm_method.nextInt(numbers.length()));
        }
        return otp;
    }
    public static void main(String[] args)
    {
        int length = 4;
        System.out.println(OTP(length));
    }
}*/



import java.util.Scanner;

public class GSTApplication {

	public static void main(String[] args) 
	{
		m1(null);
	}
	
	public static void m1(Object o)
	{
		System.out.println("Hello this is m1() method....");
		
		System.out.println("This is newly added in this method....");
	}
}


