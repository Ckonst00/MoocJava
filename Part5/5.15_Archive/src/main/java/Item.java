public class Item {

    private String name;
    private String id;

    public Item(String name, String id)  {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return this.id + ": " + this.name;
    }
}

