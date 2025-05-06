import java.util.ArrayList;
import java.util.List;

public class Library<T extends Media> {
    private List<T> mediaList = new ArrayList<>();

    public void addMedia(T element) {
        mediaList.add(element);
    }

    public List<T> getMediaList() {
        return this.mediaList;
    }
}
