package JavaStudy.Study;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-15 20:01
 **/
public class Study0515 {
    public static void main(String[] args) {
        MyTree myTree = new MyTree();
        NodeTree root = myTree.buildTree();
        myTree.preOrderTraversal(root);
        System.out.println();
        myTree.inOrderTraversal(root);
        System.out.println();
        myTree.postOrderTraversal(root);
        System.out.println();
        System.out.println(myTree.getSize1(root));
    }
}
