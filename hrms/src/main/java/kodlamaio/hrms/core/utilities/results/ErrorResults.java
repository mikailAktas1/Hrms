package kodlamaio.hrms.core.utilities.results;

public class ErrorResults  implements Results{
	private final boolean success;
	private String message;
	
	public ErrorResults() {
		this.success = false;
	}
		
	public ErrorResults(String message) {
		this();
		this.message = message;
	}

	@Override
	public boolean isSuccess() {
		
		return success;
	}

	@Override
	public String getMessage() {
		
		return message;
	}

}
