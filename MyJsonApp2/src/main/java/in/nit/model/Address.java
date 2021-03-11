package in.nit.model;

public class Address {

	private String HNO;
	private String loc;

	public Address() {
		System.out.println("Address.0-param constructor");
	}

	public String getHNO() {
		return HNO;
	}

	public void setHNO(String hNO) {
		HNO = hNO;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Address [HNO=" + HNO + ", loc=" + loc + "]";
	}

}
