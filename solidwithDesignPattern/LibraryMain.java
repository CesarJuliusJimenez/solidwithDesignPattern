package solidwithDesignPattern;
import java.util.*;

public class LibraryMain {

    public static void main(String[] args) {

        Map<String, ResourceBrowser> resourceTypes = new HashMap<>();

        Student student1 = new Student("Juan");
        Student student2 = new Student("Pedro");
        Student student3 = new Student("Jose");

        resourceTypes.put("book", new ResourceType());
        Resources book1 = new Resources("book", "Once a upon a time");
        resourceTypes.put("journal", new ResourceType());
        Resources journal = new Resources("journal", "The Journal of Mr. Pepper");
        resourceTypes.put("thesis", new ResourceType());
        Resources thesis = new Resources("thesis", "Cure and Treatment for the virus COVID-19 ");
        resourceTypes.put("audio book", new ResourceType());
        Resources audioBook = new Resources("audio book", "La la land");

        ResourceAccess resourceAccess = new ResourceAccess(resourceTypes);

        resourceAccess.borrowResource(student1, book1);
        System.out.println();

        resourceAccess.borrowResource(student2, journal);
        System.out.println();

        resourceAccess.borrowResource(student2, thesis);
        System.out.println();

        resourceAccess.borrowResource(student3, audioBook);

    }
}