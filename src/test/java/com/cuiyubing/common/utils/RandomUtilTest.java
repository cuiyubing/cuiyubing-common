package com.cuiyubing.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		for (int i = 0; i < 10; i++) {
			int x = RandomUtil.random(1, 10);
			System.out.println(x);
		}
	}

	@Test
	public void testSubRandom() {
		int[] is=RandomUtil.subRandom(1, 10, 4);
		for (int j : is) {
			
			System.out.println(j);
		}
	}

	@Test
	public void testRandomCharacter() {
		for (int i = 0; i < 10; i++) {
			System.out.println(RandomUtil.randomCharacter());
		}
	}

	@Test
	public void testRandomString() {
		for (int i = 0; i < 10; i++) {
			System.out.println(RandomUtil.randomString(4));
		}
	}

}
