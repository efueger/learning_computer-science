package InterviewBit.src.Courses.Programming.Level3_BitManipulation.Problems.BitPlay.DifferentBitsSumPairwise.Java;

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
        int[] input = {1, 3, 5};
        assertTimeout(Duration.ofMillis(500), () -> {
            int expected = 8;
            int actual = Solution.cntBits(input);
            assertEquals(expected, actual);
        });
    }
}