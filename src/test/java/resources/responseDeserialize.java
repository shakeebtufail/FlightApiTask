package resources;

import pojo.GetAirports;

public class responseDeserialize {
	
	public GetAirports getAirports()
	{
		GetAirports getAirportsObj = new GetAirports();
		
		getAirportsObj.getAirline();
		getAirportsObj.getAirport();
		
		return getAirportsObj;
	}

}
