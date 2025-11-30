import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        String list = "";
        for (int i = 0; i < this.elements.size(); i++) {
            list += this.elements.get(i);
            if (i < this.elements.size() - 1) {
                list += "\n"; // add newline only between elements
            }
        }

        if (this.elements.size() == 1) {
            return "The collection " + this.name + " has 1 element:\n" + list;
        } else {
            return "The collection " + this.name + " has " + this.elements.size() + " elements:\n" + list;
        }
    }
}
