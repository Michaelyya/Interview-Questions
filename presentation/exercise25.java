package presentation;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
/*

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}

public class Solution {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		dfs(result, root, 0);
		return result;
	}

	private void dfs(List<List<Integer>> result, TreeNode node, int depth) {
		if (node == null) {
			return;
		}

		if (depth >= result.size()) {
			result.add(new ArrayList<>());
		}

		result.get(depth).add(node.val);

		dfs(result, node.left, depth + 1);
		dfs(result, node.right, depth + 1);
	}

}
 */
