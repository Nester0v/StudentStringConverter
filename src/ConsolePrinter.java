public class ConsolePrinter implements IStudentPrinter{
    private IStudentStringConverter converter;

    public ConsolePrinter(IStudentStringConverter converter) {
        this.converter = converter;
    }

    @Override
    public void print(Student stud) {
       String result = converter.converter(stud);
        System.out.println(result);
    }
}
