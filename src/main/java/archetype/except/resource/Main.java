package archetype.except.resource;

public class Main {
    public static void main(String[] args) {
        Resource resource = new Resource();

        try {
            ResourceAction.upload(resource);
        } catch (ResourceNotFoundException e) {
            System.out.println("Try another resource.");
        }
    }
}
