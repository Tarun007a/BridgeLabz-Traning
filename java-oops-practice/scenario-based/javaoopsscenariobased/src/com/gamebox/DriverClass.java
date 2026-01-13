package com.gamebox;

public class DriverClass {
    public static void main(String[] args) {
        User user = new User("User", 1000);

        Game g1 = new ArcadeGame("ArcadeGame 1", 5000, 4);
        Game g2 = new StrategyGame("StrategyGame 1", 1000, 5);

        g1.playDemo();
        g1.download(user);

        g2.playDemo();
        g2.download(user);

        user.showOwnedGames();
    }
}
