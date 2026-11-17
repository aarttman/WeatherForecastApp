package controller;

import api.CoordinateService;
import parser.GeocodingParser;

public class WeatherController {
    public static void main(String[] args) throws Exception{
        GeocodingParser parser = new GeocodingParser();
        CoordinateService service = new CoordinateService();

        String search = "London";
        service.fetchCoordinates(search);



        String jsonString = "";
        parser.parseWeatherData("search", jsonString);

   }
}
