package com.negafinity.ironhawk.entities;

import com.negafinity.ironhawk.Controller;
import com.negafinity.ironhawk.Game;
import com.negafinity.ironhawk.Physics;
import com.negafinity.ironhawk.Textures;
import com.negafinity.ironhawk.libs.Animation;

public class Missile extends Entity
{
	public Missile(double x, double y, Textures tex, Controller c, Game game)
	{
		super(x, y, tex, c, game);

		this.name = "Bullet";
		anim = new Animation(5, tex.missile[0], tex.missile[1]);
	}

	@Override
	public void tick()
	{
		super.tick();

		for (int i = 0; i < c.getEntities().size(); i++)
		{
			Entity entity = c.getEntities().get(i);

			if (entity instanceof Enemy)
			{
				if (Physics.collision(this, entity))
				{
					c.removeEntity(this);
					c.removeEntity(entity);
					c.randomlySpawnHealthPack(x, y);
					c.randomlySpawnRapidFire(x, y);
					c.randomlySpawnMissilePowerup(x, y);
					game.setEnemiesKilled(game.getEnemiesKilled() + 1);
				}
			}
		}
		y -= 20;
	}

}