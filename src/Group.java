public class Group implements Comparable<Group> {
    private int groupId;
    private int numberOfGroups;

    public Group(int groupId, int numberOfGroups) {
        this.groupId = groupId;
        this.numberOfGroups = numberOfGroups;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getNumberOfGroups() {
        return numberOfGroups;
    }

    public void setNumberOfGroups(int numberOfGroups) {
        this.numberOfGroups = numberOfGroups;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupId = " + groupId +
                ", numberOfGroups = " + numberOfGroups +
                '}';
    }

    @Override
    public int compareTo(Group o) {
        if (o.getGroupId() > groupId)
            return -1;
        if (o.getGroupId() < groupId)
            return 1;
        return 0;
    }
}