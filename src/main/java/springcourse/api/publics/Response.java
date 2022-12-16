package springcourse.api.publics;

public class Response<T> {
	
	String code;
	T body;
	String message;
	
	
	public Response(String code, T body, String message) {
		this.code = code;
		this.body = body;
		this.message = message;
	}
	
	public Response() {
		
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public T getBody() {
		return body;
	}

	public void setBody(T body) {
		this.body = body;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
	
	
	

}
