package builder.video_demo;

/**
 * 记忆模式
 */
public class MemoryVideoBuilder extends VideoBuilder {

    @Override
    VideoBuilder buildMenu() {
        player.setMenu("memoryMenu");
        return this;
    }

    @Override
    VideoBuilder buildPlayList() {
        player.setPlayList("memoryPlaylist");
        return this;
    }

    @Override
    VideoBuilder buildMainWindow() {
        player.setMainWindow("memoryMainWindow");
        return this;
    }

    @Override
    VideoBuilder buildController() {
        player.setController("memoryController");
        return this;
    }

    @Override
    protected Boolean isMemoryMode() {
        return true;
    }
}
