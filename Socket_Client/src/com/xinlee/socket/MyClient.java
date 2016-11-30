package com.xinlee.socket;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * Created by Xin.Lee on 2016/12/1.
 * Socket通信客户端
 */
public class MyClient {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.0.103", 8080);
        OutputStream os = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        bw.write("xinlee");
        System.out.println("客户端已发送数据...");
        bw.close();
        os.close();
        socket.close();
    }
}
