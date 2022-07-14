package assets;

import utils.Vector2D;

public class Enemy {
    private float health;
    private int damage;
    private Vector2D coord;


    public Enemy(float health, int damage, Vector2D coord) {
        this.health = health;
        this.damage = damage;
        this.coord = coord;
    }

    public boolean isDead() {
        return this.health <= 0;
    }

    public float getHealth() {
        return health;
    }

    public void addHealth(float health) {
        this.health += health;
    }

    public void subtractHealth(float health) {
        this.health -= health;
    }

    public void setHealth(float health) {
        this.health = Math.max(health, 0);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Vector2D getCoord() {
        return coord;
    }

    public void setCoord(Vector2D coord) {
        this.coord = coord;
    }
}