public class Java extends Lang{
    public Java(String name, int age, char gender, String email) {
        super(name, age, gender, email);
    }

    @Override
    public String toString() {
        return "Java: "+super.toString();
    }
}
