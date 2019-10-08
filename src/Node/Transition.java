/*
 * Last Edited on October 8th 2019
 */
package Node;

import java.util.List;

import Arc.Arc;

// TODO: Auto-generated Javadoc
/**
 * The Class Transition.
 */
public class Transition implements INode{
	
	/**
	 * Instantiates a new transition.
	 */
	public Transition() {
		
	}
	
	/**
	 * Checks if is fireable.
	 *
	 * @return true, if is fireable
	 */
	public boolean isFireable() {
		return false;
	}
	
	/**
	 * Fire.
	 */
	public void fire() {
		
	}

	/* (non-Javadoc)
	 * @see Node.INode#getArcs()
	 */
	public List<Arc> getArcs() {
		// TODO Auto-generated method stub
		return null;
	}
}
