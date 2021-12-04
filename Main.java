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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class Main {

    public static RequestWebForDir rwd = new RequestWebForDir(); 

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException,FileNotFoundException, InterruptedException {

        System.out.println("             ,MMM8&&&.\r\n"+
        "        _...MMMMM88&&&&..._\r\n"+
        "     .::'''MMMMM88&&&&&&'''::.\r\n"+
        "    ::     MMMMM88&&&&&&     ::\r\n"+
        "    '::....MMMMM88&&&&&&....::'\r\n"+
        "       `''''MMMMM88&&&&''''`\r\n"+
        "             'MMM8&&&'\n");

        System.out.println(Colores.colores.ANSI_RESET+"\t[ "+Colores.colores.ANSI_CYAN+"Dev DenebS4c"+Colores.colores.ANSI_RESET+" ]\n");

        System.out.print(Colores.colores.ANSI_CYAN+"WordList "+Colores.colores.ANSI_RESET+"(.txt)"+Colores.colores.ANSI_CYAN+" > "+Colores.colores.ANSI_RESET);
        String dir = scan.nextLine();

        System.out.print(Colores.colores.ANSI_CYAN+"URL > "+Colores.colores.ANSI_RESET);
        String URL = scan.nextLine();

        File file = new File(dir);
        Scanner sc = new Scanner(file);

        System.out.println();

        while (sc.hasNextLine()) {
            
            rwd.RequestWithDir(URL+"/"+sc.nextLine());    
            System.out.print(Colores.colores.ANSI_RESET);

        }

        sc.close(); // Close Scanner File
        

    }

}