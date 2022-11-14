Feature: Verify AlMosafer POST APIs



Scenario Outline: Fetch Calendar Fares
	Given Fetch Calendar Fares Payload with "<from>" "<to>" "<departure>" "<return>" "<cabin>" 
	When user calls "GetCalendarFares" with POST https request
	Then the API call is successful with response code 200
	And status in response code is "OK"
	
Examples:
	|cabin	  |to |departure |return 	 |from  |
	|Economy  |JED|2022-11-21|2022-11-29 |DXB|
	