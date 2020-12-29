public class BFSImpl implements BFS{
    int[] dist;
    int[] pred;

    @Override
    public void search(Graph g, int s) {
        dist= new int[g.size()];
        pred= new int[g.size()];
        BinHeap heap = new BinHeap();
        int count = 0;
        int u; //u wie in der Vorlesungsfolie
        for(int i =0; i<g.size(); i++){
            if(i!=s){
                dist[i]=INF;
                pred[i]=NIL;
            }
        }
        dist[s]=0;
        pred[s]=NIL;
        heap.insert(count++,s);
        while (heap.size()!=0){
            u = (int)heap.extractMin().data();
            for(int v =0; v < g.deg(u); v++){
                if(dist[g.succ(u,v)]==INF){
                    dist[g.succ(u,v)]=dist[u]+1;
                    pred[g.succ(u,v)]=u;
                    heap.insert(count++,g.succ(u,v));
                }
            }
        }
    }

    @Override
    public int dist(int v) {
        return dist[v];
    }

    @Override
    public int pred(int v) {
        return pred[v];
    }
}