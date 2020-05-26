package JavaStudy.Study.Study0526;

import java.util.Objects;

/**
 * @program: Java
 * @description: Java对象的比较
 * @author: Mx
 * @create: 2020-05-26 09:03
 **/
class Card {
    public int rank;    // 数值
    public String suit; // 花色

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    //   @Override
//    public boolean equals(Object obj) {//比较对象是否是相同的对象
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null || !(obj instanceof Card)) {
//            return false;
//        }
//        Card tmp = (Card) obj;
//        if (this.rank == tmp.rank && this.suit.equals(tmp.suit)) {
//            return true;
//        }
//        return false;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card card = (Card) o;
        return rank == card.rank &&
                suit.equals(card.suit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }
}

public class TestDemo01 {
    public static void main(String[] args) {
        Card card1 = new Card(5, "♥");
        Card card2 = new Card(5, "♥");
        System.out.println(card1 == card2);
        System.out.println(card1.equals(card2));
    }
}
