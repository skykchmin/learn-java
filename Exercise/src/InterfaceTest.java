// #1

/*
class A{
    public void method(B b){
        b.method();
    }
}

class B{
    public void method(){
        System.out.println("B클래스의 메서드,");
    }
}

public class InterfaceTest {
    public static void main(String[] args){
        A a = new A();
        a.method(new B()); // A가 B를 사용(의존)
    }

}
*/

// # 2
interface I {
    public void method();
}

class A{
    public void method(I i){ // 인터페이스 I를 구현한 인스턴스 인자들만 들어와라
        i.method();
    }
}

class B implements I{
    public void method(){
        System.out.println("B클래스의 메서드");
    }
}

public class InterfaceTest {
    public static void main(String[] args){
        A a = new A();
        a.method(new B()); // A가 B를 사용(의존)
    }

}