
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }
    
    @Override
    public boolean equals(Object compared) {
        // if the variables are located in the same place, they are the same
        if (this == compared) {
            return true;
        }

        // if the object is not an instance of Person, they are not the same
        if (!(compared instanceof Person)) {
            return false;
        }

        // cast the object to Person
        Person other = (Person) compared;

        // compare all fields (note: birthday uses its own equals method)
        return Objects.equals(this.name, other.name) &&
               Objects.equals(this.birthday, other.birthday) &&
               this.height == other.height &&
               this.weight == other.weight;
    }
    
    

    // implement an equals method here for checking the equality of objects
}
