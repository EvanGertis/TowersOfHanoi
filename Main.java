import java.util.Arrays;
import java.util.Stack;

public class Main {
	public static void main(String args[])
	{
		Stack<Integer> A = new Stack<Integer>();
		Stack<Integer> B = new Stack<Integer>();
		Stack<Integer> C = new Stack<Integer>();
		
		A.push(1);
		A.push(1);
		A.push(1);
		
		TowerOfHanoi(3, A, B, C);
	}
	
	public static void TowerOfHanoi(int rings, Stack<Integer> A, Stack<Integer> B, Stack<Integer> C) 
	{
		
		if(rings == 1) {
			A.pop();
			B.push(1);
			System.out.println(String.format("Moving %1$d from %2$s to %3$s", 1, A, B));
			System.out.println(String.format("A %1$s B %2$s C %3$s", A, B, C));
			return;
		}
		
		TowerOfHanoi(rings - 1, A, C, B);
		A.pop();
		B.push(1);
		System.out.println(String.format("Moving %1$d from %2$s to %3$s", 1, A, B));
		System.out.println(String.format("A %1$s B %2$s C %3$s", A, B, C));
		TowerOfHanoi(rings - 1, C, B, A);
		
	}
	
}
