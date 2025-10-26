package org.nes.util;

import java.net.*;
import java.io.*;

public class InternetAdress {

    public static String getUserPublicIp() {
        String ip = "";
        try {
            URL whatismyip = new URL("http://checkip.amazonaws.com");
            BufferedReader in = null;
            in = new BufferedReader(new InputStreamReader(
                    whatismyip.openStream()));
            ip = in.readLine();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return ip;
    }

}
