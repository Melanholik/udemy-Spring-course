package springCourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Autowired
    @Qualifier("popMusic")
    private Music popMusic;
    @Autowired
    @Qualifier("reggaeMusic")
    private Music reggaeMusic;
    @Autowired
    @Qualifier("rockMusic")
    private Music rokMusic;
    @Autowired
    @Qualifier("classicalMusic")
    private Music classicalMusic;
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

    public Music getPopMusic() {
        return popMusic;
    }

    public Music getReggaeMusic() {
        return reggaeMusic;
    }

    public Music getRokMusic() {
        return rokMusic;
    }

    public Music getClassicalMusic() {
        return classicalMusic;
    }

    @Autowired
    public void setReggaeMusic(ReggaeMusic reggaeMusic) {
        this.reggaeMusic = reggaeMusic;
    }

    public void playMusic(GenreMusic genreMusic) {
        switch (genreMusic) {
            case POP -> System.out.println("Playing: " + popMusic.getSong());
            case ROCK -> System.out.println("Playing: " + rokMusic.getSong());
            case CLASSIC -> System.out.println("Playing: " + classicalMusic.getSong());
            case REGGAE -> System.out.println("Playing: " + reggaeMusic.getSong());
        }
    }
}
