package JavaStudy.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @program: Java
 * @description:扑克牌练习
 * @author: Mx
 * @create: 2020-05-12 10:27
 **/
class Card {
    public int rank;//牌面
    public String suit;

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return String.format("[%s %d]", suit, rank);
    }
}

public class practicePoke0511 {
    public static final String[] SUITS = {"♥", "♠", "♦", "♣"};

    //1.买牌
    public static List<Card> buyCard() {
        List<Card> deck = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int i1 = 1; i1 < 13; i1++) {
                //int rank = i; //生成一张牌
                //String suit = SUITS[i1];
                Card card = new Card(i1, SUITS[i]);
                deck.add(card);
            }
        }
        return deck;
    }

    //洗牌
    private static void swap(List<Card> deck, int index, int i) {
        Card tmp = deck.get(index);
        deck.set(index, deck.get(i));
        deck.set(i, tmp);

    }

    public static void shuffle(List<Card> deck) {
        for (int i = deck.size() - 1; i > 0; i--) {
            Random random = new Random();
            int index = random.nextInt(i);//生成[0，i）
            swap(deck, index, i);//交换index和i下标的值
        }
    }

    public static void main(String[] args) {
        List<Card> deck = buyCard();
        System.out.println(deck);
        shuffle(deck);
        System.out.println("洗牌");
        System.out.println(deck);
        //接牌 3人 每个人接五张
        List<List<Card>> hand = new ArrayList<>();//将hands1、2、3存入hand
        List<Card> hands1 = new ArrayList<>();
        List<Card> hands2 = new ArrayList<>();
        List<Card> hands3 = new ArrayList<>();
        hand.add(hands1);
        hand.add(hands2);
        hand.add(hands3);
        for (int i = 0; i < 5; i++) {
            for (int i1 = 0; i1 < 3; i1++) { //三个人循环
                Card card = deck.remove(0); //将0拿走，下一张就是0
                hand.get(i1).add(card);
            }
        }
        System.out.println("第一个人的牌");
        System.out.println(hands1);
        System.out.println("第二个人的牌");
        System.out.println(hands2);
        System.out.println("第三个人的牌");
        System.out.println(hands3);
        System.out.println("剩余的牌：");
        System.out.println(deck);
    }
}
