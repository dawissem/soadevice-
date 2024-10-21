package com.dawissem.server;

import com.dawissem.metier.BanqueService;
import jakarta.xml.ws.Endpoint;
public class ServeurJaxWS {
    public class Main {
        public static void main(String[] args) {

            String url = "http://0.0.0.0:8686/";
            Endpoint.publish(url, new BanqueService());
            System.out.println("web Service deploayer sure " + url);
        }
    }
}
