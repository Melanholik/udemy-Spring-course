package springCourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Autowired
    private PopMusic popMusic;
    private ReggaeMusic reggaeMusic;
    private String name;
    private Integer volume;

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

    public PopMusic getPopMusic() {
        return popMusic;
    }

    public void setPopMusic(PopMusic popMusic) {
        this.popMusic = popMusic;
    }

    public ReggaeMusic getReggaeMusic() {
        return reggaeMusic;
    }

    @Autowired
    public void setReggaeMusic(ReggaeMusic reggaeMusic) {
        this.reggaeMusic = reggaeMusic;
    }

    public void playMusic() {
        System.out.println("Playing: " + popMusic.getSong());
        System.out.println("Playing: " + reggaeMusic.getSong());
    }
}
