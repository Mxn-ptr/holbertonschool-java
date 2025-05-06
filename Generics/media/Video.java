public class Video extends Media {
    private int duration;

    public Video(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}
