package solidwithDesignPattern;
public class ResourceType implements ResourceBrowser {

    public void borrowResource(Student student, Resources resources) {
        System.out.println(student.getName() + " borrowed a [" + resources.getResourceType() + "] book type. With a title of [" + resources.getTitle() + "]");
    }
}
