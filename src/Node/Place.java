/*
 * Last Edited on October 8th 2019
 */
package Node;

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
		try {
			
			for(int i=0; i<n; i++ ) {
				this.getToken().remove(0);
			}
		} catch (RemoveTokenException stop) {
			
		}
	}

	public List<Arc> getArcs() {
		// TODO Auto-generated method stub
		
		return null;
	}
}
