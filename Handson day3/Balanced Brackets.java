import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        Stack<Character> st = new Stack<Character>();
        boolean bo = true;
        for(int j= 0;j<s.length();j++){
            char c = s.charAt(j);
            if(c == '(' || c == '{' || c=='['){
                st.push(c);
            }
            else if (!st.isEmpty()){
                if(c == ')'  && st.peek() == '('){
                    st.pop();
                }
                else if(c == '}' && st.peek() == '{'){
                    st.pop();
                }
                else if(c == ']' && st.peek() == '['){
                    st.pop();
                }
                }
                else{
                    bo = false;
                }
            }
             if(st.isEmpty() && bo){
                    return("YES");
                }
                else{
                    return("NO");
                }
        }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
