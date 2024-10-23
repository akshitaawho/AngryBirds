package com.akshitaawho.test;

import com.akshitaawho.test.Screens.PlayScreen;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends Game {
    public static final int V_WIDTH = 1600;
    public static final int V_HEIGHT = 960;
    public SpriteBatch batch;
    //Texture img;

    @Override
    public void create() {
        batch = new SpriteBatch();
        //img = new Texture("level1bg.jpg");
        setScreen(new PlayScreen(this));
    }

    @Override
    public void render() {
        super.render();

    }

}
