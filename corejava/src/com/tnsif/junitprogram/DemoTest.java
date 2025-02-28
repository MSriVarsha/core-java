package com.tnsif.junitprogram;


class DemoTest {

	@Test
	void testAdd() {
		Demo d1=new Demo();
		int actual=d1.add(5, 5);
		int expected=19;
		if(expected==actual) {
			System.out.println("passed");
		}
		else {
			System.out.println("fail");
		}
	}

}
