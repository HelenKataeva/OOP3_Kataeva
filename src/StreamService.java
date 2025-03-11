import java.util.ArrayList;
// import java.util.Collections;
import java.util.List;

public class StreamService {
    private Stream educationalGroups;

    public StreamService(Stream educationalGroups) {
        this.educationalGroups = educationalGroups;
    }

    public Stream getEducationalGroups() {
        return educationalGroups;
    }
    public void removeStudent(Group group) {
        for (Group groupItem : educationalGroups){
            if(group.equals(groupItem)){
                educationalGroups.remove(group);
            }
        }
    }
    public List<Group> getSorted(){
        List<Group> studentList = new ArrayList<>(educationalGroups.getEducationalGroups());
        studentList.sort(new StreamComparator());
        return studentList;
    }
}