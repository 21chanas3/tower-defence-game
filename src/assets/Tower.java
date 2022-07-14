package assets;

import utils.Vector2D;

public class Tower {
    private float attackSpeed;
    private float attackDamage;
    private float cost;
    private Vector2D coord;

    public Tower(float attackSpeed, float attackDamage, float cost) {
        this.attackSpeed = attackSpeed;
        this.attackDamage = attackDamage;
        this.cost = cost;
    }

    public float getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(float attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public float getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(float attackDamage) {
        this.attackDamage = attackDamage;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Vector2D getCoord() {
        return coord;
    }

    public void setCoord(Vector2D coord) {
        this.coord = coord;
    }
}