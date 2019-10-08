/*
 * Last Edited on October 8th 2019
 */
package Node;

import java.util.ArrayList;
import java.util.List;

import Arc.Arc;
import Exception.RemoveTokenException;


public class Place implements INode{
	
	private List<Token> tokens;
	

	public Place(List<Token> tokens) {
		this.tokens = tokens;
	}
	
	
	public List<Token> getToken(){
		return this.tokens;
	}
	
	
	public int getTokenNumber() {
		return this.getToken().size();
	}
	

	public void removeTokens(int n) throws RemoveTokenException {
			
			if (this.getToken().size()<= n) {
				
				for(int i=0; i<n; i++ ) {
					this.getToken().remove(0);
				}
				
			}else {
				throw new RemoveTokenException();
			}

	}
	
	public void addTokens(int n){
		
		List<Token> addList = new ArrayList<Token>();		
		
		for(int i=0; i<n; i++) {
			Token tempToken = new Token(this);
			addList.add(tempToken);
		}

		this.getToken().addAll(addList);
	}
	
	
	public List<Arc> getArcs() {
		// TODO Auto-generated method stub
		
		return null;
	}
}
