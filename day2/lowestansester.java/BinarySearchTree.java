import java.util.*;
import java.util.Queue;
class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void addNode(int val) {
        root = addNode(root, val);
    }

    private TreeNode addNode(TreeNode node, int val) {
        if (node == null) {
            return new TreeNode(val);
        }
        if (val < node.val) {
            node.left = addNode(node.left, val);
        } else if (val > node.val) {
            node.right = addNode(node.right, val);
        }
        return node;
    }

    public void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.val + " ");
            inOrderTraversal(node.right);
        }
    }
public TreeNode lowestanssister(TreeNode root, int p, int q) {
        if (root == null || root.val == p || root.val == q) {   
            return root;
        }
        TreeNode left = lowestanssister(root.left, p, q);
        TreeNode right = lowestanssister(root.right, p, q);
        if ( left == null) {
            return right;
        }
        else if( right == null) {
            return left;
        }
        else{
            return root;
        }
        
    }
public List<List<Integer>> levelOrder(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
        return result;
    }
    queue.add(root);
    while (!queue.isEmpty()) {
        int levelNum = queue.size();
        List<Integer> levelList = new ArrayList<>();
        for (int i = 0; i < levelNum; i++) {
            TreeNode currentNode = queue.poll();  // Correctly poll the node from the queue
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
            levelList.add(currentNode.val);  // Use the value of the polled node
        }
        result.add(levelList);
    }
    return result;
}
public boolean isvaildBST(TreeNode root) {
    return isValidBST(root, Long.MIN_VALUE,Long.MAX_VALUE);
}
public boolean isValidBST(TreeNode root, long min, long max) {
    if(root == null) return true;
    if(root.val >= max || root.val <= min) return false;
    return isValidBST(root.left, min, max) && isValidBST(root.right, root.val, max);
}

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.addNode(4);
        bst.addNode(2); 
        bst.addNode(6); 
        bst.addNode(1);  
        bst.addNode(3); 
        bst.addNode(5);  
        bst.addNode(7);      
        bst.inOrderTraversal(bst.root);
        System.out.println("the lowest anscestor is : " + bst.lowestanssister(bst.root, 2, 7).val);
        System.out.println("the level order traversal is : " + bst.levelOrder(bst.root));
        System.out.println("is the tree a valid BST : " + bst.isvaildBST(bst.root));
    }
}