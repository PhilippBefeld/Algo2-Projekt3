public class WeightedGraphImpl implements WeightedGraph {
    int[][] kanten;
    double[][] gewichte;


    public WeightedGraphImpl(int[][] ints, double[][] doubles) {
        kanten=ints;
        gewichte=doubles;
    }

    @Override
    public double weight(int v, int i) {
        return 0;
    }

    @Override
    public int size() {
        return kanten.length;
    }

    @Override
    public int deg(int v) {
        if(v >= 0 && v < size())return kanten[v].length;
        else return 0;
    }

    @Override
    public int succ(int v, int i) {
        if(v >= 0 && v < size())return kanten[v][i];
        return 0;
    }

    @Override
    public Graph transpose() {
        int[][] tGraph = new int[kanten.length][];
        double[][] tWeighs = new double[kanten.length][];
        for(int i = 0; i < kanten.length; i++){
            for(int j = 0; j < kanten[i].length; j++){
                int k = kanten[i][j];
                int[] temp;
                double[] temp2;
                if(tGraph[k] == null){
                    temp = new int[1];
                    temp2 = new double[1];
                }
                else {
                    temp = new int[tGraph[k].length+1];
                    temp2 = new double[tGraph[k].length+1];
                }
                for(int l = 0; l < temp.length -1; l++){
                    temp[l] = tGraph[k][l];
                    temp2[l] = tWeighs[k][l];
                }
                temp[temp.length -1] = i;
                temp2[temp2.length-1] = i;
                tGraph[k] = temp;
                tWeighs[k] = temp2;
            }
        }
        Graph returnGraph = new GraphImpl(tGraph);
        return returnGraph;
    }
}