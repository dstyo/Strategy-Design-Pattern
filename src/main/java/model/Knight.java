package model;

import behavior.ICharacterBehavior;

public class Knight extends Character {

    public Knight(ICharacterBehavior attackBehavior) {
        super(attackBehavior);
    }

    @Override
    public void display() {
        System.out.println("Knight has appeared");
    }
}
