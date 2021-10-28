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

    }

    private void doPrinterTask(){
        IStudentPrinter[] printers = new IStudentPrinter[]{
                new ConsolePrinter(new XmlStudentConverter()),
                new ConsolePrinter(new JsonStudentConverter()),
                new ConsolePrinter(new KeyValueStudentConverter()),
                new AbsencePrinter()
        };

        Student stud1 = new Student("Олег",
                "Радиоэлектроники, телекомуникаций и компютерных сетей", 19, new BigDecimal(1920));
        IStudentPrinter printer = new DelegatingStudentPrinter(printers);
        printer.print(stud1);

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
