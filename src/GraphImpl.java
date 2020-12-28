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
        else return -1;
    }

    @Override
    public int succ(int v, int i) {
        if(v >= 0 && v < size())return matrix[v][i];
        return -1;
    }

    @Override
    public Graph transpose() {
        int[][] tGraph = new int[matrix.length][];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                int k = matrix[i][j];
                int[] temp;
                if(tGraph[k] == null){
                    temp = new int[1];
                }
                else {
                    temp = new int[tGraph[k].length+1];
                }
                for(int l = 0; l < temp.length -1; l++){
                    temp[l] = tGraph[k][l];
                }
                temp[temp.length -1] = i;
                tGraph[k] = temp;
            }
        }
        Graph returnGraph = new GraphImpl(tGraph);
        return returnGraph;
    }

}
