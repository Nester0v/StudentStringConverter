public class JsonStudentConverter implements IStudentStringConverter {

    @Override
    public String converter(Student student) {

        StringBuilder build = new StringBuilder();
        build.append("__________________________________________________________________________________").append('\n');
        build.append("\t")
                .append("\"").append("Имя студента").append("\"").
                append(": ")
                .append("\"").append(student.name).append("\"")
                .append(",").append("\n");

        build.append("\t")
                .append("\"").append("Возраст студента").append("\"").
                append(": ")
                .append("\"").append(student.age).append("\"")
                .append(",").append("\n");

        build.append("\t")
                .append("\"").append("Название факультета").append("\"").
                append(": ")
                .append("\"").append(student.faculty).append("\"")
                .append(",").append("\n");

        build.append("\t")
                .append("\"").append("Размер стипендии").append("\"").
                append(": ")
                .append("\"").append(student.scholarship).append("\"")
                .append(",").append("\n");
        build.append("__________________________________________________________________________________").append('\n');

        return build.toString();
    }
}
