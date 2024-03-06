interface Gps{
    void location();

}

interface Camera{
    void photos();
    void video();

}

interface MediaPlayer{
    void audioSongs();
    void videoSongs();


}

class  CellPhone{
    void dialing(){
        System.out.println("dialing...");
    }
    void receivingCall(){
        System.out.println("receiving...");
    }


}

class SmartPhone extends CellPhone implements Gps ,Camera , MediaPlayer {

    public void location(){
        System.out.println("im in dehradun");
    }
    public void photos()
    {
        System.out.println("seeing photos");
    }
    public void video()
    {
        System.out.println("seeing video");
    }
    public void audioSongs()
    {
        System.out.println("listening songs");
    }
    public void videoSongs()
    {
        System.out.println("listening  video songs");
    }

}


public class MultipleInterfaces {
    public static void main(String[] args) {
        SmartPhone obj =  new SmartPhone();
        obj.dialing();
        obj.receivingCall();
        obj.audioSongs();
        obj.videoSongs();
        obj.photos();
        obj.video();
        obj.location();
    }
    
}
