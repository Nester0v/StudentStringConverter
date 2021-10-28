public class KeyValueStudentConverter implements IStudentStringConverter {
    @Override
    public String converter(Student student) {

        StringBuilder build = new StringBuilder();
        build.append("Имя студента: ").append(student.name).append("\n");
        build.append("Возраст: ").append(student.age).append("\n");
        build.append("Название факультета: ").append(student.faculty).append("\n");
        build.append("Размер стипендии: ").append(student.scholarship).append("\n");

        return build.toString();
    }
}
