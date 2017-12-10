package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName="FlightBooking")
public class TestService {
 
	private static Trips AllTrips = new Trips();
	
	@WebMethod(operationName="PrintAllBooking")
    public String allTrips(){
        return AllTrips.print();
    }
	
	@WebMethod(operationName="AddBooking")
    public String AddTrip(@WebParam(name="PassengerInfo") String p,
    		@WebParam(name="DepartureDate") String dd,
    		@WebParam(name="DepartureAirportID") String da,
    		@WebParam(name="ArrivalDate") String ad,
    		@WebParam(name="ArrivalAirportID") String aa
    		){
        if (AllTrips.addNewBooking(p, dd, da, ad, aa)!=0){
        	return "Booking already exists";
        }
        return "Booking added for " + p;
    }
	
	@WebMethod(operationName="RemoveBooking")
    public String RemoveBooking(@WebParam(name="PassengerInfo") String p){
		if (AllTrips.removeBooking(p) ==0){
        return "Booking was removed.";
		}
		return "Booking to remove was not found.";
    }

	@WebMethod(operationName="UpdateDepartureDate")
    public String UpdateDepartureDate(@WebParam(name="PassengerInfo") String p, @WebParam(name="DepartureDate") String dd){
		if (AllTrips.updateDepDate(p, dd) ==0){
        return "Booking was updated.";
		}
		return "Booking to update was not found.";
    }
	
	@WebMethod(operationName="UpdateDepartureAPID")
    public String UpdateDepartureAPID(@WebParam(name="PassengerInfo") String p, @WebParam(name="DepartureAPID") String da){
		if (AllTrips.updateDepAPID(p, da) ==0){
        return "Booking was updated.";
		}
		return "Booking to update was not found.";
    }
	
	@WebMethod(operationName="UpdateArrivalDate")
    public String UpdateArrivalDate(@WebParam(name="PassengerInfo") String p, @WebParam(name="ArrivalDate") String ad){
		if (AllTrips.updateArrDate(p, ad) ==0){
        return "Booking was updated.";
		}
		return "Booking to update was not found.";
    }
	
	@WebMethod(operationName="UpdateArrivalAPID")
    public String UpdateArrivalAPID(@WebParam(name="PassengerInfo") String p, @WebParam(name="ArrivalAPID") String aa){
		if (AllTrips.updateArrAPID(p, aa) ==0){
        return "Booking was updated.";
		}
		return "Booking to update was not found.";
    }

	public static Trips getAllTrips() {
		return AllTrips;
	}

	public static void setAllTrips(Trips allTrips) {
		AllTrips = allTrips;
	}
 
}