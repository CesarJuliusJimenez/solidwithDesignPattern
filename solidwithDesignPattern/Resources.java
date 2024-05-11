package solidwithDesignPattern;
public class Resources {

    private final String title;
    private final String resourceType;

    public Resources(String resourceType, String title) {
        this.title = title;
        this.resourceType = resourceType;
    }

    public String getTitle() {
        return title;
    }

    public String getResourceType() {
        return resourceType;
    }

}
