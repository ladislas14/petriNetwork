/*
 * 
 * 
 * Created on 8 October 2019
 * 
 */
package PetriNet;

import Arc.Arc;
import Arc.ArcEntrant;
import Arc.ArcSortant;
import Node.Place;
import Node.Transition;

/**
 * The Interface IPetriNet.
 * 
 * Declare all required methods for a PetriNet
 * 
 */
public interface IPetriNet {
	
	
	/**
	 * Launch.
	 */
	public void launch();
	
	/**
	 * Adds the place.
	 *
	 * @param place the place
	 */
	public Place newPlace();
	
	/**
	 * Adds the transition.
	 *
	 * @param transition the transition
	 */
	public Transition newTransition(ArcEntrant arcEntrant, ArcSortant arcSortant);
	
	/**
	 * Adds the arc.
	 *
	 * @param arc the arc
	 */
	public Arc newArc(int weight, Place place);
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name);
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName();
	
}
