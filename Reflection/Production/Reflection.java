

public class Reflection {
	
	public static void main(String[] args) throws IllegalCoinException {
		PayStation ps = new PayStationImpl();
		ps.addPayment(5);
		Receipt receipt = ps.buy();
		
		Class r = receipt.getClass();
		System.out.println(r.getName());
		
		
	}

}
