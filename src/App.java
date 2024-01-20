import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        StringBuilder sb = new StringBuilder();

        for(int i = a.length() -1; i >= 0; i--){
          sb.append(a.charAt(i));
        }

        System.out.println(sb.toString());
    }
}
