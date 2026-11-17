package parser;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;

import model.WeatherObject;

import java.io.IOException;

public class GeocodingParser {

    private ObjectMapper objectMapper;

    public GeocodingParser() {
        this.objectMapper = new ObjectMapper();
    }

    public WeatherObject parseWeatherData(String placeName, String jsonString) throws JsonMappingException, JsonParseException, IOException{
        JsonNode jsonNode = this.objectMapper.readTree(jsonString);
        WeatherObject weatherObject = new WeatherObject(placeName);

        String currentWeather = jsonNode.get("weather").get(0).get("main").asText();
        weatherObject.setCurrentWeather(currentWeather);

        String currentWeatherDescription = jsonNode.get("weather").get(0).get("description").asText();
        weatherObject.setCurrentWeatherDescription(currentWeatherDescription);

        double temperature = jsonNode.get("main").get("temp").asDouble();
        weatherObject.setTemperature(temperature);

        double feelsLikeTemperature = jsonNode.get("main").get("feels_like").asDouble();
        weatherObject.setFeelsLikeTemperature(feelsLikeTemperature);

        int humidity = jsonNode.get("main").get("humiditiy").asInt();
        weatherObject.setHumidity(humidity);

        return weatherObject;
    }
}
