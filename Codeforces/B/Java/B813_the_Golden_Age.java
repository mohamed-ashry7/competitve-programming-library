package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

// Math.pow in java 
public class B813_the_Golden_Age {
	static int getBoundary(long number, long limit) {
		int power = 0;
		
		try{
		while (limit - Long.parseLong(new BigInteger(number + "").pow(power).toString()) > 1) {
			power++;
		}
		}
		catch(NumberFormatException e ){
			return power -1;
		}
		return power;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(br.readLine());
		long x = Long.parseLong(stt.nextToken());
		long y = Long.parseLong(stt.nextToken());
		long l = Long.parseLong(stt.nextToken());
		long r = Long.parseLong(stt.nextToken());

		int aMin = Math.max(getBoundary(x, l) - 1, 0);
		int aMax = getBoundary(x, r);
		int bMin = Math.max(getBoundary(y, l) - 1, 0);
		int bMax = getBoundary(y, r);

		TreeSet<Long> set = new TreeSet<>();
		for (int i = aMin; i <= aMax; i++) {
			long pow = Long.parseLong(new BigInteger(x + "").pow(i).toString());

			for (int j = 0; j <= bMax; j++) {
				long pow2 = Long.parseLong(new BigInteger(y + "").pow(j).toString());
				long number = (long) (pow + pow2);

				if (number > r) {
					break;
				}
				if (number < l) {
					continue;
				}
				set.add(number);
			}
		}
		for (int i = 0; i <= aMin ; i++) {
			long pow = Long.parseLong(new BigInteger(x + "").pow(i).toString());

			for (int j = bMin; j <= bMax ; j++) {
				long pow2 = Long.parseLong(new BigInteger(y + "").pow(j).toString());

				long number = (long) (pow + pow2);
				if (number > r) {
					break;
				}
				if (number < l) {
					continue;
				}
				set.add(number);
			}
		}

		set.add(l - 1);
		set.add(r + 1);
		Iterator<Long> it = set.iterator();
		long number1 = it.next();
		long max = 0;
		long u = 0;
		long v = 0;
		while (it.hasNext()) {
			long number2 = it.next();
			if (max < number2 - number1 - 1) {
				max = number2 - number1 - 1;
				u = number1;
				v = number2;
			}
			number1 = number2;
		}
		System.out.println(max);
	}

}
