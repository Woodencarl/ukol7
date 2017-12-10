package ws;

public class FlightBooking {
	private String passengerInfromation;
	private String departureDate;
	private String departureAPID;
	private String arrivalDate;
	private String arrivalAPID;

	public FlightBooking(){
		
	}
	public FlightBooking(String p, String dd, String da, String ad, String aa){
		passengerInfromation=p;
		departureDate=dd;
		departureAPID=da;
		arrivalDate=ad;
		arrivalAPID=aa;
	}

	public String getPassengerInfromation() {
		return passengerInfromation;
	}

	public void setPassengerInfromation(String passengerInfromation) {
		this.passengerInfromation = passengerInfromation;
	}

	public String getDepartureAPID() {
		return departureAPID;
	}

	public void setDepartureAPID(String departureAPID) {
		this.departureAPID = departureAPID;
	}

	public String getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public String getArrivalAPID() {
		return arrivalAPID;
	}

	public void setArrivalAPID(String arrivalAPID) {
		this.arrivalAPID = arrivalAPID;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

}
