package basic.access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("Call Public Method " + publicField);
    }

    void defaultMethod() {
        System.out.println("Call Default Method " + defaultField);
    }

    private void privateMethod() {
        System.out.println("Call private Method " + privateField);
    }

    public void innerAccess() {
        System.out.println("Inner Access");
        publicField = 10;
        defaultField = 20;
        privateField = 30;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
