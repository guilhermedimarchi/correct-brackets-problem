package basicTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ApplicationTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test1() {
		Interview interview = new Interview();
		assertEquals(true, interview.parse("()"));
	}
	
	@Test
	public void test2() {
		Interview interview = new Interview();
		assertEquals(true, interview.parse("(())"));
	}

	@Test
	public void test3() {
		Interview interview = new Interview();
		assertEquals(true, interview.parse("([])"));
	}
	@Test
	public void test4() {
		Interview interview = new Interview();
		assertEquals(false, interview.parse("([)]"));
	}
	
	
	
	/*
	 * Interview
[]()
true|false

1. () -> true
2. [] -> true
3. (()) -> true
4. ([]) -> true
5. ( -> false
6. ) -> false
7. ([)] -> false

Write tests and code for this
	 * 
	 * */
	
}

