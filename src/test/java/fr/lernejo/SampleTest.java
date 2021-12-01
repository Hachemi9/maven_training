package fr.lernejo;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {

    @Test
    void test_add(){
        final Sample sample = new Sample();
        int result = sample.op(Sample.Operation.ADD,4, 5);
        Assertions.assertThat(result).as("4+5").isEqualTo(9);
    }
    @Test
    void test_multi(){
        final Sample sample = new Sample();
        int result = sample.op(Sample.Operation.MULT,4, 5);
        Assertions.assertThat(result).as("4*5").isEqualTo(20);
    }
    @Test
    void test_fact(){
        final Sample sample = new Sample();
        int result = sample.fact(5);
        Assertions.assertThat(result).as("Facto(5)").isEqualTo(120);
    }
    @Test
    void test_fact_neg(){
        final Sample sample = new Sample();
        int result = -1;
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(()->sample.fact(result));

    }
}
