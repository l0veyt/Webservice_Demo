package com.xinlee.ws;

/**
 * Created by Xin.Lee on 2016/11/30.
 * 使用JDK调用一个Webservice服务
 */
public class App {

    public static void main(String[] args) {
        /**
         * WSDL:<service name="HelloServiceService">
         */
        HelloServiceService hss = new HelloServiceService();

        /**
         * WSDL:<port name="HelloServicePort" binding="tns:HelloServicePortBinding">
         */
        HelloService hs = hss.getHelloServicePort();

        /**
         * 在HelloService接口中可以找到sayHello方法
         */
        String info = hs.sayHello("XinLee");
        System.out.println("Webservice的客户端:调用了sayHello方法,返回的数据为:" + info);
    }

}
