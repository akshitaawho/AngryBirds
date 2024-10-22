package com.akshitaawho.test.Screens;

import com.akshitaawho.test.Main;
import com.akshitaawho.test.Scenes.Hud;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class PlayScreen implements Screen {
    private Main game;
    //Texture texture;
    private OrthographicCamera gamecam;
    private Viewport gamePort;
    private Hud hud;

    private TmxMapLoader maploader;
    private TiledMap map;
    private OrthogonalTiledMapRenderer renderer;

    public PlayScreen(Main game) {
        this.game = game;
        //texture = new Texture("level1bg.jpg");
        gamecam = new OrthographicCamera();
        gamePort = new FitViewport(Main.V_WIDTH, Main.V_HEIGHT, gamecam);
        hud = new Hud(game.batch);
        maploader = new TmxMapLoader();
        map = maploader.load("level1.tmx");
        renderer = new OrthogonalTiledMapRenderer(map);
        gamecam.position.set(gamePort.getWorldWidth() / 2, gamePort.getWorldHeight() / 2, 0);

    }

    @Override
    public void show() {

    }

    public void handleInput(float dt) {
        if (Gdx.input.isTouched()) {
            gamecam.position.x += 100 * dt;
        }
    }

    public void update(float dt) {
        handleInput(dt);

        gamecam.update();
        renderer.setView(gamecam);
    }

    @Override
    public void render(float delta) {
        update(delta);

        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        renderer.render();

        game.batch.setProjectionMatrix(gamecam.combined);
        //game.batch.begin();
        //game.batch.draw(texture, 0, 0);
        //game.batch.end();

        game.batch.setProjectionMatrix(hud.stage.getCamera().combined);
        hud.stage.draw();
    }

    @Override
    public void resize(int width, int height) {
        gamePort.update(width, height);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}

//public class PlayScreen implements Screen {
//    private Main game;
//    private OrthographicCamera gamecam;
//    private Viewport gamePort;
//    private Hud hud;
//
//    private TmxMapLoader maploader;
//    private TiledMap map;
//    private OrthogonalTiledMapRenderer renderer;
//
//    public PlayScreen(Main game) {
//        this.game = game;
//        gamecam = new OrthographicCamera();
//        gamePort = new FitViewport(Main.V_WIDTH, Main.V_HEIGHT, gamecam);
//        hud = new Hud(game.batch);
//
//        maploader = new TmxMapLoader();
//        map = maploader.load("level1.tmx");
//        renderer = new OrthogonalTiledMapRenderer(map);
//
//        gamecam.position.set(gamePort.getWorldWidth() / 2, gamePort.getWorldHeight() / 2, 0);
//    }
//
//    @Override
//    public void show() {}
//
//    public void handleInput(float dt) {
//        if (Gdx.input.isTouched()) {
//            gamecam.position.x += 100 * dt;
//        }
//    }
//
//    public void update(float dt) {
//        handleInput(dt);
//        gamecam.update();
//        renderer.setView(gamecam);
//    }
//
//    @Override
//    public void render(float delta) {
//        update(delta);
//
//        Gdx.gl.glClearColor(0, 0, 0, 1);
//        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//
//        renderer.render();
//
//        game.batch.setProjectionMatrix(gamecam.combined);
//
//        game.batch.setProjectionMatrix(hud.stage.getCamera().combined);
//        hud.stage.draw();
//    }
//
//    @Override
//    public void resize(int width, int height) {
//        gamePort.update(width, height);
//        gamecam.position.set(gamePort.getWorldWidth() / 2, gamePort.getWorldHeight() / 2, 0);
//    }
//
//    @Override
//    public void pause() {}
//
//    @Override
//    public void resume() {}
//
//    @Override
//    public void hide() {}
//
//    @Override
//    public void dispose() {
//        map.dispose();
//        renderer.dispose();
//
//    }
//}
