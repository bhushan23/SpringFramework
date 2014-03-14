package vit;

public class student {
	private int grno;
	private String firstname;
	private String lastname;
	
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student(int grno, String firstname, String lastname) {
		super();
		this.grno = grno;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public int getGrno() {
		return grno;
	}
	public void setGrno(int grno) {
		this.grno = grno;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
