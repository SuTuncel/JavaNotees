package Comp2102_Project3;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();
        // graph.readFile();
        graph.readFileGOTGraph();
        System.out.println("<============asosjdoasid=========================>");
    /*graph.removeThing("Sansa", "Cersei", 16);
    System.out.println("<=======================asdasdasdasd==============>");
    graph.printGraph();*/
        System.out.println("graph.search('Sansa', 'Cersei') => " + graph.search("Sansa", "Cersei"));
        graph.removeThing("Sansa", "Cersei");
        System.out.println("graph.search('Sansa', 'Cersei') => " + graph.search("Sansa", "Cersei"));
        System.out.println("Change: \"Aegon\", \"Daenerys\", 8");
        graph.changeWeight("Aegon" ,"Daenerys", 31);


        System.out.println("<=======================asdasdasdasd==============>");
        graph.printGraph();
        //graph.readFileGOTGraph();
    }

}
