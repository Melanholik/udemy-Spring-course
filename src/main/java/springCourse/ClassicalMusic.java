package springCourse;



public class ClassicalMusic extends AbstractMusic {

    public ClassicalMusic() {
        songsList.add("Чайковский - «Щелкунчик»");
        songsList.add("Антонио Вивальди - «Времена года»");
        songsList.add("Людвиг ван Бетховен - «Лунная соната»");
    }


    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

}
