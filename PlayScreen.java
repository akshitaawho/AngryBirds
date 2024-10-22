package com.akshitaawho.test.Screens;

import com.akshitaawho.test.Main;
import com.akshitaawho.test.Scenes.Hud;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class PlayScreen implements Screen {
    private Main game;
    private OrthographicCamera gamecam;
    private Viewport gamePort;
    private Hud hud;

    private TmxMapLoader maploader;
    private TiledMap map;
    private OrthogonalTiledMapRenderer renderer;

    public PlayScreen(Main game) {
        this.game = game;
        gamecam = new OrthographicCamera();

        // Load the map first before accessing its properties
        maploader = new TmxMapLoader();
        map = maploader.load("level1.tmx");

        // Now calculate map width and height after loading the map
        float mapw = map.getProperties().get("width", Integer.class) * 16;
        float maph = map.getProperties().get("height", Integer.class) * 16;

        // Initialize the viewport with map width and height
        gamePort = new FitViewport(mapw, maph, gamecam);

        // Center the camera on the map
        gamecam.position.set(mapw / 2, maph / 2, 0);

        hud = new Hud(game.batch);
        renderer = new OrthogonalTiledMapRenderer(map);
    }

    @Override
    public void show() {}

    @Override
    public void render(float delta) {
        gamecam.update();
        renderer.setView(gamecam);

        // Clear the screen with a background color
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        // Render the map
        renderer.render();

        // Draw the HUD
        game.batch.setProjectionMatrix(hud.stage.getCamera().combined);
        hud.stage.draw();
    }

    @Override
    public void resize(int width, int height) {
        gamePort.update(width, height);
    }

    @Override
    public void pause() {}

    @Override
    public void resume() {}

    @Override
    public void hide() {}

    @Override
    public void dispose() {
        map.dispose();
        renderer.dispose();
       // hud.dispose();
    }
}
