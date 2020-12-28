public class GraphImpl implements  Graph{
    int[][] matrix;

    public GraphImpl(int[][] ints) {
        this.matrix = ints;
    }

    @Override
    public int size() {
        return matrix.length;
    }

    @Override
    public int deg(int v) {
        if(v >= 0 && v < size())return matrix[v].length;
        else return 0;
    }

    @Override
    public int succ(int v, int i) {
        if(v >= 0 && v < size())return matrix[v][i];
        return 0;
    }

    @Override
    public Graph transpose() {
        int[][] tGraph = new int[matrix.length][];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[i].length - i -1];
                matrix[i][matrix[i].length - i -1] = temp;
            }
        }
        Graph returnGraph = new GraphImpl(tGraph);
        return returnGraph;
    }

}
