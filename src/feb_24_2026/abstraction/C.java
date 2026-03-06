package feb_24_2026.abstraction;
public class C extends A implements I1, I2 {

    @Override
    public void i2() {
        System.out.println("Method from Interface I2");
    }

    @Override
    public void i1() {
        System.out.println("Method from Interface I1");
    }

    @Override
    public void a() {
        System.out.println("Abstract method implemented from Class A");
    }
}