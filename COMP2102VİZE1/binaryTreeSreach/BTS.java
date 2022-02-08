package COMP2102VİZE1.binaryTreeSreach;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class BTS <E>{
    Node<E> root;

    BTS(){
        root=null;
    }
    public void addNode(int key, E data){
        if(root==null){
            root=new Node<>(key, data);
        }
        else{
            Node<E> temp = root;
            Node<E> parent = root;
            while(temp!=null){
                parent=temp;
                if(key< temp.key){
                    temp=temp.left;
                }else if(key> temp.key){
                    temp=temp.right;
                }else{
                    parent.data=data;
                    break;
                }
            }
            Node<E> newNode = new Node<>(key, data);
            if(key< parent.key){
                parent.left=newNode;
            }else if (key> parent.key){
                parent.right=newNode;
            }
        }

    }

    public Node<E> search(int key){
        return searchRecursive(this.root,key);
    }
    public Node<E> searchRecursive(Node<E> focus, int key){
        if(focus==null){
            return null;
        }
        if (focus.key==key){
            return focus;
        }else if (key< focus.key){
            return searchRecursive(focus.left, key);
        }else{
            return searchRecursive(focus.right, key);
        }
    }

    public Node<E> maxSearch(Node<E> focus){
        if(focus.right==null){
            return focus;
        }else{
            return maxSearch(focus.right);
        }

    }

    public Node<E> minSearch(Node<E> focus){
        if(focus.left==null){
            return focus;
        }else{
            return minSearch(focus.left);
        }
    }

    public void traverseInOrder(Node<E> focus){
        if(focus.left!=null){
            traverseInOrder(focus.left);
        }
        System.out.println(focus);
        if(focus.right!=null){
            traverseInOrder(focus.right);
        }
    }

    public void traversePreOrder(Node<E> focus){
        System.out.println(focus);
        if(focus.left!=null){
            traversePreOrder(focus.left);
        }
        if(focus.right!=null){
            traversePreOrder(focus.right);
        }
    }

    public void traverseLevelOrder(Node focus) {
        java.util.LinkedList<Node> que = new java.util.LinkedList<Node>();

        que.add(focus);

        while (!que.isEmpty()) {

            Node d = que.removeFirst();

            if (d.left != null) {
                que.addLast(d.left);
            }

            if (d.right != null) {
                que.addLast(d.right);
            }

            System.out.println(d);
        }
    }

    public int countGreaterThanRoot(){
        int count =0;
        if(root.right!=null) {
            java.util.LinkedList<Node> que = new LinkedList<>();
            que.add(root.right);
            count++;
            while(!que.isEmpty()){
                Node de = que.removeFirst();
                if(de.left!=null){
                    que.addLast(de.left);
                    count++;
                }
                if(de.right!=null){
                    que.addLast(de.right);
                    count++;
                }
                System.out.println(de);
            }
            return count;
        }else{
            throw new NoSuchElementException();
        }
    }

    public int size(Node<E> num){
        if(num==null){
            return 0;
        }else{
            int a = size(num.left)+1;
            int b = size(num.right);
            return (a+b);
        }
    }

    public int mymet(Node<E> node){
        if(node==null){
            return 0;
        }else{
            return (int) node.data- (mymet(node.left)+mymet(node.right))/2;
        }
    }

    public int sumRec(Node<E> root){//with recursive
        if(root==null){
            return 0;
        }
        return (root.key+sumRec(root.left)+sumRec(root.right));
    }

    public int sum(){// wtihout recursive
        int sum =0;

        if(root!=null){
            java.util.LinkedList<Node> que = new LinkedList<>();
            que.add(root);
            sum+=root.key;
            while(!que.isEmpty()){
                Node d = que.removeFirst();
                if (d.left!=null){
                    que.addLast(d.left);
                    sum+=d.left.key;
                }
                if (d.right!=null){
                    que.addLast(d.right);
                    sum+=d.right.key;
                }

            }
            return sum;
        } else{
            throw new NoSuchElementException();
        }
    }

    public boolean issameTree(Node<E> root1, Node<E> root2){
        if(root1==null && root2==null){
            return true;
        }

        if(root1!=null && root2!=null){
            return ((root1.data== root2.data)&&
                    (issameTree(root1.left,root2.left)) &&
                    (issameTree(root1.right,root2.right)));
        }
          return false;
    }


    public boolean issame(Node<E> node1, Node<E> node2) {

        if ((node1 == null && node2 == null) || (node1 == null && node2 != null) || (node1 != null && node2 == null)) {
            return node1 == node2;
        }

        if (node1.data != node2.data)
            return false;

        return (issame(node1.left, node2.left) && issame(node1.right, node2.right));


    }

    public int maxDepth(Node<E> x){
        if(x==null){
            return -1;
        }
        return 1+Math.max(maxDepth(x.left),maxDepth(x.right));

    }

    public Node<E> delete(Node<E> focus, int key){
        if(focus==null){
            return null;
        }
        if(key< focus.key){
            focus.left= delete(focus.left,key);
        }else if (key> focus.key){
            focus.right= delete(focus.right,key);
        }else{
            if(focus.right==null){
                return focus.left;
            }
            if(focus.left==null){
                return focus.right;
            }
            Node<E> t = focus;
            focus= min(t.right);
            focus.right=deleteMin(t.right);
            focus.left=t.left;
        }
        return  focus;
    }

    public Node<E> max(Node<E> x){
        if(root==null){
            throw new NoSuchElementException("BST is empty!");
        }
        if(x.right==null){
            return x;
        }else{
            return max(x.right);
        }
    }

    public Node<E> min(Node<E> x){
        if(root==null){
            throw new NoSuchElementException("BST is empty!");
        }
        if(x.left==null){
            return x;
        }else{
            return min(x.left);
        }
    }

    public Node<E> deleteMin(Node<E> x){
        if(root==null){
            throw new NoSuchElementException("BST is empty!");
        }else{
            if(x.left==null){
                return x.right;
            }
            x.left=deleteMin(x.left);
            return x;
        }
    }

    public void mirror(Node<E> node){
        if(node==null){
            return;
        }
        mirror(node.left);
        mirror(node.right);
        Node<E> temp;
        temp= node.left;
        node.left=node.right;
        node.right=temp;
    }

    public boolean isBTS1(Node<E> focus){ // check whether subtree is bste
        if(focus==null){
            return true;
        }
        if(focus.left!=null&& maxSearch(focus.left).key> focus.key){
            return false;
        }
        if(focus.right!=null&& minSearch(focus.right).key< focus.key){
            return false;
        }
        if(!isBTS1(focus.left)|| !isBTS1(focus.right)){
            return false;
        }
        return true;
    }

    public void pathLengths(Node<E> node, int count) {
        System.out.println("count= " + count);
        if (node.left == null && node.right == null) {
            System.out.println("Leaf reached: " + node + " Path: " + count);
        } else {
            if (node.left != null) {
                pathLengths(node.left, ++count);
                count--;  // Because we are going to one level up.
                //If there is no left, we will not enter left. If we enter, we have to decrease the count as we increase it.
            }
            if (node.right != null) {
                pathLengths(node.right, ++count);
            }
            count--; //We have to decrease count when we turn up, whether there is right or not.
        }
    }


    public BTS<E> clone() {
        BTS<E> cloneBST = new BTS<>();
        cloneBST.root = cloneSubTree(this.root);
        return cloneBST;
    }


    public Node<E> cloneSubTree(Node<E> focus) {

        if (focus == null) {
            return null;
        } else {
            Node<E> t = new Node<>(focus.key, focus.data);//each time we need to create a node.
            t.left = cloneSubTree(focus.left);
            t.right = cloneSubTree(focus.right);
            return t;
        }
    }

    public static void main(String[] args) {
        BTS<Integer> bst = new BTS<>();
        Node<Integer> bir = new Node<>(1,4);
        Node<Integer> iki = new Node<>(2,3);
        Node<Integer> uc = new Node<>(3,1);
        Node<Integer> dort = new Node<>(4,0);
        Node<Integer> bes = new Node<>(5,2);
        Node<Integer> alti = new Node<>(6,15);
        Node<Integer> yedi = new Node<>(7,18);
        Node<Integer> sekiz = new Node<>(8,17);
        Node<Integer> dokuz = new Node<>(9,31);
        bst.addNode(bir.key, bir.data);
        bst.addNode(iki.key, iki.data);
        bst.addNode(uc.key, uc.data);
        bst.addNode(dort.key, dort.data);
        bst.addNode(bes.key, bes.data);
        bst.addNode(alti.key, alti.data);
        bst.addNode(yedi.key, yedi.data);
        bst.addNode(sekiz.key, sekiz.data);
        bst.addNode(dokuz.key, dokuz.data);



        bst.traverseInOrder(bir);

        bst.mymet(bir);




    }
}
