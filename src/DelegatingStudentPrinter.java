public class DelegatingStudentPrinter implements IStudentPrinter{
    private IStudentPrinter[] printers;

    public DelegatingStudentPrinter(IStudentPrinter[] printers) {
        this.printers = printers;
    }

    @Override
    public void print(Student stud){
        for (IStudentPrinter printer : printers){
            printer.print(stud);
        }
    }
}
