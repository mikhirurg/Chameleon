

import java.util.Scanner;

import static java.lang.System.out;

public class Encrypt {
    Encrypt(String user){
        Scanner scn=new Scanner(System.in);
        boolean isStart=true;
        while(isStart) {
            out.println(user+">");
            String commandDec=scn.nextLine();
            switch (commandDec){
                case "/exit":
                    new Exit();
                    break;

                case "/stop":
                    out.println("Конец работы шифровальщика");
                    isStart=false;
                    break;


                default:
                    new Error(commandDec);
            }
        }
    }
}
