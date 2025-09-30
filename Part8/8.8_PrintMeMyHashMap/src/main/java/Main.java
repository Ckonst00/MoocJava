import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        System.out.println("printKeys:");
        Program.printKeys(hashmap);

        System.out.println("---");

        System.out.println("printKeysWhere(\"i\"):");
        Program.printKeysWhere(hashmap, "i");

        System.out.println("---");

        System.out.println("printValuesOfKeysWhere(\".e\"):");
        Program.printValuesOfKeysWhere(hashmap, ".e");
    }
}
