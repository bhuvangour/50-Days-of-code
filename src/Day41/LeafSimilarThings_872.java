package Day41;
import java.util.*;
public class LeafSimilarThings_872 {
	public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        checkLeftSimilar(list1, root1);
        checkLeftSimilar(list2, root2);

        return list1.equals(list2);
    }

    public void checkLeftSimilar(List<Integer> list, TreeNode root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            list.add(root.val);
            return;
        } else {
            checkLeftSimilar(list, root.left);
            checkLeftSimilar(list, root.right);
        }
    }
}
