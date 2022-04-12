package demo6;

public class VlcPlayer implements advanceMusicPlayer{
    @Override
    public void playMp4(String type, String auditName) {

    }

    @Override
    public void playVlc(String type, String auditName) {
        System.out.println("play Vlc" + auditName);
    }
}
