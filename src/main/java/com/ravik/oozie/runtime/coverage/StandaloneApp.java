/**
 * 
 */
package com.ravik.oozie.runtime.coverage;

/**
 * @author Ravi K
 *
 */
public class StandaloneApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		if(args.length > 1) {
			System.out.println("There is an input parameter.");
		}else{
			System.out.println("There is no input parameter supplied.");
		}
	}

}
