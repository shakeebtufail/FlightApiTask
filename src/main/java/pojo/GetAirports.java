package pojo;

import java.util.List;

public class GetAirports {
	
	private List<String> airline;
	private List<Airport> airport;
	
	public List<String> getAirline() {
		return airline;
	}
	public void setAirline(List<String> airline) {
		this.airline = airline;
	}
	public List<Airport> getAirport() {
		return airport;
	}
	public void setAirport(List<Airport> airport) {
		this.airport = airport;
	}

}
