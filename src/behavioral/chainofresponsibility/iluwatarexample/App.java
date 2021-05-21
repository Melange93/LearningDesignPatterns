package behavioral.chainofresponsibility.iluwatarexample;

/**
 * The MIT License
 * Copyright © 2014-2019 Ilkka Seppälä
 * Description: https://github.com/iluwatar/java-design-patterns/tree/master/chain
 *
 * Real world example: *
 * The Orc King gives loud orders to his army.
 * The closest one to react is the commander, then officer and then soldier.
 * The commander, officer and soldier here form a chain of responsibility.
 */

public class App {

    public static void main(String[] args) {
        OrcKing king = new OrcKing();
        king.makeRequest(new Request(RequestType.DEFEND_CASTLE, "defend castle"));
        king.makeRequest(new Request(RequestType.TORTURE_PRISONER, "torture prisoner"));
        king.makeRequest(new Request(RequestType.COLLECT_TAX, "collect tax"));
    }
}
