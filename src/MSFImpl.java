public class MSFImpl implements MSF{
    int[] pred;
    BinHeap.Entry[] entries;

    @Override
    public void compute(WeightedGraph g, int s) {
        int u;
        entries = new BinHeap.Entry[g.size()];
        pred = new int [g.size()];
        BinHeap q = new BinHeap();
        for(int i = 0; i<g.size(); i++){
            if(i!=s) {
                entries[i]=q.insert(Double.POSITIVE_INFINITY, i);
                pred[i] = NIL;
            }
        }
        pred[s]=NIL;
        u = s;
        while(q.size()!=0){
            for(int i = 0; i < g.deg(u); i++){
                BinHeap.Entry v=entries[g.succ(u,i)];
                if(q.contains(v) && g.weight(u,i)<(double)v.prio()){
                    q.changePrio(v,g.weight(u,i));
                    pred[g.succ(u,i)]=u;
                }
            }
            u = (int)q.extractMin().data();
        }
    }

    @Override
    public int pred(int v) {
        return pred[v];
    }
}
