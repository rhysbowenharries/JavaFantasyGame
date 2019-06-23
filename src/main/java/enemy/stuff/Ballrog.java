package enemy.stuff;

import elements.Element;
import interfaces.IEnchantable;

public class Ballrog extends Enemy implements IEnchantable {
    public Ballrog() {
        super(1, 18, Element.NONE, "Earth creatures");
    }
}
