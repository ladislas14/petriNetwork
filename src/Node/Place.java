/*
 * Last Edited on October 8th 2019
 */
package Node;

import java.util.List;

import Arc.Arc;


public class Place implements INode{
	
	/** The tokens. */
	private List<Token> tokens;
	
	/**
	 * Instantiates a new place.
	 */
	public Place() {
		
	}
	
	// Methods
	
	public List<Token> getToken(){
		return this.tokens;
	}
	
	/**
	 * @return the token number
	 */
	public int getTokenNumber() {
		return this.getToken().size();
	}
	
	/**
	 * Removes the tokens.
	 */
	public void removeTokens(int n) {
		if (this.getTokenNumber() >= n) {
			for(int i=0; i<n; i++ ) {
				this.getToken().remove(0);
			}
		}
	}

	public List<Arc> getArcs() {
		// TODO Auto-generated method stub
		
		return null;
	}
}
