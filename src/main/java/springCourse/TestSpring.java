package springCourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPayer", MusicPlayer.class);
        musicPlayer.setVolume(40);
        MusicPlayer secondMusicPlayer = context.getBean("musicPayer", MusicPlayer.class);
        System.out.println(musicPlayer == secondMusicPlayer);
        System.out.println("Name: " + musicPlayer.getName() + "\nVolume: " + musicPlayer.getVolume());
        System.out.println("Name: " + secondMusicPlayer.getName() + "\nVolume: " + secondMusicPlayer.getVolume());
        context.close();
    }
}
