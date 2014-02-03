/**
 * 
 */
package com.jayant.java;

import java.awt.*;

/**
 * @author jasarkar
 *
 */
public class BeepSound {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
//		System.out.print("\007"); // bell ASCII char
//      System.out.flush();
		Thread.sleep(1000);
		Toolkit.getDefaultToolkit().beep();
		System.out.println("-----------DONE--------------");
	}

}
