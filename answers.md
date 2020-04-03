1. What items would be necessary if you were playing a game of Elevens at your desk (not on the computer)? List the private instance variables needed for the ElevensBoard class. 

Deck of cards and a list of cards on the board. The elevensBoard class would need Deck and Card [] instance variables(hasLost, Shuffle, isEmpty).

2. Write an algorithm that describes the actions necessary to play the Elevens game. 

Shuffle the deck, Deal nine cards. While there is a possible move, If a pair of 11 exists, Removing the pair, Replacing the two removed cards if possible. Else if a triple that contains, J, Q, K exists, then remove the triplets, Replacing the the three cards if possible, If there is no cards left on the baord you win, or else you lose. 

3. Now examine the partially implemented ElevensBoard.java file found in the Activity7 Starter Code directory. Does the ElevensBoard class contain all the state and behavior necessary to play the game? 
The Elevens code seems perfectly fine. 

4.  ElevensBoard.java contains three helper methods. These helper methods are private because they are only called from the ElevensBoard class. 

4a. Where is the dealMyCards method called in ElevensBoard? 
dealMyCards is found in the constructor of trhe ElevensBoard

4b. Where is the dealMyCards method called in ElevensBoard? 
These method should be called in isLegal 

4c. It’s important to understand how the cardIndexes method works, and how the list that it returns is used. Suppose that cards contains the elements shown below. Trace the execution  of the cardIndexes method to determine what list will be returned. Complete the diagram below by filling in the elements of the returned list, and by showing how those values index cards. Note that the returned list may have less than 9 elements. 

0,1,3,6,7

4d. Compplete the following printCards method to print all of the elemtnts of cards that are indexed by cIndexes.

public static printCards(ElevensBoard board) {
    list<integer> cIndexes = board.cardIndexes();

    for( Integer kObj: cIndexes) {
        System.out.println(boards.cards[i].toString());
    }
}

4e. Which one of the methods that you identified in question 4b above needs to call the cardIndexes method before calling the containsPairSum11 and containsJQK methods? Why? 
THe method called that is used is called anotherPlayIsPossible().
 