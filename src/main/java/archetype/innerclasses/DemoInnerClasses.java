package archetype.innerclasses;

public class DemoInnerClasses {
    public static void main(String[] args) {
        Student.Address address = new Student().new Address();
        address.setCity("");
        Student student = new Student();
        System.out.println(student.getAddress());
    }
}
