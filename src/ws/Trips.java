package ws;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Trips implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public List<FlightBooking> listTrips;

	public Trips() {
		super();

		this.listTrips = new ArrayList<FlightBooking>();

	}

	private int contains(String p) {
		for (int i = 0; i < listTrips.size(); i++) {
			if (listTrips.get(i).getPassengerInfromation().equals(p)) {
				return i;
			}
		}
		return -1;
	}

	public int addNewBooking(String p, String dd, String da, String ad, String aa) {
		if (this.listTrips.contains(new FlightBooking(p, dd, da, ad, aa))) {
			return 1;
		}
		this.listTrips.add(new FlightBooking(p, dd, da, ad, aa));
		return 0;
	}

	public int removeBooking(String p) {
		int i = contains(p);
		if (i >= 0) {
			listTrips.remove(i);
			return 0;
		}
		return 1;
	}

	public int updateDepDate(String p, String dd) {
		int i = contains(p);
		if (i < 0 ) {
			return 1;
		}
		this.listTrips.get(i).setDepartureDate(dd);
		return 0;

	}

	public int updateDepAPID(String p, String da) {
		int i = contains(p);
		if (i < 0) {
			return 1;
		}
		this.listTrips.get(i).setDepartureAPID(da);
		return 0;

	}

	public int updateArrDate(String p, String ad) {
		int i = contains(p);
		if (i < 0) {
			return 1;
		}
		this.listTrips.get(i).setArrivalDate(ad);
		return 0;

	}

	public int updateArrAPID(String p, String aa) {
		int i = contains(p);
		if (i < 0) {
			return 1;
		}
		this.listTrips.get(i).setArrivalAPID(aa);
		return 0;

	}

	public String print() {
		String ret = "";
		if (listTrips.size() == 0) {
			return "No bookings";
		}
		for (int i = 0; i < listTrips.size(); i++) {
			ret += "Passanger info: " + listTrips.get(i).getPassengerInfromation() + " dep date: "
					+ listTrips.get(i).getDepartureDate() + " depAPID: " + listTrips.get(i).getDepartureAPID()
					+ " arr date: " + listTrips.get(i).getArrivalDate() + " arrAPID: "
					+ listTrips.get(i).getArrivalAPID() + "\n";
		}

		return ret;
	}

}
