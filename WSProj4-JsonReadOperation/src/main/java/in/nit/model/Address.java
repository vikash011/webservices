package in.nit.model;

public class Address {
	private String hNo;
	private String loc;

	public Address() {
		System.out.println("Address.0-parma constructor");
	}

	public String gethNo() {
		return hNo;
	}

	public void sethNo(String hNo) {
		this.hNo = hNo;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Address [hNo=" + hNo + ", loc=" + loc + "]";
	}

}
