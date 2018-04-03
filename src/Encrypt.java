import java.util.Scanner;

import static java.lang.System.out;

public class Encrypt {
    Encrypt(String user){
        out.println("Здесь будет шифровальщик");
        Scanner scn=new Scanner(System.in);
        boolean isStart=true;
        while(isStart) {
            String commandEnc=scn.nextLine();
            switch (commandEnc){

                case "/stop":
                    isStart=false;
                    break;
            }
        }
    }
}
