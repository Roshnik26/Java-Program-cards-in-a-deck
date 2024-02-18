// Deck.java

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Card> cards;
    
    public Deck() {
        cards = new ArrayList<>();
    }
    
    public void createDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
    }
    
    public void printDeck() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }
    
    public void printCard() {
        // Logic to print a single card
    }
    
    public void sameCard() {
        // Logic to find cards from the same suit
    }
    
    public void compareCard() {
        // Logic to find cards with the same rank
    }
    
    public void findCard() {
        // Logic to search for a particular card
    }
    
    public void dealCard() {
        // Logic to deal 5 random cards
    }
    
    public void shuffleDeck() {
        Collections.shuffle(cards);
    }
}
