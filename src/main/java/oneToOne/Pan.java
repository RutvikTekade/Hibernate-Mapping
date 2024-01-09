package oneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pan {
     @Id
	private int id;
	private String pannum;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPannum() {
		return pannum;
	}
	public void setPannum(String pannum) {
		this.pannum = pannum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
