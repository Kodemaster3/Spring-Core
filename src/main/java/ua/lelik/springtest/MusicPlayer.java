package ua.lelik.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    
    public String getName() {
        return name;
    }
    
    public int getVolume() {
        return volume;
    }
    
    private Music music1;
    private Music music2;
    private Music music3;
    
    //    public MusicPlayer(@Qualifier("classicalMusic") Music music1,@Qualifier("rockMusic") Music music2,
//                       @Qualifier("instrumentalMusic") Music music3) {
//        this.music1 = music1;
//        this.music2 = music2;
//        this.music3 = music3;
//    }
    public MusicPlayer(Music music1,Music music2, Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

//    public String playMusic() {
//        return "Playing: \n" + music1.getSongs() + " \n" + music2.getSongs() + " \n" + music3.getSongs();
    
    public void playMusic(MusicGengre gengre) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        
        if(gengre == MusicGengre.CLASSIC) {
            System.out.println(music1.getSongs().get(randomNumber));
        } else if(gengre == MusicGengre.ROCK) {
            System.out.println(music2.getSongs().get(randomNumber));
        } else if(gengre == MusicGengre.INSTRUMENTAL) {
            System.out.println(music3.getSongs().get(randomNumber));
        }
        
        
    }
    
    
    //        System.out.println("Playing: " + classicalMusic.getSong());
//        System.out.println("Playing: " + rockMusic.getSong());

//    }
//    public void setMusic(Music music) {
//    private List<Music> musicList = new ArrayList<>();
//    private String name;
//    private int volume;
//
//    public MusicPlayer() {
//    }
//    public MusicPlayer(List<Music> musicList) {
//        this.musicList = musicList;
//    }

//    public List<Music> getMusicList() {
//        return musicList;
//    }
//
//    public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }
//    public void playMusicList() {
//        for(int i = 0; i < musicList.size(); i++) {
//            System.out.println("Playing: " + musicList.get(i).getSong());
//        }
//    }
//

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getVolume() {
//        return volume;
//    }
//
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }
}
