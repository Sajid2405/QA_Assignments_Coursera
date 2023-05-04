import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import static org.junit.Assert.*;

import static org.mockito.Mockito.*;

/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
public class DemoTest {

	@Test
	public void mainTest(){
		String input = "12\n13\n18\n";
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		String[] args = {};
		Demo.main(args);

		String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
		consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
		consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
		consoleOutput += "This is a triangle." + System.getProperty("line.separator");

		assertEquals(out.toString(), consoleOutput);
	}

	@Test
	public void test_is_triangle_1(){
		assertTrue(Demo.isTriangle(3, 4, 5));
	}

	@Test
	public void test_is_triangle_2(){
		assertTrue(Demo.isTriangle(5, 12, 13));
	}

	@Test
	public void test_is_triangle_3(){
		assertTrue(Demo.isTriangle(5, 13, 12));
	}

	@Test
	public void test_is_triangle_4(){
		assertTrue(Demo.isTriangle(12, 5, 13));
	}

	@Test
	public void test_is_triangle_5(){
		assertTrue(Demo.isTriangle(12, 13, 5));
	}

	@Test
	public void test_is_triangle_6(){
		assertTrue(Demo.isTriangle(13, 12, 5));
	}

	@Test
	public void test_is_triangle_7(){
		assertTrue(Demo.isTriangle(13, 5, 12));
	}

	@Test
	public void test_is_NOT_triangle_1(){
		assertFalse(Demo.isTriangle(5, 7, 13));
	}

	@Test
	public void test_is_NOT_triangle_2(){
		assertFalse(Demo.isTriangle(5, 13, 7));
	}

	@Test
	public void test_is_NOT_triangle_3(){
		assertFalse(Demo.isTriangle(13, 5, 7));
	}

	@Test
	public void test_is_NOT_triangle_4(){
		assertFalse(Demo.isTriangle(13, 7, 5));
	}

	@Test
	public void test_is_NOT_triangle_5(){
		assertFalse(Demo.isTriangle(7, 5, 13));
	}

	@Test
	public void test_is_NOT_triangle_6(){
		assertFalse(Demo.isTriangle(7, 13, 5));
	}
}
