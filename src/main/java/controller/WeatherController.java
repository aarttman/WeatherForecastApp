package controller;

import api.WeatherApiService;
import api.CoordinateService;
import util.ApiConfig;
public class WeatherController {
    public static void main(String[] args) throws Exception{
        CoordinateService service = new CoordinateService();

        service.fetchCoordinates("London");

//        System.out.println(ApiConfig.GEOCODING_KEY);
   }
}
