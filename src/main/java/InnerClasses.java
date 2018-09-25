package main.java;

/**
 * Created by vikasnaiyar on 25/09/18.
 */
public class InnerClasses {

    private static int multiplier = 2;

    private int cubeMultipler = 3;

    public InnerClasses(int cubeMultipler) {
        this.cubeMultipler = cubeMultipler;
    }

    // Static class
    static class MyClass{

        public int square(int a) {
            return a * multiplier;
        }
    }


    // Inner class
    class NonStatic {


        public double cube(int a) {
            return  Math.pow(a, cubeMultipler);
        }

    }



    public void print(double data) {

        // local inner class
        class Logger {

            String name;

            public  Logger(String name) {
                this.name = name;
            }

            public void log(String str) {
                System.out.println(this.name + " : " + str);
            }

        }


        Logger logger = new Logger("local logger");
        logger.log(""+data);
    }

    public void printKdb() {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.print("Hello word");
            }
        };

        new Thread(r).start();
    }

}
