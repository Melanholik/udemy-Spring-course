package springCourse;


import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic extends AbstractMusic implements InitAndDestroy {

    private ClassicalMusic() {
        songsList.add("Чайковский - «Щелкунчик»");
        songsList.add("Антонио Вивальди - «Времена года»");
        songsList.add("Людвиг ван Бетховен - «Лунная соната»");
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @Override
    public void init() {
        System.out.println("Init Classical Music");
    }

    @Override
    public void destroy() {
        System.out.println("Destroy Classical Music");

    }
}
