package com.game.handlers;

import java.util.Stack;

import com.game.main.General;
import com.game.states.MainState;
import com.game.states.GameScreen;

public class GameStateManager {
	
	private General game;
	
	private Stack<MainState> gameStates;
	
	public static final int PLAY = 1111;
	
	public GameStateManager(General game) {
		this.game = game;
		gameStates = new Stack<MainState>();
		pushState(PLAY);
	}
	
	public void update(float dt) {
		gameStates.peek().update(dt);
	}
	
	public void render() {
		gameStates.peek().render();
	}
	
	public General game() { return game; }
	
	private MainState getState(int state) {
		if(state == PLAY) return new GameScreen(this);
		return null;
	}
	
	public void setState(int state) {
		popState();
		pushState(state);
	}
	
	public void pushState(int state) {
		gameStates.push(getState(state));
	}
	
	public void popState() {
		MainState g = gameStates.pop();
		g.dispose();
	}
	
}
