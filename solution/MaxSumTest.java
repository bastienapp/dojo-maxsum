import junit.framework.*;
import org.junit.Test;
import org.junit.Assert;

public class MaxSumTest extends TestCase {

	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}
    
    /**
     * null
     */
    @Test
    public void testNullTree() {
        TreeNode tree = null;
		assertEquals(0, MaxSum.maxSum(tree));
    }

    /**
     *        5
     *      /   \
     *    -22    11
     *    / \    / \
     *   9  50  9   2
     */
    @Test
    public void testTree() {
        TreeNode tree = new TreeNode(5,
            new TreeNode(-22, new TreeNode(9, null, null), new TreeNode(50, null, null)),
            new TreeNode(11, new TreeNode(9, null, null), new TreeNode(2, null, null))
        );
		assertEquals(33, MaxSum.maxSum(tree));
    }
}
