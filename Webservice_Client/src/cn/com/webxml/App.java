package cn.com.webxml;

import java.util.List;

/**
 * Created by Xin.Lee on 2016/11/30.
 * 使用JDK调用天气预报Webservice服务
 */
public class App {

    public static void main(String[] args) {
        WeatherWS ws = new WeatherWS();
        /**
         * 动态代理：获取到的并不是WeatherWSSoap接口的实例，而是代理对象
         */
        WeatherWSSoap proxy = ws.getWeatherWSSoap();
        /**
         * theCityCode：城市名称
         * theUserId：发布该Webservice服务的网站为收费用户所提供的UserId
         */
        ArrayOfString aos = proxy.getWeather("北京", null);
        List<String> weatherInfoList = aos.getString();
        for (String weatherInfo : weatherInfoList) {
            System.out.println(weatherInfo);
        }
    }
}