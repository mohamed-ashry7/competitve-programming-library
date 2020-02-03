package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class A277_Learning_Languages {

	static Employee[] employees;
	static TreeSet<Integer> visited;
	static int groups;
	static boolean firstLevel;
	static int zeroes = 0 ; 
	static boolean canSpeak(Employee e1, Employee e2) {
		return e1.getLang().stream().anyMatch(x -> e2.getLang().contains(x));
	}

	static void DFS(int emp) {

		for (int i = 1; i < employees.length; ++i) {

			if (!visited.contains(i)) {
				if (employees[i].getLang().size() == 0) {
					zeroes++;
					visited.add(i);

				} else {
					if (canSpeak(employees[emp], employees[i])) {
						visited.add(i);
						if (firstLevel) {
							groups++;
							firstLevel = false;
							DFS(i);
							firstLevel = true;
						} else {
							DFS(i);
						}

					}
				}
			}
		}
	}

	static void generateAll() {
		for (int i = 1; i < employees.length; i++) {
			DFS(i);
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(stt.nextToken());
		int m = Integer.parseInt(stt.nextToken());
		employees = new Employee[n + 1];
		visited = new TreeSet<>();
		for (int i = 1; i <= n; ++i) {
			employees[i] = new Employee(i, br.readLine());
		}
		groups = 0;
		firstLevel = true;
		generateAll();
		System.out.println(Math.max(groups-1, 0) + zeroes );

	}

	static class Employee {

		int employee;
		ArrayList<Integer> languages;

		public Employee(int employee, String str) {
			this.employee = employee;
			StringTokenizer stt = new StringTokenizer(str);
			languages = new ArrayList<>(Integer.parseInt(stt.nextToken()));
			while (stt.hasMoreTokens()) {
				languages.add(Integer.parseInt(stt.nextToken()));
			}
		}

		int getEmployee() {
			return employee;
		}

		ArrayList<Integer> getLang() {
			return languages;
		}

	}
}
