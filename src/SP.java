interface SP {
    // Algorithmus von Bellman-Ford auf dem Graphen g mit Startknoten s
    // ausführen.
    // Resultatwert true genau dann, wenn es im Graphen keinen vom
    // Startknoten aus erreichbaren Zyklus mit negativem Gewicht gibt.
    boolean bellmanFord (WeightedGraph g, int s);

    // Algorithmus von Dijkstra auf dem Graphen g mit Startknoten s
    // ausführen.
    // Die Kanten des Graphen dürfen keine negativen Gewichte besitzen.
    // (Dies muss nicht überprüft werden.)
    void dijkstra (WeightedGraph g, int s);

    // Von den Algorithmen ermittelte Information:

    // Abstand des Knotens v zum Startknoten s (ggf. INF).
    double INF = Double.POSITIVE_INFINITY;
    double dist (int v);

    // Vorgängerknoten des Knotens v auf dem kürzesten Weg zum
    // Startknoten (bzw. NIL, wenn es keinen Vorgänger gibt).
    int NIL = -1;
    int pred (int v);
}