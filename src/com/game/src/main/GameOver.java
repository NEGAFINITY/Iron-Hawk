package com.game.src.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class GameOver {
	public Rectangle playAgain = new Rectangle(Game.WIDTH /2 + 120, 250, 100, 50);
	public Rectangle quitButton = new Rectangle(Game.WIDTH /2 + 120, 350, 100, 50);
	
	
	public void render(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		
		Font fnt1 = new Font("arial", Font.BOLD, 30);
		g.setFont(fnt1);
		g.setColor(Color.white);
		g.drawString("Play Again", playAgain.x +19, playAgain.y + 30);
		g2d.draw(playAgain);
	}

}