/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 01/02/2024
 * Time : 11:29
 * Project Name : lecture10
 */
package lecture10;


import javax.swing.tree.TreeNode;

public class BinarySearchTree {
    TreeNode root;

    BinarySearchTree() {
        root = null;
    }

    BinarySearchTree(int val) {
        root = new TreeNode(val);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return val + " ";
        }
    }

    public TreeNode search(TreeNode root, int target) {
        if (root == null) {
            return null;
        } else if (root.val == target) {
            return root;
        }

        if (target < root.val) {
            return search(root.left, target);
        }

        return search(root.right, target);
    }

    public void insert(int val) {
        if (root == null) {
            root = new TreeNode(val);
        } else {
            insertRec(root, val);
        }
    }
//    public void insert(int val) {
//           root = insertRec(root, val);
//    }

    public TreeNode insertRec(TreeNode node, int val) {
        if (node == null) {
            return new TreeNode(val);
        }

        if (node.val < val) {
            node.right = insertRec(node.right, val);
        } else {
            node.left = insertRec(node.left, val);
        }
        return node;
    }

    public void inOrderTraverse(){
        inOrderTraverse(root);
    }
    private void inOrderTraverse(TreeNode root) {
        if (root == null) {return;}
            inOrderTraverse(root.left);
            System.out.print(root.val + " ");
            inOrderTraverse(root.right);

    }

    public void preOrderTraverse(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preOrderTraverse(root.left);
            preOrderTraverse(root.right);
        }
    }

    public void postOrderTraverse(TreeNode root) {
        if (root != null) {
            postOrderTraverse(root.left);
            postOrderTraverse(root.left);
            System.out.print(root.val + " ");
        }
    }

    public TreeNode deleteNode(int key){
        return deleteNode(root,key);
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        // return null if root is null
        if (root == null) {
            return null;
        }

        // delete current node
        // if root is the target node
        if (root.val == key) {
            // replace root with root->right
            // if root->left is null
            if (root.left == null) {
                return root.right;
            }

            //replace root with root->left
            // if root->right is null
            if (root.right == null) {
                return root.left;
            }

            // replace root with its successor
            // if root has two children
            TreeNode p = findSuccessor(root);
            root.val = p.val;
            root.right = deleteNode(root.right, p.val);
            return root;

        }

        if (root.val > key) {
            // find target in right subtree
            // if root.val < key
            root.left = deleteNode(root.left, key);
        } else {
            // find target in left subtree
            // if root.val < key
            root.right = deleteNode(root.right, key);
        }
        return root;
    }

    private TreeNode findSuccessor(TreeNode root) {
        TreeNode cur = root.right;
        while (cur != null && cur.left != null) {
            cur = cur.left;
        }
        return cur;
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root.val +
                "}";
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(1);
        bst.insert(2);
        bst.insert(3);
        bst.insert(4);
        bst.insert(5);
        bst.deleteNode(3);
        bst.deleteNode(4);
        bst.inOrderTraverse();
        System.out.println(bst);
    }
}
