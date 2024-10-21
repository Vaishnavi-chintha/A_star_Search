package uk.ac.hw.macs.search;

public class Main {
    public static void Main{
        Node root = new Node(new State(0,0,false));
        State goalState = new State(0,3,true);
        goalState.setGoal(0, 3);
        Node goal = new Node(goalState);
        Node A = new Node(new State(0,1,false));
        root.addChild(A, 1);
        Node B = new Node(new State(0,2,false));
        A.addChild(B, 2);
        B.addChild(goal, 1);
    }
}