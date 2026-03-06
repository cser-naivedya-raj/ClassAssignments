package feb_24_2026.abstraction;

public class JavaApp {

    public static void execution() {

        // ---- State Example (Abstract Class) ----
        System.out.println("---- State Example ----");
        // State s = new State(); // Reminder: Cannot instantiate an abstract class!
        
        Rajasthan r = new Rajasthan();
        Bihar k = new Bihar();

        r.regionalLanguage();
        k.regionalLanguage();

        // ---- Programming Language Example (Interface/Abstract) ----
        System.out.println("\n---- Programming Language Example ----");

        JavaScript js = new JavaScript();
        js.feature();
        js.frontEndLayer();
        js.backEndLayer();

        // ---- Multiple Inheritance Example (Interfaces) ----
        System.out.println("\n---- Multiple Inheritance Example ----");

        C obj = new C();
        obj.a();
        obj.i1();
        obj.i2();
    }
}