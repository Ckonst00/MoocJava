public class Main {

    public static void main(String[] args) {
        SimpleDate d1 = new SimpleDate(5, 10, 2000);
        SimpleDate d2 = new SimpleDate(6, 10, 2000);
        SimpleDate d3 = new SimpleDate(5, 11, 2000);
        SimpleDate d4 = new SimpleDate(5, 10, 1999);
        SimpleDate d5 = new SimpleDate(5, 10, 2000);

        System.out.println(d1 + ", hash: " + d1.hashCode());
        System.out.println(d2 + ", hash: " + d2.hashCode());
        System.out.println(d3 + ", hash: " + d3.hashCode());
        System.out.println(d4 + ", hash: " + d4.hashCode());
        System.out.println(d5 + ", hash: " + d5.hashCode());
        System.out.println("d1 equals d5: " + (d1.hashCode() == d5.hashCode()));
    }
}
