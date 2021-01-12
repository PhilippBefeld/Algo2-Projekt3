public class SCCImpl implements SCC{
    int[] SZK;

    @Override
    public void compute(Graph g) {
        SZK = new int[g.size()];
        Graph gt = g.transpose();
        DFS ts1 = new DFSImpl();
        ts1.search(g);
        DFS ts2 = new DFSImpl();
        ts2.search(gt , ts1);
        int j=0;
        int verg=0;
        for (int i = 0; i < g.size(); i++) {
            if(!(verg > ts2.det(ts2.sequ(i)))){
                verg=ts2.fin(ts2.sequ(i));
                j++;
            }
            SZK[ts2.sequ(i)]=j;
        }
//            for (int i = 0; i < g.size(); i++) {
//                int v = ts2.sequ(i);
//                System.out.println(v+ " det "+ts2.det(v)+ " fin "+ ts2.fin(v));
//            }
    }

    @Override
    public int component(int v) {
        return SZK[v];
    }
}
