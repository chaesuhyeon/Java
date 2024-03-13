public class Ex7_13 {
    class InstanceInner{}
    static class StaticInner{}
    
    InstanceInner iv  = new InstanceInner(); // 인스턴스멤버 간에는 서로 접근이 가능
    static StaticInner cv = new StaticInner(); // static 멤버 간에는 서로 직접 접근이 가능
    
    static void staticMethod() {
        
//        InstanceInner obj1 = new InstanceInner();  // static멤버는 인스턴스 멤버에 직접 접근할 수 없음
        StaticInner obj2 = new StaticInner();
    } 
    
    void instanceMethod(){
        // 인스턴스 메서드에서는 인스턴스 멤버와 static멤버 모두 접근이 가능함
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
    }

    void myMethod(){
        class LocalInner {}
        LocalInner lv = new LocalInner();
    }
}
