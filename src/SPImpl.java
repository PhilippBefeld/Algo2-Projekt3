public class SPImpl implements SP {
    int[] pred;
    double[] dist;
    BinHeap.Entry[] entries;

    @Override
    public boolean bellmanFord(WeightedGraph g, int s) {
        pred = new int [g.size()];
        dist = new double [g.size()];
        for(int i = 0; i < g.size(); i++){
            pred[i] = NIL;
            dist[i] = INF;
        }
        dist[s] = 0;
        for(int n = 1; n < g.size(); n++) {
            for (int u = 0; u < g.size(); u++) {
                for (int v = 0; v < g.deg(u); v++) {
                    if (dist[u] + g.weight(u, v) < dist[g.succ(u, v)]) {
                        dist[g.succ(u, v)] = dist[u] + g.weight(u, v);
                        pred[g.succ(u, v)] = u;
                    }
                }
            }
        }
        for(int u = 0; u < g.size(); u++){
            for( int v = 0; v < g.deg(u); v++){
                if(dist[u]+g.weight(u,v)<dist[g.succ(u,v)]){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void dijkstra(WeightedGraph g, int s) {
        pred = new int [g.size()];
        dist = new double [g.size()];
        entries = new BinHeap.Entry[g.size()];
        BinHeap heap = new BinHeap();
        for(int i = 0; i < g.size(); i++){
            pred[i] = NIL;
            dist[i] = INF;
        }
        dist[s] = 0;
        for(int i = 0; i < g.size(); i++){
            entries[i] = heap.insert(dist[i],i);
        }
        while(heap.size()!=0){
            int u = (int)heap.extractMin().data();
            for(int v = 0; v < g.deg(u); v++){
                if(heap.contains(entries[g.succ(u,v)])){
                    if(dist[u]+g.weight(u,v)<dist[g.succ(u,v)]){
                        dist[g.succ(u,v)] = dist[u] + g.weight(u,v);
                        pred[g.succ(u,v)] = u;
                        heap.changePrio(entries[g.succ(u,v)],dist[g.succ(u,v)]);
                    }
                }
            }
        }

    }

    @Override
    public double dist(int v) {
        return dist[v];
    }

    @Override
    public int pred(int v) {
        return pred[v];
    }
}