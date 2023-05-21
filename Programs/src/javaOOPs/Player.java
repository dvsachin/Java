package javaOOPs;

public class Player {
    String name;
    int id;

    static int playerCount = 0;

    Player(String name) {
        this.name = name;
        id= ++playerCount;
    }
    static int getplayerCount() {
        return playerCount;
    }
    void printDetails() {
        System.out.println(id+":"+name);
    }
}