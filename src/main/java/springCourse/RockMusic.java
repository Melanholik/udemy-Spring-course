package springCourse;

public class RockMusic implements Music, InitAndDestroy {
    @Override
    public String getSong() {
        return "Люмен - Сид и Ненси";
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
