import java.util.Objects;

class Card{
    String kind;
    int number;

    Card(){
        this("SPADE", 1);
    }

    Card(String kind, int number){
        this.kind = kind;
        this.number = number;
    }

    public int hashCode(){
        return Objects.hash(kind, number);
    }


    public boolean equals(Object obj){
        if(!(obj instanceof Card))
            return false;

        Card c = (Card)obj;
        return this.kind.equals(c.kind) && this.number == c.number;
    }

    // Object 클래스의 toString()을 오버라이딩
    public String toString(){
        return "kind:"+ kind + ", number:" + number;
    }
}

public class Ex9_4 {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.equals(c2));

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
