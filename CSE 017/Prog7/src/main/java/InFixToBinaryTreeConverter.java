import java.util.*;

public class InFixToBinaryTreeConverter {
    private List<String> inFix;
    private List<String> stack;
    private List<Node> btstack;
    private String expression;
    List<String> store = new LinkedList<>();
    Node root;

    public InFixToBinaryTreeConverter() {
        inFix = new LinkedList<String>();
        stack = new ArrayList<String>();
        btstack = new ArrayList<Node>();
    }

    public void run(String expression) {
        this.expression = expression;
        String[] symbols = expression.split("\\s+");
        for (int i = 0; i < symbols.length; i++) {
            createInFix(symbols[i]);
        }
        System.out.println(expression);
        createBinaryTree();
        printInorder(root);
        System.out.println();
        printPreorder(root);
        System.out.println();
        printPostorder(root);
        System.out.println();
        evaluatePostFix();

    }

    public void createInFix(String expression) {
        inFix.add(expression);
    }

    public void createBinaryTree() {
        stack.add("(");
        inFix.add(")");
        String currSymbol;
        Node pushNode;
        while (!inFix.isEmpty()) {
            currSymbol = inFix.remove(0);
            switch (currSymbol) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                pushNode = new Node();
                pushNode.createNode(currSymbol, null, null);
                btstack.add(pushNode);
                break;
            case "(":
                stack.add(currSymbol);
                break;
            case "*":
            case "/":
            case "+":
            case "-":
                String popVal = stack.get(stack.size() - 1);
                Node Lnode, Rnode, operator;
                if (popVal.equals("*") || popVal.equals("/")) {
                    if (precedenceLevel(popVal) >= precedenceLevel(currSymbol)) {
                        stack.remove(stack.size() - 1);
                        Rnode = btstack.remove(btstack.size() - 1);
                        Lnode = btstack.remove(btstack.size() - 1);
                        operator = new Node();
                        operator.createNode(popVal, Lnode, Rnode);
                        btstack.add(operator);
                    }
                } else if (popVal.equals("+") || popVal.equals("-")) {
                    if (precedenceLevel(popVal) >= precedenceLevel(currSymbol)) {
                        stack.remove(stack.size() - 1);
                        Rnode = btstack.remove(btstack.size() - 1);
                        Lnode = btstack.remove(btstack.size() - 1);
                        operator = new Node();
                        operator.createNode(popVal, Lnode, Rnode);
                        btstack.add(operator);
                    }
                }
                stack.add(currSymbol);
                break;
            case ")":
                String popVal2;
                Node Rnode2, Lnode2, operator2;
                while (stack.get(stack.size() - 1).equals("*") || stack.get(stack.size() - 1).equals("/")
                        || stack.get(stack.size() - 1).equals("+") || stack.get(stack.size() - 1).equals("-")) {
                    popVal2 = stack.remove(stack.size() - 1);
                    Rnode2 = btstack.remove(btstack.size() - 1);
                    Lnode2 = btstack.remove(btstack.size() - 1);
                    operator2 = new Node();
                    operator2.createNode(popVal2, Lnode2, Rnode2);
                    btstack.add(operator2);
                }
                stack.remove(stack.size() - 1);
                break;
            default: // counts for any 2+ digits numbers
                pushNode = new Node();
                pushNode.createNode(currSymbol, null, null);
                btstack.add(pushNode);
                break;
            }
        }
        root = btstack.remove(btstack.size() - 1);
    }

    public int precedenceLevel(String op) {
        switch (op) {
        case "+":
        case "-":
            return 1;
        case "*":
        case "/":
            return 2;
        default:
            return 3;
        }
    }

    public void printInorder(Node node) {
        if (node == null)
            return;

        printInorder(node.left);
        System.out.print(node.getVal() + " ");
        printInorder(node.right);
    }

    public void printPreorder(Node node) {
        if (node == null)
            return;

        System.out.print(node.getVal() + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    public void printPostorder(Node node) {
        if (node == null)
            return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.getVal() + " ");
        store.add(node.getVal());
    }

    public void evaluatePostFix() {
        List<String> result = new ArrayList<>();
        String val;
        while (!store.isEmpty()) {
            val = store.remove(0);
            switch (val) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                result.add(val);
                break;
            case "+":
                int sumval1 = Integer.parseInt(result.remove(result.size() - 1));
                int sumval2 = Integer.parseInt(result.remove(result.size() - 1));
                int sum = sumval2 + sumval1;
                result.add(String.valueOf(sum));
                break;
            case "-":
                int subval1 = Integer.parseInt(result.remove(result.size() - 1));
                int subval2 = Integer.parseInt(result.remove(result.size() - 1));
                int sub = subval2 - subval1;
                result.add(String.valueOf(sub));
                break;
            case "*":
                int mulval1 = Integer.parseInt(result.remove(result.size() - 1));
                int mulval2 = Integer.parseInt(result.remove(result.size() - 1));
                int mul = mulval2 * mulval1;
                result.add(String.valueOf(mul));
                break;
            case "/":
                int dival1 = Integer.parseInt(result.remove(result.size() - 1));
                int dival2 = Integer.parseInt(result.remove(result.size() - 1));
                int di = dival2 / dival1;
                result.add(String.valueOf(di));
                break;
            default:
                result.add(val);
                break;
            }
        }
        System.out.println(Integer.parseInt(result.get(result.size() - 1)));
    }
}