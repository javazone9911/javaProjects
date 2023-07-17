package Test11.UserStory18;

public class Mp3Player implements MusicPlayer{
    @Override
    public void play() {
        System.out.println("The mp3player staters playing");
    }

    @Override
    public void pause() {
        System.out.println("The mp3player pause playing");
    }

    @Override
    public void stop() {
        System.out.println("The mp3player stops playing");
    }
}
