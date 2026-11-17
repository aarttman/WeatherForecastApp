package parser;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.WeatherObject;

import java.io.IOException;

public class WeatherParser {

    private ObjectMapper objectMapper;

    public WeatherParser() {
        this.objectMapper = new ObjectMapper();
    }

    public WeatherObject parseWeatherData(String placeName, String jsonString, WeatherObject weatherObject) throws JsonMappingException, JsonParseException, IOException {
        JsonNode jsonNode = this.objectMapper.readTree(jsonString);

        String currentWeather = jsonNode.get("weather").get(0).get("main").asText();
        weatherObject.setCurrentWeather(currentWeather);

        String currentWeatherDescription = jsonNode.get("weather").get(0).get("description").asText();
        weatherObject.setCurrentWeatherDescription(currentWeatherDescription);

        double temperature = jsonNode.get("main").get("temp").asDouble();
        weatherObject.setTemperature(temperature);

        double feelsLikeTemperature = jsonNode.get("main").get("feels_like").asDouble();
        weatherObject.setFeelsLikeTemperature(feelsLikeTemperature);

        int humidity = jsonNode.get("main").get("humidity").asInt();
        weatherObject.setHumidity(humidity);

        return weatherObject;
    }
}
