package springCourse;

import org.springframework.stereotype.Component;

@Component
public class ReggaeMusic implements Music {
    @Override
    public String getSong() {
        return "Alai Oli - Крылья";
    }
}
