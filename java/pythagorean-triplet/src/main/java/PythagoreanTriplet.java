import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class PythagoreanTriplet {

    private final int a;
    private final int b;
    private final int c;

    PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        //System.out.println("a in cons= " + a);
        //System.out.println("b in cons = " + b);
        //System.out.println("c in cons = " + c);
    }
    @Override
    public String toString() {
        return "(" + a + ", " + b + ", " + c + ")";
    }

    public boolean equals(Object o) {
        if ( this == o ) {
            return true;
        } else if ( o instanceof PythagoreanTriplet ) {
            PythagoreanTriplet pt = (PythagoreanTriplet) o;
            return a == pt.a && b == pt.b && c == pt.c;
        } else {
            return false;
        }
    }

    static TripletListBuilder makeTripletsList() {
        return new TripletListBuilder();
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    static class TripletListBuilder {

        private int sum;
        private int maxFactor;

        TripletListBuilder thatSumTo(int sum) {
            this.sum = sum;
            System.out.println("sum in func = "+sum);
            return this;
        }

        TripletListBuilder withFactorsLessThanOrEqualTo(int maxFactor) {
            this.maxFactor = maxFactor;
            System.out.println("max factor in func = "+maxFactor);
            return this;
        }

        List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> triplets = new ArrayList<>();
            System.out.println("sum = " + sum);
            System.out.println("maxFactor = " + maxFactor);
            for (int a = 1; a < sum/2; a++) {
                for (int b = a + 1; b < sum/2; b++) {
                    int c = sum - a - b;
                    if (maxFactor == 0 || c <= maxFactor) {
                        if (a * a + b * b == c * c) {
                            System.out.println("a after if = " + a);
                            System.out.println("b = " + b);
                            System.out.println("c = " + c);
                            PythagoreanTriplet triplet = new PythagoreanTriplet(a, b, c);
                            System.out.println("triplet = "+triplet);
                            triplets.add(triplet);
                        }
                    }
                }

            }
            //triplets = Collections.singletonList(triplets);
            return triplets;
            //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        }

    }

}