import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Cat extends Pet{
    int mouseCatched;

    public void SetMouse(int kol_vo){
        this.mouseCatched = kol_vo;
    }

    public int GetMouse(){
        return this.mouseCatched;
    }

    Cat(int Weight, int Age, int EatTime1){
        this.weight = Weight;
        this.age = Age;
        this.eatTime1 = EatTime1;
    }

    void toMouse(){
        System.out.println("Словила мышку!");

    }

    void toMyau() throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        System.out.println("Enter voice command: ");
        String voice =br.readLine();
        System.out.println(voice);
    }
}
