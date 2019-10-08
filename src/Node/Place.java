package Node;

import java.util.List;

public class Place {

	private List<Token> tokens;
	
	public Place() {
		
	}
	
	public List<Token> getToken(){
		return this.tokens;
	}
	
	public int getTokenNumber() {
		return this.getToken().size();
	}
	
	public void removeTokens(int n) {
		if (this.getTokenNumber() >= n) {
			
		}
	}
}
