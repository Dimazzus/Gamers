package org.example;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class GameTest {

    @Test
    public void firstPlayerWinTest() {
        Game game = new Game();
        Player sasha = new Player(1, "Саша", 45);
        Player masha = new Player(2, "Маша", 38);
        game.register(sasha);
        game.register(masha);

        int expected =1;
        int actual = game.round("Саша", "Маша");

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void secondPlayerWinTest() {
        Game game = new Game();
        Player sasha = new Player(1, "Саша", 45);
        Player masha = new Player(2, "Маша", 51);
        game.register(sasha);
        game.register(masha);

        int expected =2;
        int actual = game.round("Саша", "Маша");

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void equalStrengthTest() {
        Game game = new Game();
        Player sasha = new Player(1, "Саша", 45);
        Player masha = new Player(2, "Маша", 45);
        game.register(sasha);
        game.register(masha);

        int expected =0;
        int actual = game.round("Саша", "Маша");

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void firstPlayerNotExistTest() {
        Game game = new Game();
        Player sasha = new Player(1, "Саша", 45);
        Player masha = new Player(2, "Маша", 38);
        game.register(sasha);
        game.register(masha);

        int expected =1;
        int actual = game.round("Саша", "Маша");

        Assertions.assertThrows(NewRegisteredException.class,
                () -> game.round("Даша", "Маша")

        );

    }
    @Test
    public void secondPlayerNotExistTest() {
        Game game = new Game();
        Player sasha = new Player(1, "Саша", 34);
        Player masha = new Player(2, "Маша", 38);
        game.register(sasha);
        game.register(masha);

        int expected =2;
        int actual = game.round("Саша", "Маша");

        Assertions.assertThrows(NewRegisteredException.class,
                () -> game.round("Саша", "Паша")

        );

    }
    @Test
    public void bothPlayersNotExistTest() {
        Game game = new Game();
        Player sasha = new Player(1, "Саша", 45);
        Player masha = new Player(2, "Маша", 45);
        game.register(sasha);
        game.register(masha);

        int expected =0;
        int actual = game.round("Саша", "Маша");

        Assertions.assertThrows(NewRegisteredException.class,
                () -> game.round("Даша", "Паша")

        );

    }


}
