package NellPkg.Queue;

import java.util.*;

public class Queue {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		LinkedList<Integer> q = new LinkedList<>();
		LinkedList<Integer> qSaver = new LinkedList<>();
		LinkedList<Integer> qRemoved = new LinkedList<>();
		Random randNum = new Random(); 
		boolean status;
		int totalRemove = 0;
		
		System.out.print("Enter limit: ");
		int N = inputScanner.nextInt();
		
		int x[] = new int[N];
		String op[] = new String[N]; 
		
		System.out.println("N (operations to format): " + N);
		
		for (int i = 0; i < N; i++) {
			System.out.printf("%d. Enter your operation (Remove, Insert): ", (i + 1));
			 op[i] = inputScanner.next().toLowerCase();
			 int rand = randNum.nextInt(1, 20);
			 x[i] = i + rand;
			
			if (op[i].equals("insert")) {
				q.add(x[i]);
				qSaver.add(x[i]);
				System.out.printf("Added sucessfully: %d\n", (x[i]));
			} else if (op[i].equals("remove")) {
				if (q.isEmpty() && op[i].equals("remove")) {
					System.out.println("Queue underflow!");
				} else if (!q.isEmpty() && op[i].equals("remove")) {
					int firstQ = q.peek();
					qRemoved.add(firstQ);
					q.removeFirst();
					totalRemove += 1; 
					System.out.printf("Front-value removed sucessfully: %d\n", firstQ);
				}
			}
		}
		
		if (totalRemove == 0) {
			System.out.printf("\nWithout remove(): %s\n", qSaver);
			System.out.printf("With remove(): %s (Nothing has been removed)\n\n", q);
		} else if (totalRemove > 0) {
			System.out.printf("\nWithout remove(): %s\n", qSaver);
			System.out.printf("With remove(): %s - %s is removed\n\n", q, qRemoved);
		}
		
		System.out.print("Empty q? (Y/N): ");
		char c = inputScanner.next().toUpperCase().charAt(0);
		
		if (c == 'Y') {
			q.removeAll(q);
			status = true;
			System.out.printf("Q (emptied): %s\n", q);
			System.out.println("Return bool: " + status);
		} else if (c == 'N') {
			status = false;
			System.out.printf("Q (un-emptied): %s\n", q);
			System.out.println("Return bool: " + status);
		}
		
		System.out.println("\nCurrent Q: " + q);
		
		if (totalRemove == 0) { 
			System.out.println("All elements of Q: " + qSaver + " (Nothing has been removed)");
		} else if (totalRemove > 0) {
			System.out.println("All elements of Q: " + qSaver);
		}
	}
	
	
}
