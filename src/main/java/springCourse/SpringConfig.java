package springCourse;


import org.springframework.context.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    @Scope("prototype")
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public PopMusic popMusic() {
        return new PopMusic();
    }

    @Bean
    public ReggaeMusic reggaeMusic() {
        return new ReggaeMusic();
    }

    @Bean
    public List<Music> music() {
        return Arrays.asList(reggaeMusic(), popMusic(), classicalMusic(), reggaeMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(music());
    }


}
