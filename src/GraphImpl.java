public class GraphImpl implements  Graph{
    int size[][];
    int k[];


    public GraphImpl(int[][] ints) {
        this.size = ints;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int deg(int v) {
        return v;
    }

    @Override
    public int succ(int v, int i) {
        return v;
    }

    @Override
    public Graph transpose() {
        return null;
    }
}
