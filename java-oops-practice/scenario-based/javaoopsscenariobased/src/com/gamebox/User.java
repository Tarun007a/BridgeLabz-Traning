package com.gamebox;

public class User {
    private String name;
    private double wallet;
    private Game[] ownedGames;
    private int count;

    public User(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
        this.ownedGames = new Game[10];
        this.count = 0;
    }

    protected boolean buyGame(Game game, double amount) {
        if(wallet >= amount) {
            wallet -= amount;
            ownedGames[count++] = game;
            return true;
        }
        return false;
    }

    public void showOwnedGames() {
        System.out.println(name + " owns:");
        for(int i = 0; i < count; i++) {
            System.out.println(ownedGames[i].getTitle());
        }
    }
}
