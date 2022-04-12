package demo6;

public class mp3Player implements musicPlayer {
    musicAdapter musicAdapter;

    @Override
    public void play(String type, String musicName) {
        if (type.equalsIgnoreCase("mp3"))
            System.out.println("play mp3" + musicName);

        else if (type.equalsIgnoreCase("mp4") || type.equalsIgnoreCase("vlc")){
            musicAdapter = new musicAdapter(type);
            musicAdapter.play(type,musicName);
        }else
        {
            System.out.println("错误格式");
        }

    }
}
