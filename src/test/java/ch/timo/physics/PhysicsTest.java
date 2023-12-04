package ch.timo.physics;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.WithAssertions;


public class PhysicsTest implements WithAssertions{
    @Test
    void shoot(){
      double y = Physics.parabolicThrowing(0,1, 45);
          assertThat(y).isEqualTo(-245.25);
    }

}
