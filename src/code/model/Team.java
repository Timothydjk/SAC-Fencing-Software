package src.code.model;

import java.util.Collection;

/*
 * Data Storage Class for teams.
 */
public class Team extends Participant{

	private String name;
	private Fencer[] fencers =  new Fencer[0];
	private int size = 0;
	
	//Constructor
	public Team(String name){
		this.name = name;
	}
	//method to add fencer
	public boolean addFencer(Fencer fred){
		if (size >= this.size){
			Fencer[] temp = new Fencer[size+1];
			for (int i = 0; i<size;i++){
				temp[i] = fencers[i];
			}
			temp[size] = fred;
			size++;
			return true;
		}
		return false;
	}
	//method to add a collection of fencers
	public void addAllFencers(Collection<Fencer> people){
		for(Fencer person: people){
			this.addFencer(person);
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Fencer[] getFencers() {
		return fencers;
	}
	public void setFencers(Fencer[] fencers) {
		this.fencers = fencers;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
}
