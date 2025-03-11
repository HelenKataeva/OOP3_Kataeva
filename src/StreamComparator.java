import java.util.Comparator;

public class StreamComparator implements Comparator<Group> {

    @Override
    public int compare(Group o1, Group o2) {
        int numberOfGroups1 = o1.getNumberOfGroups();
        int numberOfGroups2 = o2.getNumberOfGroups();

        if (numberOfGroups1 < numberOfGroups2) {
            return -1;
        } else if (numberOfGroups1 > numberOfGroups2) {
            return 1;
        } else {
            return 0;
        }
    }
}