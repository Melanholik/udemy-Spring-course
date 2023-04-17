package springCourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> music;
    private String name;
    private Integer volume;

    public MusicPlayer() {
        music = new ArrayList<>();
    }

    public List<Music> getMusic() {
        return music;
    }

    public void setMusic(List<Music> music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public void playMusic() {
        for (Music music : music) {
            System.out.println("Playing: " + music.getSong());
        }
    }
}
