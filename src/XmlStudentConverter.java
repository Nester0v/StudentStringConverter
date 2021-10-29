public class XmlStudentConverter implements IStudentStringConverter {

    @Override
    public String converter(Student student) {

        StringBuilder build = new StringBuilder();
        build.append("<").append("\n");
        build.append("\t")
                .append("<").append("name").append(">")
                .append("<").append(student.name).append(">")
                .append("<").append("/name").append(">")
                .append("\n");

        build.append("\t")
                .append("<").append("age").append(">")
                .append("<").append(student.age).append(">")
                .append("<").append("/age").append(">")
                .append("\n");

        build.append("\t")
                .append("<").append("faculty").append(">")
                .append("<").append(student.faculty).append(">")
                .append("<").append("/faculty").append(">")
                .append("\n");

        build.append("\t")
                .append("<").append("scholarship").append(">")
                .append("<").append(student.scholarship).append("грн").append(">")
                .append("<").append("/scholarship").append(">")
                .append("\n");

        build.append(">").append('\n');

        return build.toString();
    }
}
