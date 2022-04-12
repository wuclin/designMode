package demo6;

public class Mp4Player implements advanceMusicPlayer{
    @Override
    public void playMp4(String type, String auditName) {
        System.out.println("play mp4" + auditName);
    }

    @Override
    public void playVlc(String type, String auditName) {

    }
}
