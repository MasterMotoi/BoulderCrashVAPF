package model.character;

import java.awt.Graphics2D;

public class Entity {
	private String sprite;
	int x, y;
	
	public setCooEntity(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void update() {
		
	}
	
	
	public void draw(Graphics2D g2d) {
		
	}
	public String getSprite() {
		return sprite;
	}
	
	public void setSprite (String sprite) {
		this.sprite = sprite;
	}
}
