package feb_24_2026.abstraction;

public class JavaScript extends ProgrammingLanguage 
        implements FrontEndTechnologies, BackEndTechnologies {

    @Override
    public void backEndLayer() {
        System.out.println("Compatible with Database");
    }

    @Override
    public void frontEndLayer() {
        System.out.println("Compatible with HTML and CSS");
    }

    @Override
    public void feature() {
        System.out.println("Object Oriented Programming Language");
    }
}