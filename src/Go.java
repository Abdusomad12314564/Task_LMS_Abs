public class Go extends Lang{
    public Go(String name, int age, char gender, String email) {
        super(name, age, gender, email);
    }

    @Override
    public String toString() {
        return "Go: "+super.toString();
    }
}
