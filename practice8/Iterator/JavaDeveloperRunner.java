package practice8.Iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Maven"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Botoev Vyacheslav",skills);

        Iterator iterator = javaDeveloper.getIterator();

        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills:");
        while(iterator.hasNext()){
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
