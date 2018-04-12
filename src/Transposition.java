/**
 * Created by mikha on 12.04.2018.
 */
public class Transposition {
    final static int w = 4;
    public static void print_matrix(String s){
        int len = s.length()/w;
        if (s.length()%4!=0) len+=1;
        char [][]chars = new char[w][len];
        int u = 0;
        for (int i=0;i<w;i++){
            for (int j=0;j<len;j++){
                chars[i][j]=s.toCharArray()[u];
                u++;
                if (u>=s.length()) break;
            }
            if (u>=s.length()) break;
        }
        for (int i=0;i<w;i++){
            for (int j=0;j<len;j++){
                System.out.print(chars[i][j]);
            }
            System.out.println();
        }
    }
    public static void shifr(String s){
        int len = s.length()/w;
        if (s.length()%4!=0) len+=1;
        char [][]chars = new char[w][len];
        int u = 0;
        for (int i=0;i<w;i++){
            for (int j=0;j<len;j++){
                chars[i][j]=s.toCharArray()[u];
                u++;
                if (u>=s.length()) break;
            }
            if (u>=s.length()) break;
        }
        String result="";
        for (int i=0;i<len;i++){
            for (int j=0;j<w;j++){
                result+=chars[j][i];
            }
        }
        System.out.println(result);
    }
}
