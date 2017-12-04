import org.junit.Test;
import static org.junit.Assert.*;

/** A JUnit test class to test the class IMath. */
public class RoverTest {
    LunarRover testUnit= new LunarRover();
  /** Test isqrt. */
 // @Test
    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("RoverTest");
    }

  public void TestRover() {
    assertEquals("Changing from Zero acceleration to Accelerating foward.",
                 testUnit.setIN("1-R-0"));
    assertEquals("Changing from Zero acceleration to Accelerating backwards.",
                 testUnit.setIN("1-L-5"));
    assertEquals("Changing from Accelerating foward to Zero acceleration.",
                 testUnit.setIN("1-R-0"));
    assertEquals("Changing from Zero acceleration to Accelerating backwards.",
                 testUnit.setIN("2-R-0"));
    assertEquals("Changing from Accelerating backwards to Zero acceleration.",
                 testUnit.setIN("1-L-0"));
  }
}