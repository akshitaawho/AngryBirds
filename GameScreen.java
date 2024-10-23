// File: GameScreen.java
package io.github.akanksha23056.Screen;
import io.github.akanksha23056.Main;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class GameScreen implements Screen {
    private final Main game;  // Cast as Main to access batch
    private final SpriteBatch batch;
    private final Texture gameScreenImage;
    private float elapsedTime = 0;

    public GameScreen(Main game) {
        this.game = game;
        this.batch = ((Main) game).batch; // Access batch from Main
        this.gameScreenImage = new Texture("gamescreen.jpg");
    }

    @Override
    public void show() {
    }

    @Override
    public void render(float delta) {
        elapsedTime += delta; // Track how much time has passed
        if (elapsedTime > 4) {
            game.setScreen(new HomeScreen(game)); // After 5 seconds, switch to HomeScreen
        }

        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        batch.begin();
        batch.draw(gameScreenImage, 0, 0);
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
        gameScreenImage.dispose();
    }
}
