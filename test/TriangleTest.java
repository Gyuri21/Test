import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.*;
public class TriangleTest {
    Triangle triangle;

    @BeforeEach
    void setup(){
        triangle = new Triangle();
    }
    @Test
    void calcAreaTest(){
        double base = 30;
        double height = 35;
        double expectedArea = 525.0;

        double actualArea = this.triangle.calcArea(base, height);
        assertEquals(expectedArea, actualArea);
    }
    @Test
    void calcAreaTestAnother(){
        double base = 3123123;
        double height = 31232131;
        double expectedArea = 12312312;

        double actualArea = this.triangle.calcArea(base, height);
        assertEquals(expectedArea, actualArea);
    }
    @Test
    @DisplayName("Az alap 0 teszt")
    @Disabled("-1-re átírni az elvártat")
    void calcAreaforZero(){
        assertEquals(0,this.triangle.calcArea(0, 35));

    }


}
