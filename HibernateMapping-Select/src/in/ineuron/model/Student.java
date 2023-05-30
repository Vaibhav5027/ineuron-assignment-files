package in.ineuron.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@Column(name = "sid")
	private int id;
	private String sname;
	private int sage;
	private String saddress;
	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", sage=" + sage + ", saddress=" + saddress + "]";
	}

}
