/*
 * Last Edited on October 8th 2019
 */
package Node;

import java.util.List;

import Arc.Arc;
import Arc.ArcEntrant;
import Arc.ArcSortant;
import Exception.IsNotFirableException;

// TODO: Auto-generated Javadoc
/**
 * The Class Transition.
 */
public class Transition implements INode{

	private List<ArcEntrant> arcEntrants;
	private List<ArcSortant> arcSortants;
	
	/**
	 * Instantiates a new transition.
	 */
	public Transition(List<ArcEntrant> arcEntrants, List<ArcSortant> arcSortants) {
		this.arcEntrants = arcEntrants;
		this.arcSortants = arcSortants;
	}

	/**
	 * Checks if is fireable.
	 *
	 * @return true, if is fireable
	 */
	public boolean isFireable() throws IsNotFirableException {
		boolean tmpIsFirable = true;
		List<ArcEntrant> arcEntrants = this.getArcEntrants();
		for(ArcEntrant arcEntrant : arcEntrants){
			if(arcEntrant.getWeight() > arcEntrant.getPlace().getTokenNumber()){
				tmpIsFirable = false;
			}
		}
		if(tmpIsFirable){
			return true;
		}else{
			throw new IsNotFirableException();
		}
	}
	
	/**
	 * Fire.
	 */
	public void fire() {
		
	}

	public List<ArcEntrant> getArcEntrants() {
		return arcEntrants;
	}

	public List<ArcSortant> getArcSortants() {
		return arcSortants;
	}

	/* (non-Javadoc)
	 * @see Node.INode#getArcs()
	 */
	public List<Arc> getArcs() {
		// TODO Auto-generated method stub
		return null;
	}
}
