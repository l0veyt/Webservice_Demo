package com.xinlee.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Xin.Lee on 2016/12/1.
 * Socket通信服务端
 */
public class MyServer {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8080);
        while (true) {
            Socket socket = ss.accept();
            /**
             * 从客户端读取数据
             */
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String info = br.readLine();
            System.out.println("从客户端发送过来的数据为:" + info);
            br.close();
            is.close();
            socket.close();
        }
    }
}
