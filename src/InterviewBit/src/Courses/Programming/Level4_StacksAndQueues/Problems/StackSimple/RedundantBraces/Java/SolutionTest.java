package InterviewBit.src.Courses.Programming.Level4_StacksAndQueues.Problems.StackSimple.RedundantBraces.Java;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class SolutionTest {
    
    Solution solution;
    
    @BeforeEach
    public void setUp() throws Exception {
        solution = new Solution();
    }
    
    @AfterEach
    public void tearDown() throws Exception {
        solution = null;
    }
    
    @Test
    public void TrivialCase1() {
        String input = "(a + (a + b))";
        assertTimeout(Duration.ofMillis(500), () -> {
            int expected = 0;
            int actual = Solution.braces(input);
            assertEquals(expected, actual);
        });
    }

    @Test
    public void TrivialCase2() {
        String input= "((a + b))";
        assertTimeout(Duration.ofMillis(500), () -> {
            int expected = 1;
            int actual = Solution.braces(input);
            assertEquals(expected, actual);
        });
    }
}