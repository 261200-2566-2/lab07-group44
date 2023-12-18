// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HashSet<String> student = new HashSet<>();
        student.add("Pooh");
        student.add("J");
        student.add("Gut-jung");
        student.add("Night");

        System.out.println("There are : "+student.size()+ " student.");
        student.remove("Pooh");
        System.out.println("There are : "+student.size()+ " student.");
    }
}