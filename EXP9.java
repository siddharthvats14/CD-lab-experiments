class Node{
    String value;
    Node left;
    Node right;
    public Node(String value){
        this.value=value;
        this.left=null;
        this.right=null;
    }
}
public class SyntaxTreeConst{
    public static void main(String args[]){
        Node root =new Node("+");
        root.left=new Node("3");
        root.right=new Node("*");
        root.right.left=new Node("2");
        root.right.right=new Node("5");
        printSyntaxTree(root,0);
    }
    public static void printSyntaxTree(Node node,int level){
        if(node==null)
            return ;
        printSyntaxTree(node.right,level+1);
        for(int i=0;i<level;i++)
            System.out.println("\t");
        System.out.println(node.value);
        printSyntaxTree(node.left,level+1);
            
    }
}