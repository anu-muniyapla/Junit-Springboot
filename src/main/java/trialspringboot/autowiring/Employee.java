package trialspringboot.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	private int eid;
	private String ename;
	
	@Autowired
	private Pancard pancard;
	
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Pancard getPancard() {
		return pancard;
	}

	public void setPancard(Pancard pancard) {
		this.pancard = pancard;
	}

	public void show() {
		
		System.out.println("working");
		pancard.compile();
		// TODO Auto-generated method stub
		
	}

	
	
}
