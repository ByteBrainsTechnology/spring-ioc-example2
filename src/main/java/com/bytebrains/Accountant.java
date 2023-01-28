package com.bytebrains;

import org.springframework.stereotype.Component;

/**
 * 
 * @author ByteBtrains Technology
 *
 */
@Component
public class Accountant implements Employee {

	public void work() {
		System.out.println("Accountant work started...");
	}
}