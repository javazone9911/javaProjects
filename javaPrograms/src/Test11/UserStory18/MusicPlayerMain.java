package Test11.UserStory18;

public class MusicPlayerMain {
    public static void main(String[] args) {
        MusicPlayer musicPlayer=new Mp3Player();
        musicPlayer.pause();
        musicPlayer.play();
        musicPlayer.stop();
        MusicPlayer musicPlayer1=new CdPlayer();
        musicPlayer1.stop();
        musicPlayer1.play();
        musicPlayer1.pause();
    }
}
