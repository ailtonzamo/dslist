package com.devsuperior.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class BelongingPK implements Serializable {
    private static final long serialVersionUID = 22938189282784998L;
    @ManyToOne
    @JoinColumn(name="game_id")
    private Game game;
    @ManyToOne
    @JoinColumn(name="list_id")
    private GameList gameLIst;
    public BelongingPK(){


    }

    public Game getGame() {
        return game;
    }

    public BelongingPK(Game game, GameList gameLIst) {
        this.game = game;
        this.gameLIst = gameLIst;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameList getGameLIst() {
        return gameLIst;
    }

    public void setGameLIst(GameList gameLIst) {
        this.gameLIst = gameLIst;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return game.equals(that.game) && gameLIst.equals(that.gameLIst);
    }

    @Override
    public int hashCode() {
        return Objects.hash(game, gameLIst);
    }
}
