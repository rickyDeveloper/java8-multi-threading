package main.java;

/**
 * Created by vikasnaiyar on 25/09/18.
 */
public class Main {

    public static void main(String[] args) {

        InnerClasses.MyClass myClass = new InnerClasses.MyClass();

        System.out.println(myClass.square(2));

        InnerClasses innerClasses = new InnerClasses(3);

        InnerClasses.NonStatic nonStatic = innerClasses.new NonStatic();

        //System.out.println(nonStatic.cube(2));

        innerClasses.print(nonStatic.cube(2));

        innerClasses.printKdb();
    }
}
