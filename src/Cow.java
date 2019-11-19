import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cow extends Pet {

    int makeMilk;

    public int getMakeMilk(int liters) {
        return this.makeMilk;
    }

    public void setMakeMilk(int liters) {
        this.makeMilk = liters;
    }

    Cow(int Weight, int Age, int EatTime1){
        this.weight = Weight;
        this.age = Age;
        this.eatTime1 = EatTime1;
    }

    void toSound() throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        System.out.println("Enter voice command: ");
        String voice =br.readLine();
        System.out.println(voice);
    }
}
