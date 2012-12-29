package algorithms;

import programming.contract.PreconditionError;

public class AlgorithmsTestDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] a = new int[10];
		
		try {
			ArrayAlgorithms.fill(a, 1, 1);
			ArrayAlgorithms.reverse(a);
			while(DisplayTool.instance().isShowing()) {}
			
		} catch (PreconditionError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
