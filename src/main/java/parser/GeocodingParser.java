package parser;

import model.WeatherObject;


public class GeocodingParser {

    public WeatherObject parseWeatherData(String placeName, String jsonString) {

        WeatherObject weatherObject = new WeatherObject(placeName);

        return weatherObject;
    }
}
