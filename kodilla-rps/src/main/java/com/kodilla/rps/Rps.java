package com.kodilla.rps;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Rps {
    public static Map<GameRound, Result> MAP = new HashMap<>();

    static {
        MAP.put(new GameRound(Move.PAPER, Move.PAPER), Result.TIE);
        MAP.put(new GameRound(Move.PAPER, Move.SCISSORS), Result.COMPUTER_WIN);
        MAP.put(new GameRound(Move.PAPER, Move.ROCK), Result.PLAYER_WIN);
        MAP.put(new GameRound(Move.ROCK, Move.PAPER), Result.COMPUTER_WIN);
        MAP.put(new GameRound(Move.ROCK, Move.ROCK), Result.TIE);
        MAP.put(new GameRound(Move.ROCK, Move.SCISSORS), Result.PLAYER_WIN);
        MAP.put(new GameRound(Move.SCISSORS, Move.PAPER), Result.PLAYER_WIN);
        MAP.put(new GameRound(Move.SCISSORS, Move.ROCK), Result.COMPUTER_WIN);
        MAP.put(new GameRound(Move.SCISSORS, Move.SCISSORS), Result.TIE);
    }

    enum Result {
        COMPUTER_WIN, PLAYER_WIN, TIE
    }

    enum Move {
        PAPER, ROCK, SCISSORS
    }

    public static class GameRound {
        private Move playerMove;
        private Move computerMove;

        public GameRound(Move playerMove, Move computerMove) {
            this.playerMove = playerMove;
            this.computerMove = computerMove;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            GameRound gameRound = (GameRound) o;
            return playerMove == gameRound.playerMove &&
                    computerMove == gameRound.computerMove;
        }

        @Override
        public int hashCode() {
            return Objects.hash(playerMove, computerMove);
        }
    }
    public Result evaluateWinner(GameRound gameRound) {
        return MAP.get(gameRound);
    }
}
