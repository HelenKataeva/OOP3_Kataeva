import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<Group> {
    private List<Group> educationalGroups;

    public Stream(List<Group> educationalGroups) {
        this.educationalGroups = educationalGroups;
    }

    public List<Group> getEducationalGroups() {
        return educationalGroups;
    }
    public void addEducationalGroups(Group group) {educationalGroups.add(group);}

    @Override
    public Iterator<Group> iterator() {
        return new StreamIterator(this);
    }
    @SuppressWarnings("unlikely-arg-type")
    public void remove(Group group) {educationalGroups.remove(educationalGroups);}
}