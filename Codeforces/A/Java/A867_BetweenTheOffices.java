package Codeforces;
import java.util.Scanner ; 
import java.io.* ; 
public class A867_BetweenTheOffices {


  public static void main (String [] b ) { 
      Scanner ss = new Scanner (new BufferedReader (new InputStreamReader (System.in) )) ; 
      int n = ss.nextInt() ; 
      String  a = ss.next() ; 
      int stof = 0 ; 
      int ftos = 0 ; 
      int ind =  0 ; 
      while (ind !=  -1 )  {
          
          if (a.charAt(0 ) == 'S') { 
            ind = a.indexOf('F') ; 
              if (ind != -1){
              stof ++ ; 
              a  =a.substring(ind) ; 
              }
          
          }
          else {
              if (a.charAt(0 ) == 'F') { 
            ind = a.indexOf('S') ; 
            if (ind != -1){
                ftos ++ ; 
              a  =a.substring(ind) ; 
            }
          
          }
          
          }
          
          
          
          
      }
      if (stof >ftos)
          System.out.println("YES") ; 
      
      else 
                    System.out.println("NO") ; 
   
  }
}