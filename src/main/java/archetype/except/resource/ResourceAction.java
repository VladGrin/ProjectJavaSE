package archetype.except.resource;

import java.util.Objects;

public class ResourceAction {

    public static void upload(Resource resource) throws ResourceNotFoundException {
        if(Objects.isNull(resource) || !resource.isExist() || !resource.isAvailable()) {
            throw new ResourceNotFoundException("resource not found");
        }
        System.out.println("Using resource");
        // logic
    }
}
