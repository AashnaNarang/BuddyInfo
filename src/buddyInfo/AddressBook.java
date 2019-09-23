package buddyInfo;

import java.util.*;

public class AddressBook {

	private List<BuddyInfo> buddyInfo;
	
	public AddressBook() {
		this.buddyInfo = new ArrayList<BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo bud) {
		if (bud != null) {
			this.buddyInfo.add(bud);
		}
	}
	
	public BuddyInfo removeBuddy(int index) {
		if (index >= 0 && index < this.buddyInfo.size()) {
			return this.buddyInfo.remove(index);
		}
		return null;
	}
	
	public static void main(String args[]) {
		BuddyInfo buddy = new BuddyInfo("Dani", "deerfox drive", "613-234-3333");
		AddressBook addy = new AddressBook(); 
		addy.addBuddy(buddy);
	}
}
