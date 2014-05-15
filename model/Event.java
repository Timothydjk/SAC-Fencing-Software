package model;

import java.util.LinkedList;

/*
 * Data Storage Class for Events (e.g. Mens Epee or Womens Foil).
 */
public class Event {
	//some constants to use for good coding practice
	static int EPEE = 0;
	static int FOIL = 1;
	static int SABRE = 2;
	static int TEAM = 1;
	static int IND = 2;
	static int BOTH = 3;
	static int MALE = 1;
	static int FEMALE = 2;
	static int MIXED = 3;
	//rating (i.e. Div1, div2,...) weapon, gender,type as defined above, teams and ind are for participants, 
	private String rating;//TODO:fix ratings to have a upper and lower with better controls.
	private int weapon, gender,type;
	private Participant[] participants = new Participant[0];
	private LinkedList<Round> rounds = new LinkedList<Round>();

	
	
	
	
	
	
	private class Round{
		
	}
	private class DEBracket extends Round{
		//the bracket of bouts, to be populated and formed as a heap
		Bout[] bracket = new Bout[1];
		
	}
	private class Robin extends Round{
		Pool[] pools = new Pool[0];
		
	}
	private class Pool{
		int[][] scores;
		
	}
}
