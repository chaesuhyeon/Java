class CaptionTv extends Tv {
    boolean caption;
    void displayCaption(String text){
        if (caption) {
            System.out.println(text);
        }
    }
}

public class Ex7_1 {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();

        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.displayCaption("Hello world");
        ctv.caption = true; // 자막 기능을 켠다.
        ctv.displayCaption("Hello world");
    }
}

//11
//Hello world