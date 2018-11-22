package ru.mail.dgaponov99.Chapter_7;

class Game {
    Game(int i) {
        System.out.println("Game's constructor");
    }
}
class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame's constructor");
    }
}

public class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Chess's constructor");
    }

    public static void main(String[] args) {
        Chess chess = new Chess();
    }
}
