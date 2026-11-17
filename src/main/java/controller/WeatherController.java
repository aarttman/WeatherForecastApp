package controller;

import api.CoordinateService;
import model.WeatherObject;
import parser.WeatherParser;
import service.WeatherService;


public class WeatherController {
    public static void main(String[] args) throws Exception {
        WeatherService service = new WeatherService();

        String search = "London";

        WeatherObject weatherObject = service.getWeather(search);

        System.out.println(weatherObject.getPlaceName());
        System.out.println(weatherObject.getCurrentWeather());
        System.out.println(weatherObject.getCurrentWeatherDescription());
        System.out.println(weatherObject.getTemperature());
        System.out.println(weatherObject.getFeelsLikeTemperature());
        System.out.println(weatherObject.getHumidity());


   }
}
