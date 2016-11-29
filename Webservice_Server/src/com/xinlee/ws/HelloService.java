package com.xinlee.ws;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created by Xin.Lee on 2016/11/30.
 * 使用JDK发布一个Webservice服务
 */
@WebService
public class HelloService {

    private static String address = "http://192.168.0.103:8080/hello";  // 提供服务的地址
    private static Object implementor = new HelloService();             // 提供服务的实例

    public static void main(String[] args) {
        Endpoint.publish(address, implementor);
    }

    // 合法的Web方法（不能为static，不能为final）
    public String sayHello(String name) {
        System.out.println("Webservice的服务端:sayHello方法被调用了,传递的参数为:" + name);
        return "hello" + name;
    }

}
