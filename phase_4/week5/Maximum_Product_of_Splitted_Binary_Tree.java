package phase_4.week5;

public class Maximum_Product_of_Splitted_Binary_Tree{
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    static int mod = 1000000007;
    static long ans = 0;
    public static int sum(TreeNode root) {
        if(root == null){
            return 0;
        }

        int left = sum(root.left);
        int right = sum(root.right);

        return root.val + left + right;

    }

    public static int solve(TreeNode root, int totSum) {
        if(root == null){
            return 0;
        }

        int left = solve(root.left, totSum);// left subtree
        int right = solve(root.right, totSum);// right subtree

        // now sum of subtree having curr node as root
        int subSum = root.val + left + right;
        long prod = (long)subSum * ((long)totSum - subSum);
        ans = Math.max(ans, prod) ;

        return subSum;
    }

    public static int maxProduct(TreeNode root) {
        int totSum = sum(root);
        solve(root, totSum);

        return (int)(ans % mod);
    }

    public static void main(String[] args) {
        
    }
}
