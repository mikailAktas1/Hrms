package kodlamaio.hrms.core.utilities.results;

public class SuccessResults implements Results {
	private boolean success;
	private String message;
	
	public SuccessResults() {
		this.success = true;
	}
	
	public SuccessResults(String message) {
		this();
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public String getMessage() {
		return message;
	}
	
}