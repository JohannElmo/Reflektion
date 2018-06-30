

/**
 * THIS IS TESTING VERSION
 * @author johann
 *
 */

public class ReceiptImpl implements Receipt{
	
int parkingMinutes;
	
	public ReceiptImpl(int amount) {
		parkingMinutes = amount;
	}
	
	public int value() {
		return parkingMinutes;
	}
}
