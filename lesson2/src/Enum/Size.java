package Enum;

/**
 * Created by katokda on 18.07.2017.
 */
public enum Size {
    A(5),B(10), C(15), D(20);
    private int value;
    private Size(int value) {
        this.value = value;
    }

}

