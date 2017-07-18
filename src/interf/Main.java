package interf;

/**
 * Created by katokda on 17.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        MagneticKey magnkey =new MagneticKey();
        magnkey.insertKey();
        UsualKey usualkey= new UsualKey();
        usualkey.insertKey();

    }
}
