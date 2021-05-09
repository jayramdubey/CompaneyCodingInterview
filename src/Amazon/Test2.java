package Amazon;

public class Test2 {

	public static void main(String[] args) {
		
	}

	public Boolean redeemPoint(String customerId, String amount) {
		if (customerId == null || amount == null || amount.isEmpty() || customerId.isEmpty())
			return false;

		Double toRedeem = Double.valueOf(amount);
/*		double currentPoints = Double.parseDouble()myService.getPoints(customerId);
		double newPoints = currentPoints - toRedeem;
		myService.save(customerId, newPoints);
		log.info("Points redeemed for customer {}", customerId);*/
		return true;

	}

}
