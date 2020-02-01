import java.util.ArrayList;

class Blackjack {

    // We decide to represent a card with an `int`,
    // and a deck or a hard of card with an `ArrayList` of `Integer`

    // PLUS: you can also introduce and write the class `Card`
    //       and use it instead of `int` and `Integer`

    // HINT: need common objects, like a `Scanner`?
    //       add them here, outside of methods, to have them always available


    /**
      * Main method of the project.
      *
      * See a possible design sketched in main-design.jpeg
      */
    public static void main(String[] args) {

    }

    /**
      * Create a new deck, shuffle it and return it.
      * The deck must contain four times the cards from ace (1) to king (13).
      *
      * @return the newly-created deck, shuffled
      */
    public static ArrayList<Integer> newShuffledDeck() {

    }

    /**
      * One player plays their game.
      * This method interacts with the player, picking cards
      * from the deck, asking the player if they want another card,
      * playing until the player wants or until they bust.
      *
      * See possible design sketched in single-game-design.jpeg
      *
      * @param deck the deck to play
      * @return the hand of the player, at the end of the game
      *         this contain what the player has in their hand
      *         at the end of the game, regardless if they
      *         decided to stop playing or they busted
      */
    public static ArrayList<Integer> playGame(ArrayList<Integer> deck) {

    }

    /**
      * Select which player wins the game.
      * The hands of all the players are passed as parameter.
      * The method selects which hands has an higher score,
      * ignoring hands that are not valid -players who have busted-
      * and then return the number of the player that has the highest score.
      *
      * @param hands the hands of all the players
      * @return the number of the player with the highest score
      *         -1 in case there are no players or all the players have busted
      */
    public static int selectWinner(ArrayList<ArrayList<Integer>> hands) {

    }

    /**
      * Remove the top card from a deck and add it to a hand.
      *
      * @param deck the deck from which to pick a card
      * @param hand the hand to which to add the picked card
      */
    public static void pickCard(ArrayList<Integer> deck, ArrayList<Integer> hand) {

    }

    /** Check if a hand is valid, that means its score is not more than 21.
      *
      * @param hand the hand that should be checked
      * @return if the hand is valid
      */
    public static boolean isValid(ArrayList<Integer> hand) {

    }

    /**
      * Ask the player if they want to continue to play.
      * Print the hand, so that the player sees which card they have,
      * then ask them if they want another card and return the answer.
      *
      * @param hand the player's hand
      * @return if the player wants to continue playing
      */
    public static boolean wantAnotherCard(ArrayList<Integer> hand) {

    }

    /**
      * Calcualte the score of a hand.
      * Aces may count 1 or 11, depending what's best for the player.
      *
      * @param hand the hand to be evaluated
      * @return the score of the hand
      */
    public static int score(ArrayList<Integer> hand) {

    }
}
