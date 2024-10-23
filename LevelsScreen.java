package io.github.akanksha23056.Screen;

import io.github.akanksha23056.Main;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class LevelsScreen implements Screen {
    private final Main game;
    private final SpriteBatch batch;
    private final Texture levelsImage;

    public LevelsScreen(Main game) {
        this.game = game;
        this.batch = game.batch;
        this.levelsImage = new Texture("levels.png"); // Load your levels image
    }

    @Override
    public void show() {
    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        batch.begin();
        batch.draw(levelsImage, 0, 0); // Draw the levels image
        batch.end();
    }

    @Override
    public void resize(int width, int height) {
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
        levelsImage.dispose(); // Dispose the levels image texture
    }
}
