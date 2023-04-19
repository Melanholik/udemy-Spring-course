package springCourse;

import org.springframework.stereotype.Component;

@Component
public class ReggaeMusic extends AbstractMusic {

    public ReggaeMusic() {
        songsList.add("Alai Oli - «Крылья»");
        songsList.add("Боб Марли - «No Woman No Cry Dub»");
        songsList.add("Чайф - «Аргентина-Ямайка – 5:0»");
    }
}
