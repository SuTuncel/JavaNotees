package COMP2102VİZE1.binaryTreeSreach;

import jdk.swing.interop.SwingInterOpUtils;

public class BST {
    BNode root;
    int size;

    BST(){
        root=null;
    }
    public void addNode(int key){
        if(root==null){
            root=new BNode(key);
        }
        else{
            BNode temp = root;
            BNode parent = root;
            while(temp!=null){
                parent=temp;
                if(key< temp.key){
                    temp=temp.left;
                }else if(key> temp.key){
                    temp=temp.right;
                }else{
                    parent.key=key;
                    break;
                }
            }
            BNode newNode = new BNode(key);
            if(key< parent.key){
                parent.left=newNode;
            }else if (key> parent.key){
                parent.right=newNode;
            }
            size++;
        }

    }
    public int mymet(BNode node){
        if(node==null){
            return 0;
        }else{
            return (int) node.key- (mymet(node.left)+mymet(node.right))/2;
        }
    }

    public int mymet2(BNode node){
        if(node==null){
            return 0;
        }else{
            return (int) mymet(node.left)+mymet(node.right)+node.key;
        }
    }

    public static void main(String[] args) {
        BST bst = new BST();
        BNode bir = new BNode(4);
        BNode iki = new BNode(3);
        BNode uc = new BNode(1);
        BNode dort = new BNode(0);
        BNode bes = new BNode(2);
        BNode alti = new BNode(15);
        BNode yedi = new BNode(18);
        BNode sekiz = new BNode(17);
        BNode dokuz = new BNode(31);
        bst.addNode(bir.key);
        bst.addNode(iki.key);
        bst.addNode(uc.key);
        bst.addNode(dort.key);
        bst.addNode(bes.key);
        bst.addNode(alti.key);
        bst.addNode(yedi.key);
        bst.addNode(sekiz.key);
        bst.addNode(dokuz.key);

        System.out.println(bst.mymet(bir));
        System.out.println(bst.mymet2(bir));


    }


}

class BNode{
    int key;
    BNode left,right;

    public BNode(int key) {
        this.key=key;

    }

    public String toString(){
        return key+" ";
    }


}

