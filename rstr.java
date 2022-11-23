package Model;

public class rstr {
	private Integer rstrId;
	private String rstrName;
	public rstr() {
		super();
		
	}
	public rstr(String rstrName) {
		super();
		this.rstrName = rstrName;
	}
	
	public Integer getRstrId() {
		return rstrId;
	}
	public void setRstrId(Integer rstrId) {
		this.rstrId = rstrId;
	}
	public String getrstrName() {
		return rstrName;
	}
	public void setrstrName(String rstrName) {
		this.rstrName = rstrName;
	}
	
	
}
