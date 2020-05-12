import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        StringTokenizer st = new StringTokenizer(s,":");
        String s1 = st.nextToken();
        String s2 = st.nextToken();
        String s3 = st.nextToken();
        int hr,min,sec;
        hr = Integer.parseInt(s1);
        min = Integer.parseInt(s2);

        if(s3.contains("PM"))
        {
            if(hr != 12)
             hr += 12;
            if(hr == 12)
                hr = 12;
            s3 = s3.replace("PM","");
        }
        else
            {
            s3 = s3.replace("AM","");
            if(hr == 12)
                hr = 0;
        }
        return(String.format("%02d",hr)+":"+String.format("%02d",min)+":"+s3);

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
