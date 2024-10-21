package uk.ac.hw.macs.search.example;

import java.util.List;
import java.util.Set;

import uk.ac.hw.macs.search.ChildWithCost;
import uk.ac.hw.macs.search.FringeNode;
import uk.ac.hw.macs.search.SearchOrder;

/**
 * A simple search order that .
 */
public class AstarSearchOrder implements SearchOrder {

	@Override
	public void addToFringe(List<FringeNode> frontier, FringeNode parent, Set<ChildWithCost> children) {
		// Add them 
		for (ChildWithCost child : children) {
            for (i in frontier){
                FringeNode newNode = new FringeNode(child.node, parent, child.cost);
                if (i.getFValue() >= newNode.getFValue()){
			    frontier.add(indexOf(i), newNode);
                break;
                }
		    }
        }
	}

}