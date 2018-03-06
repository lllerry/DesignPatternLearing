package builder.video_demo;

public class VideoPlayDirector {

    private VideoBuilder builder;

    public VideoPlayDirector(VideoBuilder builder) {
        this.builder = builder;
    }

    public VideoPlayer construct() {
        builder.buildMainWindow()
                .buildController()
                .buildPlayList()
        ;
        if (!builder.isMemoryMode()) {
            builder.buildMenu();
        }

        return builder.create();
    }
}
