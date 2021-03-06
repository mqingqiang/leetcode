package common.datastruct;

import java.util.List;

/**
 * 多叉树的节点
 *
 * @author mqq
 * @date 2020-01-12
 */
public class Node {
	public int val;
	public List<Node> children;

	public Node() {
	}

	public Node(int _val) {
		val = _val;
	}

	public Node(int _val, List<Node> _children) {
		val = _val;
		children = _children;
	}
};