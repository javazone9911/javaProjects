package Test11.UserStory18;

public interface MusicPlayer {
    //User Story 18: As a developer, I want to create a MusicPlayer interface with methods for play, pause, and stop, and have different music player classes implement it.
    //Explanation:
    //Create a MusicPlayer interface with method declarations for play, pause, and stop.
    //Implement separate MusicPlayer classes (e.g., MP3Player, CDPlayer) that implement the MusicPlayer interface and provide specific implementations for each method.
    //Use interfaces to define a common set of operations for music playing that can be implemented by different music player classes.

     void play();
     void pause();
     void stop();

}
