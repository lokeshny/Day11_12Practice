/*
 *  Program DeckOfCards.java, to initialize deck of cards having suit ("Clubs", "Diamonds", "Hearts", "Spades")
 *
 * @author: Lokesh
 * @date: 03-05-2022
 */
package com.Bridgelab.DeckOfCards;

public class DeckOfCards {
    String[] deck = new String[52]; // Total cards
    // types of cards
    String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
    // rank types
    String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
    // hierarchy
    String[][] playerCards = new String[4][9];

    /*
     * getCards method are created for getting cards according to their rank and suits
     */
    public void getCards() {
        //initializing variable deckIndex with 0
        int deckIndex = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                //aligning ranks and suits together
                deck[deckIndex] = suits[i] + " " + ranks[j];
                //incrementing deck of index
                deckIndex++;
            }
        }
    }

    /*
     * shuffleCards method created to shuffle the cards
     */
    public String[] shuffleCards() {
        for (int i = 0; i < deck.length; i++) {
            // random shuffle assigning random cards
            int index = (int) (Math.random() * deck.length);
            // swapping existing data with random data
            String temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
        return deck;
    }

    /*
     * displayCard method created to display cards
     */
    public void displayCard(String[] deck) {
        int deckIndex = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("Player" + (i + 1) + " :-");
            System.out.println();
            for (int j = 0; j < 9; j++) {
                playerCards[i][j] = deck[deckIndex];
                System.out.println(playerCards[i][j]);
                deckIndex++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //Object created of deckOfCards
        DeckOfCards deckOfCards = new DeckOfCards();
        //method calling
        deckOfCards.getCards();

        String[] deck = deckOfCards.shuffleCards();
        deckOfCards.displayCard(deck);
    }
}

