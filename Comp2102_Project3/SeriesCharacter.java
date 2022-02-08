package Comp2102_Project3;

public class SeriesCharacter {

    public String source; // name
    public String destination;
    public int weight;

    public SeriesCharacter(String source, String destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public String toString() {
        return source + " " + destination + " " + weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
/*
!  A)	ReadFileGOTGraph(â€˜â€™) // loads GOT data and returns a graph
!  B)	printClosesestCharacters(toCharacter, threshold) //strength is smaller than a threshold (e.g., 15)
!  C)	printFartherCharacters(toCharacter, threshold) // strength is greater than a threshold (e.g., 15)
? !  D)	isConnected(character1, character2): User gives two characters, your program searches and prints a message indicating if these two characters are connected to each other.
? !  E)	pathTo(character1, character2): User gives two characters, then your program searches and prints the shortest path from character1 to character2. If there are several shortest paths, printing one of them is enough.
? !  F)	delete(character1, character2): User gives two characters, and your program deletes the connection between them.
? !  G)	change(character1, character2, newWeight): User gives two characters, and your program updates the connection strength between them by newWeight
? !  H)	NumberOfCharacterGroups: Prints the connected components and Characters in each component. If there is only single group you can delete some links and test this functionality.
? !  Eg. Component 1: Ali, Sansa, Jon
? !  Component 2: Veli, Kim, Deli
? !  I)	Custom function1: Add your own function which is not listed above.
? !  J)	Custom function2: Add your own function which is not listed above.

*/

