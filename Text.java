public class Text {
	private String token;

	Text(String token){
		setToken(token);
	}
	public void setToken(String token){
		 this.token = token;
		 System.out.println("s1");
		 System.out.println("s2");
		 System.out.println("SSSSSS");
		 System.out.println("s3");
	}

    public void printToken(){
		System.out.println(this.token);
	}

    
	public String getToken(){
		return this.token;

	}
	
}
