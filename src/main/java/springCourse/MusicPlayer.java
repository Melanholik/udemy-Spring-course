package springCourse;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

public class MusicPlayer {
    List<Music> music;
    @Value("${musicPlayer.volume}")
    private Integer volume;
    @Value("${musicPlayer.name}")
    private String name;


    public MusicPlayer(List<Music> music) {
        this.music = music;
    }

    public List<Music> getMusic() {
        return music;
    }

    public void setMusic(List<Music> music) {
        this.music = music;
    }

    public Integer getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public void playMusic() {
        Random random = new Random();
        System.out.println("Playing:" + music.get(random.nextInt(music.size())).getSong());
    }
}
