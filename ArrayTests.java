import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  @Test
  public void testReversed2() {
    int[] input1 = {1, 2, 3, 4};
    assertArrayEquals(new int[]{4, 3, 2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed3() {
    int[] input1 = {1};
    assertArrayEquals(new int[]{1}, ArrayExamples.reversed(input1));
  }
}
