package springCourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class RockMusic extends AbstractMusic implements InitAndDestroy {

    public RockMusic() {
        songsList.add("ДДТ - «Это всё»");
        songsList.add("Кино - «Кукушка»");
        songsList.add("Алиса - «Веретено»");
    }

}
