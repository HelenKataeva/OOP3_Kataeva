import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Group group101 = new Group(1, 100);
        Group group102 = new Group(2, 200);
        Group group103 = new Group(3, 300);
        Group group104 = new Group(4, 400);

        List<Group> educationalGroups = new ArrayList<>();
        educationalGroups.add(group101);
        educationalGroups.add(group102);
        educationalGroups.add(group103);
        educationalGroups.add(group104);

        Stream stream = new Stream(educationalGroups);
        StreamIterator iterator = new StreamIterator(stream);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        StreamService service = new StreamService(stream);
        for (Group group : service.getSorted()){
            System.out.println(group);
        }
    }
}

//
//
//        StudentGroupService service = new StudentGroupService(studentGroup);
//        for (Student student : service.getStudents()){
//            System.out.println(student);
//        }
