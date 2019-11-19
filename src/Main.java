import java.io.IOException;

public class Main {
    public static Setter tuzik = new Setter(20,7, 8, "работа");
    public static Pointer sharik = new Pointer(15,5,8,"коричневый");
    public static Cat murka = new Cat(4,2,8);
    public static Master Hozjain_dobr = new Master("Слава");
    public static Master Hozjain_zloy = new Master("Пётр");
    public static Cow burenka = new Cow(4,3,1);

    public static void main(String[] args) throws IOException {
        murka.SetMouse(5);
        tuzik.person = Hozjain_dobr;
        tuzik.person.getFood(2,1, "Тузик, кушай chappi");
        sharik.person = Hozjain_zloy;
        sharik.person.getFood(2,1,"Пошёл вон Шарик");
        murka.toMouse();
        murka.toMyau();
        System.out.println("Словила мышей = " + murka.GetMouse());
        sharik.preserve();
        tuzik.preserve();
        tuzik.dolg();
        burenka.getMakeMilk(5);

        System.out.println(Hozjain_dobr.GetName());
    }
}
