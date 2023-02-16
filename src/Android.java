public class Android extends Lang{
    public Android(String name, int age, char gender, String email) {
        super(name, age, gender, email);
    }

    @Override
    public String toString() {
        return "Android: "+super.toString();
    }
}
