package trialspringboot.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Pancard {
	
	private int pid;
	private String pname;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	 
	public void compile() {
		System.out.println("compiling");
		
	}

}
