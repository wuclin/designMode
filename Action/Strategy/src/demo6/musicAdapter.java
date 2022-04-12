package demo6;

public class musicAdapter implements musicPlayer{
    advanceMusicPlayer advanceMusicPlayer;

    musicAdapter(String type){
        if (type.equalsIgnoreCase("mp4"))
            advanceMusicPlayer = new Mp4Player();
        else if (type.equalsIgnoreCase("vlc"))
            advanceMusicPlayer = new VlcPlayer();
    }

    @Override
    public void play(String type, String musicName) {
        if (type.equalsIgnoreCase("mp4")){
            System.out.println("转成mp4");
            advanceMusicPlayer.playMp4(type,musicName);
        }
        else if (type.equalsIgnoreCase("vlc")){
            System.out.println("转成vlc");
            advanceMusicPlayer.playVlc(type,musicName);
        }
    }
}
