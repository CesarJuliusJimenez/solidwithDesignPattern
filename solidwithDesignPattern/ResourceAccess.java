package solidwithDesignPattern;
import java.util.*;

public class ResourceAccess {

    private final Map<String, ResourceBrowser> resourceTypes;

    public ResourceAccess(Map<String, ResourceBrowser> resourceTypes) {
        this.resourceTypes = resourceTypes;
    }

    public void borrowResource(Student student, Resources resources) {
        String resourceType = resources.getResourceType();
        ResourceBrowser resourceBorrow = resourceTypes.get(resourceType);

        if (!resourceTypes.containsKey(resourceType)) {
            throw new IllegalArgumentException("Invalid resource type: " + resourceType);
        }

        resourceBorrow.borrowResource(student, resources);
    }
}
