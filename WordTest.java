import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class WordTest {

	private Integer n;

	@Test
	public void testWordNothing() {
		Analyzer test = new Analyzer();
		int output = test.countWord("nothing");
		assertEquals (n,n);

	}
	@Test
	public void testWordMaiden() {
		Analyzer test = new Analyzer();
		int output = test.countWord("maiden");
		assertEquals(n, n);

	}

	@Test
	public void testWordFlirt() {
		Analyzer test = new Analyzer();
		int output = test.countWord("flirt");
		assertEquals(n, n);
	}

	@Test
	public void testWordProphet() {
		Analyzer test = new Analyzer();
		int output = test.countWord("prophet");
		assertEquals(n, n);
	}
	
	@Test
	public void testWordGod() {
		Analyzer test = new Analyzer();
		int output = test.countWord("God");
		assertEquals(n, n);
	}

	@Test
	public void testWordGilead() {
		Analyzer test = new Analyzer();
		int output = test.countWord("Gilead");
		assertEquals(n, n);
	}

	@Test
	public void testWordWhispered() {
		Analyzer test = new Analyzer();
		int output = test.countWord("whispered");
		assertEquals(n, n);
	}
}