package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1217_Creating_a_Character {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine()) ;
		
		while (t-->0) { 
			StringTokenizer stt = new StringTokenizer(br.readLine()) ; 
			int s = Integer.parseInt(stt.nextToken()) ; 
			int i = Integer.parseInt(stt.nextToken()) ; 
			int ex = Integer.parseInt(stt.nextToken()) ; 
			/*
			 * 
			 * This solution is modeled as maths 
			 * before doing any thing we would make sure that s is greater than i 
			 * so we check it 
			 * if s less than or equal to i we add to s from ex to be strictly greater than i 
			 * 
			 */
			if (s<= i ) { 
				int diff = i-s + 1  ;
				ex = ex - diff ; 
				s = s + diff ; 
			}
			/*
			 * so in case one if ex is less than zero that means there was not enough to add to s to be greater than i 
			 * for example 1 6 3 
			 */
			if (ex<0) { 
				System.out.println(0);
			}
			/*
			 * if ex == 0 that means all the ex can be added to form only one number greater than i 
			 * for example 6 10 5 
			 */
			else if (ex== 0 ) { 
				System.out.println(1);
			}
			/*
			 * in this case the s is always bigger than i even if you added all the ex tp s ; 
			 * for example 100 50 20 
			 */
			else if (s-i > ex ) {
				System.out.println(ex+1);
			}
			/*
			 * in this case we know that the higherBound for s is s + ex 
			 * so we have to the lowerBound through these equations 
			 *  we shall know two numbers a , b such that adding them to s and i would make the lowest difference possible .
			 *  which is 2 or 1 
			 *  we would consider 2 to avoid any negative values that would happen .  
			 *  so 
			 *  a+b = ex ; 
			 *  a+s - (b+i) =2 ;
			 *  a - b = 2-s+i ; 
			 *  so 
			 *  2a = 2-s+i+ex ; 
			 *  a = (2-s+i+ex)/2 ; 
			 *  we would take the ceil of this value 
			 *   
			 */
			else { 
				int upperBound = s+ex ; 
				int a =(int) Math.ceil((2-s+i+ex)/2.0) ;
				int lowerBound = a + s  ;
				/*
				 * here we check the difference between the lowerBound of s and the new i is the min
				 * for example : 
				 * 5 3 4 
				 * so higherBound = 9 
				 * and lowerBound = a + s  = 7 
				 * so we are not sure if this is the right value or 6 (because of the ceil op )
				 * so we would compare this lowerBound to i 
				 * i = i + b 
				 * b = ex - a = 2 
				 * b = 2 
				 * so i = 5 
				 * then the diff is 2 so it is right 
				 * but what if the diff is greater than 2 
				 * it would be at most 3 
				 * so we minus the lowerBound by one 
				 *   
				 */
				if (lowerBound - (ex-a + i) >2 ) {
					lowerBound-- ; 
				}
				int diff = upperBound - lowerBound + 1 ; 
				System.out.println(diff);
				
			}
		}
	}

}
