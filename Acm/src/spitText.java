import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;


public class spitText {

    /**
     * @param args
     */
    public static void main(String[] args) {
try {
    BufferedReader in;
        in = new BufferedReader(new InputStreamReader( new  FileInputStream(new File("D://1.txt")),"gbk"));
        String tempchar;
        while ((tempchar = in.readLine()) != null) {
            System.out.println(tempchar.split("，")[1]);
        }
    } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    }
}
