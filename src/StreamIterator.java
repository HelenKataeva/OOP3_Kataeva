import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<Group> {
    private final List<Group> groups;
    private int counter;

    public StreamIterator(Stream stream) {
        this.groups = stream.getEducationalGroups();
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < groups.size();
    }

    @Override
    public Group next() {
        if (hasNext()) {
            return groups.get(counter++);
        }
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}