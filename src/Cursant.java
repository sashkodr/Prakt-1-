public class Cursant extends Person {
    String rank;
    String academy;

    public Cursant(String name, int age, String gender, String rank, String academy) {
        super(name, age, gender);
        this.rank = rank;
        this.academy = academy;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Звання: " + rank + ", Академія: " + academy);
    }

    @Override
    public void work() {
        System.out.println("Курсант тренується");
    }
}
