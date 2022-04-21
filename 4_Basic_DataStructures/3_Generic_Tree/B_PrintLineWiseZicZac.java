import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class B_PrintLineWiseZicZac {

    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();

        Node(int data) {
            this.data = data;
        }
    }

    public static void levelOrderDisplayLinewiseZicZac(Node root) {
        LinkedList<Node> que = new LinkedList<>();
        LinkedList<Node> st = new LinkedList<>();
        int level = 0;
        que.addLast(root);
        while (que.size() != 0) {
            int currSize = que.size();
            while (currSize-- > 0) {
                Node rnode = que.removeFirst();
                System.out.print(rnode.data + " ");
                if (level % 2 == 0) {
                    for (int i = 0; i < rnode.children.size(); i++) {
                        st.addFirst(rnode.children.get(i));
                    }
                } else {
                    for (int i = rnode.children.size() - 1; i >= 0; i--) {
                        st.addFirst(rnode.children.get(i));
                    }
                }
            }
            System.out.println();
            level++;
            LinkedList<Node> temp = que;
            que = st;
            st = temp;
        }

        // Queue<Node> queue = new ArrayDeque<>();
        // Queue<Node> cqueue = new ArrayDeque<>();
        // queue.add(root);
        // int level = 0;
        // while (queue.size() > 0) {
        // Node temp = queue.remove();
        // System.out.print(temp.data + " ");
        // level++;
        // if (level % 2 != 0) {
        // for (int i = temp.children.size() - 1; i >= 0; i--) {
        // Node child = temp.children.remove(i);
        // cqueue.add(child);
        // }
        // } else {
        // for (Node child : temp.children) {
        // cqueue.add(child);
        // }
        // }
        // if (queue.size() == 0) {
        // queue = cqueue;
        // cqueue = new ArrayDeque<>();
        // System.out.println(" .");
        // }
        // }
    }

    public static void main(String[] args) {
        Node root = new Node(10);

        Node twenty = new Node(20);
        root.children.add(twenty);
        Node thirty = new Node(30);
        root.children.add(thirty);
        Node forty = new Node(40);
        root.children.add(forty);

        Node fifty = new Node(50);
        twenty.children.add(fifty);
        Node sixty = new Node(60);
        twenty.children.add(sixty);

        Node seventy = new Node(70);
        thirty.children.add(seventy);
        Node eighty = new Node(80);
        thirty.children.add(eighty);
        Node ninty = new Node(90);
        thirty.children.add(ninty);

        Node hundred = new Node(100);
        forty.children.add(hundred);

        Node onehundredten = new Node(110);
        eighty.children.add(onehundredten);

        Node onehundredtwenty = new Node(120);
        eighty.children.add(onehundredtwenty);

        levelOrderDisplayLinewiseZicZac(root);
    }
}
