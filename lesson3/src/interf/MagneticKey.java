package interf;

/**
 * Created by katokda on 17.07.2017.
 */
public class MagneticKey implements Key {

    @Override
    public int reduceDurability() {
        return 0;
    }
    @Override
    public void insertKey(){
        System.out.println("MagneticKey");
    }
}
