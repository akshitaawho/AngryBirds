package io.github.akanksha23056.Screen;

import io.github.akanksha23056.Main;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class HomeScreen implements Screen {
    private final Main game;
    private final SpriteBatch batch;
    private final Texture homeScreenImage;
    private final Texture playButtonImage;
    private final Texture playButtonHoverImage; // For hover effect
    private Texture currentButtonImage; // To hold the current button texture
    private final float buttonX; // X position for the button
    private final float buttonY; // Y position for the button
    private final float buttonWidth; // Width of the button
    private final float buttonHeight; // Height of the button

    public HomeScreen(Main game) {
        this.game = game;
        this.batch = game.batch;
        this.homeScreenImage = new Texture("homescreen.jpg");
        this.playButtonImage = new Texture("playbutton.png");
        this.playButtonHoverImage = new Texture("playbuttonhover.png");

        // Set the button's position and size (adjust as needed)
        this.buttonX = 100; // Example X position
        this.buttonY = 50; // Example Y position
        this.buttonWidth = 200; // Example button width
        this.buttonHeight = 100; // Example button height

        currentButtonImage = playButtonImage; // Start with the normal button image
    }

    @Override
    public void show() {
    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        batch.begin();
        batch.draw(homeScreenImage, 0, 0);
        batch.draw(currentButtonImage, buttonX, buttonY, buttonWidth, buttonHeight); // Draw the current button image
        batch.end();

        // Check for mouse position
        float mouseX = Gdx.input.getX();
        float mouseY = Gdx.graphics.getHeight() - Gdx.input.getY(); // Flip Y coordinate

        // Check if the mouse is over the button
        boolean isHovering = mouseX >= buttonX && mouseX <= buttonX + buttonWidth &&
            mouseY >= buttonY && mouseY <= buttonY + buttonHeight;

        // Change button image on hover
        if (isHovering) {
            currentButtonImage = playButtonHoverImage; // Set to hover image
        } else {
            currentButtonImage = playButtonImage; // Set to normal image
        }

        // Check for button click
        if (Gdx.input.isTouched() && isHovering) {
            game.setScreen(new LevelsScreen(game)); // Redirect to LevelsScreen on click
        }
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
        homeScreenImage.dispose();
        playButtonImage.dispose(); // Dispose the normal button texture
        playButtonHoverImage.dispose(); // Dispose the hover button texture
    }
}
