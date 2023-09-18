import java.util.ArrayList;

public class Tree<T> implements MultiSet<T>{
    private Tree<T> root;
    private ArrayList<Object> subtrees;

    public Tree(){
        this.root = null;
        this.subtrees = new ArrayList<>();
    }

    @Override
    public boolean add(T item) {
        return false;
    }

    @Override
    public void remove(T item) {

    }

    @Override
    public boolean contains(T item) {
        return false;
    }

    @Override
    public boolean is_empty() {
        return this.root == null;
    }

    @Override
    public int count(T item) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }
}
