package com.game.states;

import com.game.handlers.GameStateManager;
import com.game.player.RpgChar;

public class GameScreen extends MainState {
	
	private RpgChar character;
	
	public GameScreen(GameStateManager gsm) {
		
		super(gsm);
		
		character = new RpgChar();
	}
	
	public void handleInput() {
		
		character.handleInput();
	}
	
	public void update(float dt) {
		
		character.update();
	}
	
	public void render() {
		
		character.render();
	}
	
	public void dispose() {
	}
	
}