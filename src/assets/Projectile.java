package assets;

import utils.Vector2D;

public class Projectile {
    private float damage;
    private Vector2D coord;
    private Vector2D velocity;

    public Projectile(float damage) {
        this.damage = damage;
    }

    public boolean hitEnemy(Enemy enemy) {
        return enemy.getCoord().getX() == coord.getX() && enemy.getCoord().getY() == coord.getY();
    }

    public void move(){
        coord.setX(coord.getX() + velocity.getX());
        coord.setY(coord.getY() + velocity.getY());
    }

    public float getDamage() {
        return damage;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }

    public Vector2D getCoord() {
        return coord;
    }

    public void setCoord(Vector2D coord) {
        this.coord = coord;
    }

    public Vector2D getMotion() {
        return velocity;
    }

    public void setMotion(Vector2D motion) {
        this.velocity = motion;
    }
}