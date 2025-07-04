package trees;
import java.util.*;
public class implementation{

    public static class node{
        int data;
        node left ;
        node right;
        node(int data){
            this.data = data;
        }
    }

    public static void display(node root){
        if(root==null) return;
        System.out.print(root.data+"-->");
        display(root.left);
        display(root.right);

    }
    public static int size(node root){
        if(root ==null ) return 0;
        int right = size(root.right);
        int left= size(root.left);
        return right + left+1;
    }
    public static int sum(node root){
        if(root == null) return 0;
        return  root.data + sum(root.left)+sum(root.right);
    }

    public static int height(node root){
        if(root==null)return 0;
        if(root.left == null && root.right == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        return 1 + Math.max(left, right);
    }
    public static int max(node root){
        if(root==null) return Integer.MIN_VALUE;
        int max_left = max(root.left);
        int max_right = max(root.right);
        return Math.max(root.data,Math.max(max_left,max_right));
    }
    public static int min(node root){
        if(root==null) return Integer.MAX_VALUE;
        int max_left = min(root.left);
        int max_right = min(root.right);
        return Math.min(root.data,Math.min(max_left,max_right));
    }
    public static void levelt(node root,int n){
        if(root == null) return ;
        if(n==1){
            System.out.print(root.data +"-->");
        }
        levelt( root.left,n-1);
        levelt(root.right,n-1);

  }
    public static void bfs(node root){
        if(root==null) return;
        Queue<node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            node r = q.peek();

            System.out.println(r.data);
            if(r.left!=null){
                q.add(r.left);
            }
            if(r.right!=null){
                q.add(r.right);
            }
            q.remove();


        }
    }






    public static int pro(node root){
        if(root ==null) return 1;
        return root.data*pro(root.left)*pro(root.right);
    }

    public static void main(String[] args){
        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(4);
        node e = new node(5);
        node f = new node(6);
        node g = new node(7);
        node h = new node(8);
        a.left = b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        c.right =g;
        d.left=h;

      bfs(a);

    }
}