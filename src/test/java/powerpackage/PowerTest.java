package powerpackage;

import org.junit.jupiter.api.Test;

class PowerTest {
    @Test
    public void oneRaisedToOneIsOne() {
        assert PowerFinder.powerOf(1,1) == 1;
    }

    @Test
    public void twoRaisedToOneIsTwo() {
       assert PowerFinder.powerOf(2,1) == 2;
    }

    @Test
    public void twoRaisedToTwoIsFour() {
         assert PowerFinder.powerOf(2, 2) == 4;
    }

    @Test
    public void twoRaisedToThreeIsSix() {
       assert PowerFinder.powerOf(3, 2) == 9;
    }
}