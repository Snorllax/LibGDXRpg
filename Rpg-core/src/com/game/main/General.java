package com.game.main;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.game.handlers.MyInput;
import com.game.handlers.MyInputProcessor;
import com.game.handlers.BoundedCamera;
import com.game.handlers.ResourceManager;
import com.game.handlers.GameStateManager;

public class General implements ApplicationListener {
	
	public static final String TITLE = "Rpg";
	public static final float STEP = 1 / 60f;
	
	public static int W_WIDTH;
	public static int W_HEIGHT;
	
	private SpriteBatch sb;
	private BoundedCamera cam;
	private OrthographicCamera hudCam;
	
	private GameStateManager gsm;
	
	public static ResourceManager res;
	
	public void create() {
		
	    W_WIDTH = Gdx.graphics.getWidth();
		W_HEIGHT = Gdx.graphics.getHeight();
		
		Gdx.input.setInputProcessor(new MyInputProcessor());
		
		res = new ResourceManager();
		
		cam = new BoundedCamera();
		cam.setToOrtho(false, W_WIDTH, W_HEIGHT);
		hudCam = new OrthographicCamera();
		hudCam.setToOrtho(false, W_WIDTH, W_HEIGHT);
		
		sb = new SpriteBatch();
		
		gsm = new GameStateManager(this);
		
	}
	
	public void render() {
		
		Gdx.graphics.setTitle(TITLE + " -- FPS: " + Gdx.graphics.getFramesPerSecond());
		
		gsm.update(Gdx.graphics.getDeltaTime());
		gsm.render();
		MyInput.update();
		
	}
	
	public void dispose() {
		res.removeAll();
	}
	
	public void resize(int w, int h) {}
	
	public void pause() {}
	
	public void resume() {}
	
	public SpriteBatch getSpriteBatch() { return sb; }
	public BoundedCamera getCamera() { return cam; }
	public OrthographicCamera getHUDCamera() { return hudCam; }
	
}
