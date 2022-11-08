public class Ex6_1 {
    public static void main(String[] args) {
        Tv t ; //Tv인스턴스를 참조하기 위한 변수 t를 선언
        t = new Tv(); // Tv인스턴스 생성
        t.channel = 7; // Tv인스턴스의 멤버변수 chnnel의 값을 7로 함
        t.channelDown(); // TV인스턴스의 메서드 channelDown()을 호출
        System.out.println("현재 채널은" + t.channel + "입니다.");

    }
}

class Tv {
    //Tv의 속성
    String color; // 기본값 null
    boolean power; // 기본값 false
    int channel; // 기본값 0

    //Tv의 기능
    void power() {power = !power ;}
    void channelUp() { ++ channel ;}
    void channelDown() {--channel ;}

}
