package COMP3;

public class SeriesCharacter {

    public String source;
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

