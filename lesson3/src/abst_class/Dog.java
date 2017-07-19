package abst_class;

/**
 * Created by katokda on 17.07.2017.
 */
public class Dog extends Dog.Fauna {
    public String breed;
    @Override
    public  void Show()
    {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.breed);
    }


    /**
     * Created by katokda on 17.07.2017.
     */
    public abstract static class Fauna {
        public String name;
        public int age;
        public abstract void Show();
    }
}
