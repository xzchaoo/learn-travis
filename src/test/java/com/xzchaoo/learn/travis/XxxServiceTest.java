package com.xzchaoo.learn.travis;

import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2017/5/2.
 */
public class XxxServiceTest {
	@Test
	public void testHello() {
		XxxService s = new XxxService();
		assertEquals("hello world", s.hello("world"));
		Stream.of(1).findFirst().get();
		//强制提交
	}
}
