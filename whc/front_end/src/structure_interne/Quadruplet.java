package structure_interne;


/* https://github.com/Appendium/objectlabkit/blob/master/utils/src/main/java/net/objectlab/kit/util/Quadruplet.java */
public class Quadruplet<E1, E2, E3, E4> {
    private E1 element1;
    private E2 element2;
    private E3 element3;
    private E4 element4;

    public Quadruplet(final E1 element1, final E2 element2, final E3 element3, final E4 element4) {
        super();
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
        this.element4 = element4;
    }

    public E1 getElement1() {
        return element1;
    }

    public static <E1, E2, E3, E4> Quadruplet<E1, E2, E3, E4> create(final E1 element1, final E2 element2, final E3 element3, final E4 element4) {
        return new Quadruplet<>(element1, element2, element3, element4);
    }

    public Quadruplet<E1, E2, E3, E4> setElement1(final E1 element1) {
        this.element1 = element1;
        return this;
    }

    public E2 getElement2() {
        return element2;
    }

    public Quadruplet<E1, E2, E3, E4> setElement2(final E2 element2) {
        this.element2 = element2;
        return this;
    }

    public E3 getElement3() {
        return element3;
    }

    public Quadruplet<E1, E2, E3, E4> setElement3(final E3 element3) {
        this.element3 = element3;
        return this;
    }

    public E4 getElement4() {
        return element4;
    }

    public Quadruplet<E1, E2, E3, E4> setElement4(final E4 element4) {
        this.element4 = element4;
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
        
        final Quadruplet<?, ?, ?, ?> that = (Quadruplet<?, ?, ?, ?>) rhs;

        if (element1 == that.element1 && element2 == that.element2 && element3 == that.element3 && element4 == that.element4) {
        	return true;
        }
        
        return false;
    }

    @Override
    public String toString() {
    	String res = new String("<");
    	if(element1==null) {
    		res+= "_, ";
    	}
    	else {
    		res+= element1.toString() + ", ";
    	}
    	if(element2==null) {
    		res+= "_, ";
    	}
    	else {
    		res+= element2.toString() + ", ";
    	}
    	if(element3==null) {
    		res+= "_, ";
    	}
    	else {
    		res+= element3.toString() + ", ";
    	}
    	if(element4==null) {
    		res+= "_>";
    	}
    	else {
    		res+= element4.toString() + ">";
    	}
    	return res;
    }
}