import java.util.Arrays;

public class DFSImpl implements DFS{
    int[] det;
    int[] fin;
    int[] pred;
    char[] status;
    int[] finFolge;
    int zeit=0;
    int finZeit=0;

    @Override
    public void search(Graph g) {
        det= new int[g.size()];
        fin= new int[g.size()];
        pred= new int[g.size()];
        status= new char[g.size()];
        finFolge= new int[g.size()];
        zeit=0;
        finZeit=0;
        for(int i =0; i<=g.size()-1; i++){
            status[i]='w';
        }
        for(int u =0; u<g.size(); u++){
            if(status[u]=='w'){
                pred[u]=-1;
                durchsuche(u,g);
            }
        }
    }
    public void durchsuche(int u, Graph g){
        status[u]='g';
        det[u]=++zeit;
        for(int v = 0; v <g.deg(u); v++){
            if(status[g.succ(u,v)]=='w'){
                pred[g.succ(u,v)]=u;
                durchsuche(g.succ(u,v),g);
            }
        }
        status[u]='b';
        fin[u]=++zeit;
        finFolge[finZeit++]=u;
    }

    @Override
    public void search(Graph g, DFS d) {
        det= new int[g.size()];
        fin= new int[g.size()];
        pred= new int[g.size()];
        status= new char[g.size()];
        finFolge= new int[g.size()];
        zeit=0;
        finZeit=0;
        for(int i =0; i<=g.size()-1; i++){
            status[i]='w';
        }
        for(int u =g.size()-1; u>=0; u--){
            int l= d.sequ(u);
            if(status[l]=='w'){
                pred[l]=-1;
                durchsuche(l,g);
            }
        }
    }

    @Override
    public boolean sort(Graph g) {
        zeit=0;
        finZeit=0;
        for(int i =0; i<=g.size()-1; i++){
            status[i]='w';
        }
        for(int u =0; u<g.size(); u++){
            if(status[u]=='w'){
                pred[u]=-1;
                if(!durchsuche2(u,g)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean durchsuche2(int u, Graph g){
        status[u]='g';
        det[u]=++zeit;
        for(int v = 0; v <g.deg(u); v++){
            if(status[g.succ(u,v)]=='w'){
                pred[g.succ(u,v)]=u;
                durchsuche2(g.succ(u,v),g);
            }
            else {
                return false;
            }
        }
        status[u]='b';
        fin[u]=++zeit;
        finFolge[finZeit++]=u;
        return true;
    }

    @Override
    public int det(int v) {
        return det[v];
    }

    @Override
    public int fin(int v) {
        return fin[v];
    }

    @Override
    public int sequ(int i) {
        return finFolge[i];
    }

}
