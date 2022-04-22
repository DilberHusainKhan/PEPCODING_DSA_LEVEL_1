import java.util.ArrayList;
import java.util.LinkedList;

public class AA_DisplayGenericTree {
    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();

        Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node node) {
        String str = node.data + " --> ";
        for (Node cnode : node.children) {
            str += cnode.data + " , ";
        }
        str += ".";
        System.out.println(str);
        for (Node child : node.children) {
            display(child);
        }
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
        display(root);
    }
}
