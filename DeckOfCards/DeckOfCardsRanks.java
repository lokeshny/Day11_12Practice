package com.Bridgelab.DeckOfCards;

import java.util.Random;

public class DeckOfCardsRanks {
    int suit;
    int rank;
    int playerNumber;
    int[][] cards = new int[4][13]; // 2d array to store player's sort & rank

    /*
     * distributeOneCard method created to distribute cards.
     */
    void distributeOneCard() {
        //Random object created
        Random random = new Random();

        int suit = random.nextInt(4);
        int rank = random.nextInt(13);

        if (cards[suit][rank] != 0) {
            distributeOneCard();
        } else {
            cards[suit][rank] = playerNumber;
        }
    }

    /*
     * distributeAllCards method created to distribute all cards among players
     */
    void distributeAllCards(int playerNumber) {
        for (int i = 0; i <= 9; i++) {
            distributeOneCard();
        }
    }

    /*
     * showCards method created to show all the distributed cards that has been distributed to players.
     */
    void showCards() {
        for (suit = 0; suit <= 4; suit++) {
            for (rank = 0; rank <= 13; rank++) {
                if (cards[suit][rank] == playerNumber) {
                    System.out.println(gettingRank(rank) + " " + gettingSuit(suit) + "\t");
                }
            }
        }
        System.out.println("\n");
    }


    String gettingRank(int rank) {
        switch (rank) {
            case 1:
                return "2";
            case 2:
                return "3";
            case 3:
                return "4";
            case 4:
                return "5";
            case 5:
                return "6";
            case 6:
                return "7";
            case 7:
                return "8";
            case 8:
                return "9";
            case 9:
                return "10";
            case 10:
                return "Jack";
            case 11:
                return "Queen";
            case 12:
                return "King";
            case 13:
                return "Ace";
            default:
                return "";
        }
    }

    String gettingSuit(int suit) {
        switch (suit) {
            case 1:
                return "Clubs";
            case 2:
                return "Diamonds";
            case 3:
                return "Hearts";
            case 4:
                return "Spades";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        DeckOfCardsRanks deckOfCardsRanks = new DeckOfCardsRanks();
        for (int playerNumber = 1; playerNumber < 4; playerNumber++) {
            deckOfCardsRanks.distributeAllCards(playerNumber);
            System.out.println("Player " + playerNumber + "'s card :-");
            deckOfCardsRanks.showCards();
        }
    }
}

