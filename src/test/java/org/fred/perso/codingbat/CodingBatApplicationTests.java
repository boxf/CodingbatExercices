package org.fred.perso.codingbat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.fred.perso.codingbat.CodingBatApplication.*;

@SpringBootTest
class CodingBatApplicationTests {


    @Test
    void evenlySpacedTest() {
        assertThat(evenlySpaced(1, 2, 3)).isTrue();
    }

    @Test
    void makeChocolateTest() {
        assertThat(makeChocolate(4, 1, 5)).isEqualTo(0);
    }

    @Test
    void roundSumTest() {
        assertThat(roundSum(6, 4, 4)).isEqualTo(10);
    }

    @Test
    void closeFarTest() {
        assertThat(closeFar(1, 2, 3)).isTrue();
    }

    @Test
    void makeBricksTest() {
        assertThat(makeBricks(1, 2, 3)).isFalse();
    }

    @Test
    void luckySumTest() {
        assertThat(luckySum(1, 2, 3)).isEqualTo(6);
    }

    @Test
    void doubleCharTest() {
        assertThat(doubleChar("The")).isEqualTo("TThhee");
    }

    @Test
    void countHiTest() {
        assertThat(countHi("hihi")).isEqualTo(2);
    }

    @Test
    void catDogTest() {
        assertThat(catDog("catdog")).isTrue();
    }

    @Test
    void endOtherTest() {
        assertThat(endOther("rfgegtercatdog", "catdog")).isTrue();
    }

}
