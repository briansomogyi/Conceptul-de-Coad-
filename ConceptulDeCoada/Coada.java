import java.util.LinkedList;

import java.util.Iterator;

public class Coada {
    private int dim;
    private LinkedList<CardBancar> list;

    public Coada(int dim) {
        this.dim = dim;
        list = new LinkedList<>();
    }

    public static Coada createCoada(int dim) throws ParametruNegativ {
        if (dim < 0) {
            throw new ParametruNegativ(dim);
        } else {
            return new Coada(dim);
        }
    }

    public void addLast(CardBancar cardBancar) throws NuMaiExistaLoc {
        if (list.size() >= dim) {
            throw new NuMaiExistaLoc("Nu mai exista loc in coada pentru introducerea unui nou element.");
        } else {
            list.addLast(cardBancar);
        }
    }

    public CardBancar getFirst() throws CoadaEsteGoala {
        if (list.size() <= 0) {
            throw new CoadaEsteGoala("Coada este goala.");
        } else {
            return list.removeFirst();
        }
    }

    public void list() {
        System.out.println(this);
    }

    public boolean esteInCoada(Strategie strategie) {
        Iterator<CardBancar> iterator = list.iterator();
        while (iterator.hasNext()) {
            CardBancar cardBancar = iterator.next();
            if (strategie.conditie(cardBancar)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Coada [dim=" + dim + ", list=" + list + "]";
    }

}
