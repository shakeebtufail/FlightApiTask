package resources;

import java.util.ArrayList;
import java.util.List;


import pojo.GetCalendarFares;
import pojo.Legs;
import pojo.Pax;

public class TestDataBuild {
	
	
	public GetCalendarFares getCalendarFares(String from, String to, String departure, String arrival, String cabin) 
	{
		GetCalendarFares getCalendarfares = new GetCalendarFares();
		
		getCalendarfares.setAirline(new ArrayList<String>());
		
		getCalendarfares.setAirports("");
		
		Legs legs = new Legs();
		legs.setOriginId(from);
		legs.setDestinationId(to);
		legs.setDepartureFrom(departure);
		legs.setDepartureTo(arrival);
		List <Legs> legsList = new ArrayList<Legs>();
		legsList.add(legs);
		getCalendarfares.setLegs(legsList);
		getCalendarfares.setStops(new ArrayList<String>());
		
		Pax pax = new Pax();
		pax.setAdult(1);
		pax.setChild(0);
		pax.setInfant(0);
		getCalendarfares.setPax(pax);
		getCalendarfares.setCabin(cabin);
		
		getCalendarfares.setTimeSlots("");
		return getCalendarfares;
		
	}

	
}
