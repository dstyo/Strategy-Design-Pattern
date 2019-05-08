import behavior.BowAttack;
import behavior.SpearAttack;
import behavior.SwordAttack;
import model.Hunter;
import model.Knight;
import model.Legionnaire;
import model.Character;

public class PatternStrategy {

    public static void main(String[] args) {

        Character soldier = new Knight( new SwordAttack());
        Character hunter = new Hunter( new BowAttack());
        Character legionnaire = new Legionnaire( new SpearAttack());

        soldier.display();
        hunter.display();
        legionnaire.display();

        soldier.resolveAttack();
        hunter.resolveAttack();
        legionnaire.resolveAttack();

    }
}
