package java4s;
import com.opensymphony.xwork2.ActionSupport;

public class UserDetails extends ActionSupport{
	
	private String fname,lname;
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String execute()
	{		
			return "Success";
	}

	
	

}
