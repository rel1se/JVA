package practice7.Decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer1 = new JavaDeveloper();
        System.out.println(developer1.makeJob());
        Developer developer2 = new SeniorJavaDeveloper(new JavaDeveloper());
        System.out.println(developer2.makeJob());
        Developer developer3 = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(developer3.makeJob());
    }
}
