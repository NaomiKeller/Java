package Stack;
public class Ex4 { 
	public static void main(String[] args) {
		// Create GenericStack
		GenericStack<Integer> stack = new GenericStack<>();
		// Amount of prime numbers to be generated
		final int NUM_PRIME = 50; 
		int x = 0; // counter
		for (int i=2; x < NUM_PRIME; i++) {
			if (isPrime(i)) {
				stack.push(i);
				x++;
			}
		}
		
		// Display
		System.out.println("The first 50 Prime Numbers are: ");
		for (int i=1; !stack.isEmpty(); i++) {
			if (i % 10 == 0)
				System.out.printf("%3d\n", stack.pop());
			else
				System.out.printf("%3d ", stack.pop());
		}
		System.out.println();
	}
	// Check if prime
	public static boolean isPrime(int n) {
		for (int i=2; i<=n/2; i++) {
			if (n%i==0)
				return false;
		}
		return true;
	}
}