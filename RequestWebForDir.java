/*
# [+]==================[Creditos]==================[+]
#  #                                                #
#  #     Devs: Ghosty / xNullCode / Deneb           #
#  #     Discord:                                   #
#  #        Ghostykdi#7168                          #
#  #     Derechos de Author:                        #
#  #         Ghosty / xNullCode / Deneb             #
# [+]==================[Creditos]==================[+]
# 
*/

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;



public class RequestWebForDir {
    
    
    public String RequestWithDir(String web) throws IOException{
        URL url = new URL(web);
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        http.setRequestProperty("Accept", "application/json");
        if (http.getResponseCode() == 404){
            System.out.println(Colores.colores.ANSI_RESET+"["+Colores.colores.ANSI_RED+"X"+Colores.colores.ANSI_RESET+"] " + Colores.colores.ANSI_CYAN + web + " " +Colores.colores.ANSI_RED+ http.getResponseCode() + " " + http.getResponseMessage());
        } else if ((http.getResponseCode() == 403)){
            System.out.println(Colores.colores.ANSI_RESET+"["+Colores.colores.ANSI_YELLOW+"-"+Colores.colores.ANSI_RESET+"] "+ Colores.colores.ANSI_CYAN + web + " " +Colores.colores.ANSI_YELLOW+ http.getResponseCode() + " " + http.getResponseMessage());
        } else {
            System.out.println(Colores.colores.ANSI_RESET+"["+Colores.colores.ANSI_GREEN+"+"+Colores.colores.ANSI_RESET+"] "+ Colores.colores.ANSI_CYAN + web + " " +Colores.colores.ANSI_GREEN+ http.getResponseCode() + " " + http.getResponseMessage());
        }
        http.disconnect();
        return web;
    }

}
