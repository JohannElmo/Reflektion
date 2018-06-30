

/**
 * THIS IS TEST VERSION
 *
 */

public class PayStationImpl implements PayStation {
private int insertedSoFar;
	
	public int readDisplay() {
		return CalculateParkingTime(insertedSoFar);
	}

	/**
	 * Buy parking time. Terminate the ongoing transaction and
	 * return a parking receipt. A non-null object is always returned.
	 * @return a valid parking receipt object.
	 */
	public Receipt buy() {
		
		return new ReceiptImpl(CalculateParkingTime(CalculateParkingTime(insertedSoFar)));
	}


	public void cancel() {
		// TODO Auto-generated method stub

	}
	
	public void addPayment(int coinValue) 
	throws IllegalCoinException {
		switch (coinValue) {
		case 5:
		case 10:
		case 25: break;
		default:
			throw new IllegalCoinException("Illegal coint: " + coinValue);
		}
			
		insertedSoFar += coinValue;
	}

	public int CalculateParkingTime(int amount) {
		return (insertedSoFar * 2) /5;
	}
	

}
