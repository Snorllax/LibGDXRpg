package com.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.game.handlers.GameStateManager;

public class GameScreen extends MainState {
	
	public GameScreen(GameStateManager gsm) {
		
		super(gsm);
	}
	
	public void handleInput() {
	}
	
	public void update(float dt) {
	}
	
	public void render() {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
	}
	
	public void dispose() {
	}
	
}