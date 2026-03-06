package feb_24_2026.type_casting;

public class JavaApp {

    public static void execution() {

        // Uncomment if you want to test typecasting methods
        /*
        TypeCasting.widening();
        TypeCasting.narrowing();
        TypeCasting.boxing();
        TypeCasting.unboxing();
        */

        Employee e = new SoftwareDeveloper();
        e.entry();
        e.meeting();
        e.exit();

        SoftwareDeveloper sd = (SoftwareDeveloper) e;
        sd.task();
        sd.reverseTk();

        System.out.println("----------------------");

        Employee e1 = new SoftwareTester();
        e1.entry();
        e1.meeting();
        e1.exit();

        SoftwareTester st = (SoftwareTester) e1;
        st.task();
        st.reverseTk();
    }
}