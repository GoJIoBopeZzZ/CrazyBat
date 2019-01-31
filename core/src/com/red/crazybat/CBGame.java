package com.red.crazybat;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.red.crazybat.screens.GameScreen;

public class CBGame extends Game {

    @Override
    public void create() {
        Gdx.app.log("ZBGame", "created");

        setScreen(new GameScreen());
    }
}
