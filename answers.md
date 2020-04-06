1. The size is an instance variable. Which then shows us that there is no need to create a setters or getter methods in the Board class since the size variasble is already defined in the subclass. 

2. This is because by removing and replacing the cards regardless of which game is being played. This then shows that this can be implemented into the Board class and does not need to be an abstruct method. 

3. isLegal() and anotherPlayisPossible() would still be called polymorpihcally. This alternate design can still work but the other possible methods will ahve to be implmented separately for each card games board class. 