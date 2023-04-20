package springCourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic(GenreMusic.POP);
        musicPlayer.playMusic(GenreMusic.ROCK);
        musicPlayer.playMusic(GenreMusic.CLASSIC);
        musicPlayer.playMusic(GenreMusic.REGGAE);
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer.getName());

//        Music popMusic = context.getBean("popMusic", PopMusic.class);
//        System.out.println(popMusic.getSong());

//        Music classicalMusic = context.getBean("musicClassicBean", ClassicalMusic.class);
//        Music rockMusic = context.getBean("musicRockBean", RockMusic.class);
//        System.out.println(classicalMusic.getSong());
//        System.out.println(rockMusic.getSong());

//        MusicPlayer musicPlayer = context.getBean("musicPayer", MusicPlayer.class);
//        musicPlayer.setVolume(40);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPayer", MusicPlayer.class);
//        System.out.println(musicPlayer == secondMusicPlayer);
//        System.out.println("Name: " + musicPlayer.getName() + "\nVolume: " + musicPlayer.getVolume());
//        System.out.println("Name: " + secondMusicPlayer.getName() + "\nVolume: " + secondMusicPlayer.getVolume());
        context.close();
    }
}
