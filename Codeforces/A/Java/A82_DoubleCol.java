package Codeforces;

import java.util.Scanner ; 
public class A82_DoubleCol {
    public static int Upper (int n ) {
        int i = 5 ; 
        for ( ; n/i > 0 ;  )
        	i =  i*2 + 5  ; 
        return i ; 
        
    }
    public static void main (String [] args )  { 
        Scanner ss =new Scanner (System.in) ;
        int n = ss.nextInt()  ; 
        String [] a =new String [] {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"} ; 
        int upper = Upper (n ) ; 
        int lower =( (upper-5 )/ 2) + 1 ;
        
        int fr2 = upper - lower +1 ; 
        int inc = (fr2 / 5)  ; 

        	
         int i = 0 ; 
         if (n >= lower && n<= lower+inc -1)
        	 System.out.println(a[0]);
         else if (n>= lower+inc && n <= lower+2*inc-1)
        	 System.out.println(a[1]);
         else if (n>= lower+2*inc && n <= lower+3*inc-1)
        	 System.out.println(a[2]);  
         else if (n>= lower+3*inc && n <= lower+4*inc-1)
        	 System.out.println(a[3]);
         else 
        	 System.out.println(a[4]);
        
        

        
        
    } 
    
    
    
}