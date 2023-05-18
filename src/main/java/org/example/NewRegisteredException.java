package org.example;

public class NewRegisteredException extends RuntimeException {
    public NewRegisteredException(String playerName) {
        super("Игрок с именем " + playerName + " не найден");
    }
}
