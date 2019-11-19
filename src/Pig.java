import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pig extends Pet {

    void toSound() throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        System.out.println("Enter voice command: ");
        String voice =br.readLine();
        System.out.println(voice);
    }
}
