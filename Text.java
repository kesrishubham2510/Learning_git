public class Text {
	String token;

	Text(String token){
		setToken(token);
	}
	public void setToken(String token){
		 this.token = token;
	}

    public void printToken(){
		System.out.println(this.token);
	}

}
