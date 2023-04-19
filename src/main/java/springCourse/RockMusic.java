package springCourse;

import org.springframework.stereotype.Component;

@Component
public class RockMusic extends AbstractMusic implements InitAndDestroy {

    public RockMusic() {
        songsList.add("ДДТ - «Это всё»");
        songsList.add("Кино - «Кукушка»");
        songsList.add("Алиса - «Веретено»");
    }

    @Override
    public void init() {
        System.out.println("Init Rock Music");
    }

    @Override
    public void destroy() {
        System.out.println("Destroy Rock Music");
    }
}
