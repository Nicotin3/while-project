package structure_interne;

public class Quintuplet<E1, E2, E3, E4, E5> {
    private E1 element1;
    private E2 element2;
    private E3 element3;
    private E4 element4;
    private E5 element5;

    public Quintuplet(final E1 element1, final E2 element2, final E3 element3, final E4 element4, final E5 element5) {
        super();
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
        this.element4 = element4;
        this.element5 = element5;
    }

    public static <E1, E2, E3, E4, E5> Quintuplet<E1, E2, E3, E4, E5> create(final E1 element1, final E2 element2, final E3 element3, final E4 element4, final E5 element5) {
        return new Quintuplet<>(element1, element2, element3, element4, element5);
    }

    public E1 getElement1() {
        return element1;
    }

    public Quintuplet<E1, E2, E3, E4, E5> setElement1(final E1 element1) {
        this.element1 = element1;
        return this;
    }

    public E2 getElement2() {
        return element2;
    }

    public Quintuplet<E1, E2, E3, E4, E5> setElement2(final E2 element2) {
        this.element2 = element2;
        return this;
    }

    public E3 getElement3() {
        return element3;
    }

    public Quintuplet<E1, E2, E3, E4, E5> setElement3(final E3 element3) {
        this.element3 = element3;
        return this;
    }

    public E4 getElement4() {
        return element4;
    }

    public Quintuplet<E1, E2, E3, E4, E5> setElement4(final E4 element4) {
        this.element4 = element4;
        return this;
    }

    public E5 getElement5() {
        return element5;
    }

    public Quintuplet<E1, E2, E3, E4, E5> setElement5(final E5 element5) {
        this.element5 = element5;
        return this;
    }


    @Override
    public boolean equals(final Object rhs) {
        if (rhs == null) {
            return false;
        }
        if (this.getClass() != rhs.getClass()) {
            return false;
        }
        
        final Quintuplet<?, ?, ?, ?, ?> that = (Quintuplet<?, ?, ?, ?, ?>) rhs;

        if (element1 == that.element1 && element2 == that.element2 && element3 == that.element3 && element4 == that.element4 && element5 == that.getElement5()) {
        	return true;
        }
        
        return false;
    }

    @Override
    public String toString() {
    	String res = new String("<" + element1.toString() + ", " + element2.toString() + ", " + element3.toString() + ", " + element4.toString() + ", " + element5.toString() + ">");
        return res;
    }
}