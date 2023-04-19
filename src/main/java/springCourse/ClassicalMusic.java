package springCourse;

public class ClassicalMusic implements Music, InitAndDestroy {

    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Чайковский - Щелкунчик";
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
