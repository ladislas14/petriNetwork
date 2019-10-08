package PetriNet;

import Arc.Arc;
import Arc.ArcEntrant;
import Arc.ArcSortant;
import Node.Place;
import Node.Transition;

import javax.swing.tree.TreeNode;
import java.util.List;

public class PetriNet implements IPetriNet{
	private String Name;
	private List<Transition> transitions;
	
	
	@Override
	public void launch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Place newPlace() {
		return null;
	}

	@Override
	public Transition newTransition(ArcEntrant arcEntrant, ArcSortant arcSortant) {
		return new Transition(arcEntrant, arcSortant);
	}

	@Override
	public Arc newArc(int weight, Place place) {
		return new Arc(weight, place);
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}


}
