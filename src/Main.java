import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {

        IStudentStringConverter converter1 = randomConvert();
        Student stud1 = new Student("Олег",
                "Радиоэлектроники, телекомуникаций и компютерных сетей", 19, new BigDecimal(1920));
        String result1 = converter1.converter(stud1);

        System.out.println(result1);

        IStudentStringConverter converter2 = randomConvert();


    }

    private IStudentStringConverter randomConvert() {
        double random = Math.random();
        if (Math.random() > 0.5) {
            return new JsonStudentConverter();
        } else if (random > 0.45) {
            return new XmlStudentConverter();
        } else {
            return new KeyValueStudentConverter();
        }
    }
}
