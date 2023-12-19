// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Create group1
        HashSet<String> studentGroup1 = new HashSet<>();
        studentGroup1.add("Pooh");
        studentGroup1.add("J");
        studentGroup1.add("Gut-jung");
        studentGroup1.add("Palm");
        System.out.print("Group 1 : ");
        //print member
        for (String student : studentGroup1) {
            System.out.print(student+" ");
        }
        System.out.println();

        //Create group1
        HashSet<String> studentGroup2 = new HashSet<>();
        studentGroup2.add("Phoom");
        studentGroup2.add("Gut-jung");
        studentGroup2.add("Night");
        System.out.print("Group 2 : ");
        //print member
        for (String student : studentGroup2) {
            System.out.print(student+" ");
        }
        System.out.println();

        //Merge member at group1
        studentGroup1.addAll(studentGroup2);

        //print all member
        System.out.print("Merged Group: ");
        for (String student : studentGroup1) {
            System.out.print(student + " ");
        }
        System.out.println();


    }
}