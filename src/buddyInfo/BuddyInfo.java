package buddyInfo;

public class BuddyInfo {

	private String name, address, phone;

	/* Constructor
	*/
	public BuddyInfo(String name, String address, String phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public boolean equals(BuddyInfo buddy) {
		if(buddy == null) return false; 
		if(buddy == this) return true;
		if(buddy.getClass() != this.getClass()) return false;
		BuddyInfo bud = (BuddyInfo)buddy;
		if(bud.getAddress() == this.address & bud.getName() == this.name & bud.getPhone() == this.phone) {
			return true;
		}
		return false;
	}
	
}
