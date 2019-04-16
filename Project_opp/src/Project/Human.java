package Project;

public class Human extends Person implements Student  {
	protected String huminity;
	protected String analytical;
	protected String feel;
	
	public Human() {
		super();
	}
	
	public Human(int iD, String name, String address, int age, String gender, String huminity, String analytical,
			String feel) {
		super(iD, name, address, age, gender);
		this.huminity = huminity;
		this.analytical = analytical;
		this.feel = feel;
	}
	
	

	@Override
	public String toString() {
		return "Human [huminity=" + huminity + ", analytical=" + analytical + ", feel=" + feel + ", getID()=" + getID()
				+ ", getName()=" + getName() + ", getAddress()=" + getAddress() + ", getAge()=" + getAge()
				+ ", getGender()=" + getGender() 
				 + "]";
	}

	public String getHuminity() {
		return huminity;
	}
	public void setHuminity(String huminity) {
		this.huminity = huminity;
	}
	
	
	public String getAnalytical() {
		return analytical;
	}
	public void setAnalytical(String analytical) {
		this.analytical = analytical;
	}
	public String getFeel() {
		return feel;
	}
	public void setFeel(String feel) {
		this.feel = feel;
	}

	@Override
	public String study()
	{
		return getName();
		
	}

	@Override
	public void exam() {
		
		
	}

}
