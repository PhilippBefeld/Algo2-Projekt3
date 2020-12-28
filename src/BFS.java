interface BFS {
    // Breitensuche im Graphen g mit Startknoten s durchführen.
    void search (Graph g, int s);

    // Vom Algorithmus ermittelte Information:

    // Abstand des Knotens v zum Startknoten s der Suche
    // (bzw. INF, wenn v von s aus nicht erreichbar ist).
    int INF = -1;
    int dist (int v);

    // Vorgängerknoten von v auf dem Weg von s nach v
    // (bzw. NIL, wenn es keinen Vorgänger gibt).
    int NIL = -1;
    int pred (int v);
}