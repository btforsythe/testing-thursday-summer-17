package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public String say(int number) {
		if(number == 3) {
			return "Fizz";
		}
		return "" + number;
	}

	public List<String> countUpTo(int number) {
		List<String> sequence = new ArrayList<>();
		for(int count = 1; count <= number; count++) {
			sequence.add(say(count));
		}
		return sequence;
	}
}
