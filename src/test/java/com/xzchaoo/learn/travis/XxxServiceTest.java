package com.xzchaoo.learn.travis;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2017/5/2.
 */
public class XxxServiceTest {
	@Test
	public void testHello() {
		XxxService s = new XxxService();
		assertEquals("hello world", s.hello("world"));
		//强制提交
	}
}
