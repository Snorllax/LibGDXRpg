package com.game.handlers;

import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.Input.Keys;

public class MyInputProcessor extends InputAdapter {
	
	public boolean mouseMoved(int x, int y) {
		MyInput.x = x;
		MyInput.y = y;
		return true;
	}
	
	public boolean touchDragged(int x, int y, int pointer) {
		MyInput.x = x;
		MyInput.y = y;
		MyInput.down = true;
		return true;
	}
	
	public boolean touchDown(int x, int y, int pointer, int button) {
		MyInput.x = x;
		MyInput.y = y;
		MyInput.down = true;
		return true;
	}
	
	public boolean touchUp(int x, int y, int pointer, int button) {
		MyInput.x = x;
		MyInput.y = y;
		MyInput.down = false;
		return true;
	}
	
	public boolean keyDown(int k) {
		if(k == Keys.LEFT) MyInput.setKey(MyInput.LEFT, true);
		if(k == Keys.RIGHT) MyInput.setKey(MyInput.RIGHT, true);
		if(k == Keys.UP) MyInput.setKey(MyInput.UP, true);
		if(k == Keys.DOWN) MyInput.setKey(MyInput.DOWN, true);
		
		return true;
	}
	
	public boolean keyUp(int k) {
		if(k == Keys.LEFT) MyInput.setKey(MyInput.LEFT, false);
		if(k == Keys.RIGHT) MyInput.setKey(MyInput.RIGHT, false);
		if(k == Keys.UP) MyInput.setKey(MyInput.UP, false);
		if(k == Keys.DOWN) MyInput.setKey(MyInput.DOWN, false);
		
		return true;
	}
	
}
