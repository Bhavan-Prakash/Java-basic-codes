interface playable{
    void play();

    void pause();
}

class musicPlayer implements playable{
    public void play(){
        System.out.println("play method");
    }

    @Override
    public void pause() {
        System.out.println("pause method ");
    }
}

public class Q6 {

    public static void main(String[] args){
        musicPlayer obj = new musicPlayer();
        obj.pause();
        obj.play();
    }

}
