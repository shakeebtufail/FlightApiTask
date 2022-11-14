package pojo;

import java.util.List;

public class GetCalendarFares {
	
	private String cabin;
	private String airports;
	private Pax pax;
	private String timeSlots;
	private List<String> stops;
	private List<Legs> legs;
	private List<String> airline;
	
	public String getCabin() {
		return cabin;
	}
	
	public String getAirports() {
		return airports;
	}
	public void setAirports(String airports) {
		this.airports = airports;
	}
	public Pax getPax() {
		return pax;
	}
	public void setPax(Pax pax) {
		this.pax = pax;
	}
	public String getTimeSlots() {
		return timeSlots;
	}
	public void setTimeSlots(String timeSlots) {
		this.timeSlots = timeSlots;
	}
	public List<String> getStops() {
		return stops;
	}
	public void setStops(List<String> stops) {
		this.stops = stops;
	}
	public List<Legs> getLegs() {
		return legs;
	}
	public void setLegs(List<Legs> legs) {
		this.legs = legs;
	}
	public void setCabin(String cabin) {
		this.cabin = cabin;
	}
	public List<String> getAirline() {
		return airline;
	}
	public void setAirline(List<String> airlines) {
		this.airline = airlines;
	}
	

}
