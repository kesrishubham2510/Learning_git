public class Text {
	private String token;

	Text(String token){
		setToken(token);
	}
	public void setToken(String token){
		 this.token = token;
		 System.out.println("This is something");
		 System.out.println("I want to test");
		 System.out.println("to know about merg patterns.");
		 System.out.println("hence, doing this");
	}

    public void printToken(){
		System.out.println(this.token);
		
	}

    
	public String getToken(){
		return this.token;
	}
	
}
