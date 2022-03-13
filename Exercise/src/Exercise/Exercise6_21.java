package Exercise;

class MyTv{
    boolean isPowerOn;
    int channel;
    int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 1;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void turnOnOff(){

    }

    void volumeUp() {
        if(volume < MAX_VOLUME){
            volume += 1;
        }
    }

    void volumeDown(){
        if(MIN_VOLUME < volume){
            volume -= 1;
        }
    }

    void channelUp() {
        if(channel == MAX_CHANNEL){
            channel = MIN_CHANNEL;
        } else {
            channel++;
        }
    }

    void channelDown(){
        if(channel == MIN_CHANNEL){
            channel = MAX_CHANNEL;
        } else {
            channel--;
        }
    }
}


public class Exercise6_21 {
    public static void main(String[] args) {
        MyTv t = new MyTv();

        t.channel = 100;
        t.volume = 0;
        System.out.println("CH:"+ t.channel +", VOL:" + t.volume);

        t.channelDown();
        t.volumeDown();
        System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
        t.volume = 100;
        t.channelUp();
        t.volumeUp();
        System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
    }
}

