package demo6;

/**
 * 假设：A类有功能A，B类有功能B；
 * A类想要使用功能B，这时就想要一个A类适配器，在使用功能B时，通过适配器新建B类对象，并用B类对对象去调用功能B
 * 这样在外部看起来，A类同时具有了功能A和功能B，通常用在现有项目需要改进的情况下
 */
public class AdapterPatternDemo {
    public static void main(String[] args){
        mp3Player mp3Player = new mp3Player();

        mp3Player.play("mp3","music1");
        System.out.println("------------------------");
        mp3Player.play("mp4","movie1");
        System.out.println("------------------------");
        mp3Player.play("vlc","vlc1");
    }
}
