package builder.video_demo;

public abstract class VideoBuilder {

    protected VideoPlayer player = new VideoPlayer();

    abstract VideoBuilder buildMenu();

    abstract VideoBuilder buildPlayList();

    abstract VideoBuilder buildMainWindow();

    abstract VideoBuilder buildController();

    protected Boolean isMemoryMode() {
        return false;
    }

    public VideoPlayer create() {
        return player;
    }
}
