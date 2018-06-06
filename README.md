## MaxSum

You are given a binary tree. Implement the method maxSum which returns the maximal sum of a route from root to leaf. For example, given the following tree:

        17
       /  \
      3   -10
     /    /  \
    2    16   1
             /
            13

The method should return 23, since [17,-10,16] is the route from root to leaf with the maximal sum.

The class TreeNode is available for you:

    class TreeNode {
        private int value;
        private TreeNode left;
        private TreeNode right;
        ...
    }

Rappel des commande junit :

    javac -cp .:junit-4.12.jar MaxSumTest.java
    java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore MaxSumTest
