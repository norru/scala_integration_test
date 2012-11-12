package net.itadinanta;

import static org.junit.Assert.*;

import org.junit.Test;

public class ScalaCallTest {

	@Test
	public void test() {
		assertEquals(3, new SomeClass().fromScala.x());
		assertEquals(4, new SomeClass().fromScala.y());
	}

}
