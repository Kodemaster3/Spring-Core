package ua.lelik.springtest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpring {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml"
//        );

//        ClassicalMusic classicalMusic = context.getBean("musicBean1", ClassicalMusic.class);
//        Music music = context.getBean("rockMusic", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();
//        Music music2 = context.getBean("classicalMusic", Music.class);
//        MusicPlayer classicMusicPlayer = new MusicPlayer(music2);
//        classicMusicPlayer.playMusic();
//        MusicPlayer firstmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.println(firstmusicPlayer == secondmusicPlayer);
//        System.out.println(firstmusicPlayer);
//        System.out.println(secondmusicPlayer);
//        firstmusicPlayer.setVolume(10);
//        System.out.println(firstmusicPlayer.getVolume());
//        System.out.println(secondmusicPlayer.getVolume());

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic(MusicGengre.CLASSIC);
//        musicPlayer.playMusic(MusicGengre.ROCK);
//        musicPlayer.playMusic(MusicGengre.INSTRUMENTAL);
    
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
    
        musicPlayer.playMusic(MusicGengre.INSTRUMENTAL);
        
        
        context.close();
        
    }
    
}
