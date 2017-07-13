package fizzbuzz;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * MoreUnit plugin hotkeys:
 * 
 * <Ctrl><J> to jump back and forth
 * <Ctrl><R> to run tests
 */
public class FizzBuzzTest {

	private FizzBuzz underTest;
	
	@Before
	public void setup() {
		// arrange
		underTest = new FizzBuzz();
	}
	
	@Test
	public void shouldSay1() {
		
		// act
		String response = underTest.say(1);
		
		// assert
		assertEquals("Should have responded 1", "1", response);
		assertTrue("Should have responded 1", response.equals("1"));
	}
	
	@Test
	public void shouldSay2WithAssertEquals() {
		
		String response = underTest.say(2);
		
		assertEquals("Should have responded 2", "2", response);
	}
	@Test
	public void shouldSay2() {
		
		String response = underTest.say(2);
		
		// without the message
		assertThat(response, is("2"));
		// with the message
		assertThat("Should have responded 2", response, is("2"));
	}
	
	@Test
	public void shouldSayFizz() {

		String response = underTest.say(3);
		
		assertThat(response, is("Fizz"));
	}
	
	@Test
	public void shouldGiveMeTheSequence() {
	
		List<String> sequence = underTest.countUpTo(3);
		
		// with matchers
		assertThat(sequence, contains("1", "2", "Fizz"));
		
		// with assertEquals
		List<String> expected = Arrays.asList("1", "2", "Fizz");
		assertEquals(expected, sequence);
	}
}
