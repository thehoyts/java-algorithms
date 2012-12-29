package algorithms;
import programming.contract.PreconditionError;
import programming.graph.HistogramWindow;

public class DisplayTool {
	private static DisplayTool tool_;
	
	private HistogramWindow histogram_;
	
	private DisplayTool() throws PreconditionError {
		histogram_ = new HistogramWindow(512, 512);
	}
	
	public static DisplayTool instance() throws PreconditionError {
		if (null == tool_) {
			tool_ = new DisplayTool();
		}
		return tool_;
	}
	
	public void DisplayHistogram(int [] a, int pauseMilliseconds) throws PreconditionError, InterruptedException {
		histogram_.data(a);
		Thread.sleep(pauseMilliseconds);
	}
	
	public boolean isShowing() {
		return histogram_.isShowing();
	}
}
