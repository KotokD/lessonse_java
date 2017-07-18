package abst_class;

import java.util.Random;

/**
 * Created by katokda on 17.07.2017.
 */
public class Worm extends Dog.Fauna {
    public int length;
    public int diameter;
    public void Crowl()
    {
        String[] randomStr = {"west","east","north","south"};
        Random random = new Random();
        String str=randomStr[random.nextInt(randomStr.length)];
        System.out.println(str);

    }

    @Override
    public  void Show() {
        System.out.println(this.name);
        System.out.println(this.age);
        this.Crowl();

    }
    public static void main(String[] args) {
        Worm worm=new Worm();
        worm.name="Dasha";
        worm.age=23;
        worm.diameter=10;
        worm.Show();

    }
}
