class MaxSum {

    static int maxSum(TreeNode root) {
        // TODO: implementation
        if (root == null) {
          return 0;
        }
        return root.getValue() + Math.max(maxSum(root.getLeft()), maxSum(root.getRight()));
    }
}
