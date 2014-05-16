package src.code.model;
/*
 * Data Storage Class for Fencer Data.
 */
public class Fencer extends Participant {
	//some constants
	static boolean MALE = false;
	static boolean FEMALE = true;


	//Last Name, First Name, Middle Initial, Nickname, Rating Letter (foil, epee, sabre), Club, Birth Month/Year/Day, USFA #, Rating Year.
	private String LName, FName, MI, NName, RatingF, RatingE, RatingS, Club;
	private int BY, USFAID, RYF, RYE, RYS;
	//False for male True for female...
	private boolean gender = false;
	
	
	/*
	 * Constructors time. To avoid the combinatorial explosion that would occur with this many optional variables, pass NULL 
	 * into any of the variables. This will NOT work for LName/FName or ratings. Gender will default to Male.
	 * 
	 */
	
	public Fencer(String LName, String FName, String MI, String NName, String RatingF, String RatingE, String RatingS, String Club,
			int BY, int USFAID, int RYF, int RYE, int RYS, boolean gender){
		if(LName == null || FName == null){
			return;
		}
		this.LName = LName;
		this.FName = FName;
		this.MI = MI;
		this.NName = NName;
		this.RatingE = RatingE;
		this.RatingF = RatingF;
		this.RatingS = RatingS;
		this.Club = Club;
		this.BY = BY;
		this.USFAID = USFAID;
		this.RYF = RYF;
		this.RYE = RYE;
		this.RYS = RYS;
		this.gender = gender;
		
	}
	
	//and now, for the myriad of getters and setters for LEGIT everything
	public String getLName() {
		return LName;
	}


	public void setLName(String lName) {
		LName = lName;
	}


	public String getFName() {
		return FName;
	}


	public void setFName(String fName) {
		FName = fName;
	}


	public String getMI() {
		return MI;
	}


	public void setMI(String mI) {
		MI = mI;
	}


	public String getNName() {
		return NName;
	}


	public void setNName(String nName) {
		NName = nName;
	}


	public String getRatingF() {
		return RatingF;
	}


	public void setRatingF(String ratingF) {
		RatingF = ratingF;
	}


	public String getRatingE() {
		return RatingE;
	}


	public void setRatingE(String ratingE) {
		RatingE = ratingE;
	}


	public String getRatingS() {
		return RatingS;
	}


	public void setRatingS(String ratingS) {
		RatingS = ratingS;
	}


	public String getClub() {
		return Club;
	}


	public void setClub(String club) {
		Club = club;
	}


	public int getBY() {
		return BY;
	}


	public void setBY(int bY) {
		BY = bY;
	}


	public int getUSFAID() {
		return USFAID;
	}


	public void setUSFAID(int uSFAID) {
		USFAID = uSFAID;
	}


	public int getRYF() {
		return RYF;
	}


	public void setRYF(int rYF) {
		RYF = rYF;
	}


	public int getRYE() {
		return RYE;
	}


	public void setRYE(int rYE) {
		RYE = rYE;
	}


	public int getRYS() {
		return RYS;
	}


	public void setRYS(int rYS) {
		RYS = rYS;
	}


	public boolean isGender() {
		return gender;
	}


	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
}
