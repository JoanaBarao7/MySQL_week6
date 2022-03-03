import java.util.Random;

import com.google.common.annotations.VisibleForTesting;

public class TestDemo {
		
	public int addPositive(int a, int b) {
		if(a < 1 || b < 1 ) {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
		
		return a + b;
	}

	public int randomNumberSquared() {
		int a = getRandomInt();

		System.out.println(a);
		
	
		return a * a;
		
	}
	
	@VisibleForTesting	
	int getRandomInt() {
		  Random random = new Random();
		  return random.nextInt(10) + 1;
		}
	
}
