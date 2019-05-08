package model;

import behavior.ICharacterBehavior;

public abstract class Character {
    private ICharacterBehavior attackBehavior;

    public Character(ICharacterBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
    }

    public void resolveAttack() {
        attackBehavior.attack();
    }

    public abstract void display();
}
