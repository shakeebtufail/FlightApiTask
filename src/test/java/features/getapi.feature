Feature: Verify AlMosafer GET APIs



Scenario: Fetch Airports
	Given Fetch Airports Payload 
	When user calls "GetAirports" with GET https request
	Then status in fetch airports response code is 200
	And status in fetch airports response is "OK"