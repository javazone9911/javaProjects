package Test11.UserStory18;

public class CdPlayer implements MusicPlayer{
    @Override
    public void play() {
        System.out.println("The CdPlayer staters playing");
    }

    @Override
    public void pause() {
        System.out.println("The CdPlayer pause playing");
    }

    @Override
    public void stop() {
        System.out.println("The CdPlayer stops playing");
    }
}
