interface MSF {
    // Minimalgerüst des Graphen g mit dem (modifizierten) Algorithmus
    // von Prim mit vorgegebenem Startknoten s berechnen.
    // Der Graph muss ungerichtet sein, d. h. jede Kante muss
    // in beiden Richtungen mit dem gleichen Gewicht vorhanden sein.
    // (Dies muss nicht überprüft werden.)
    void compute (WeightedGraph g, int s);

    // Vom Algorithmus ermittelte Information:

    // Vorgängerknoten des Knotens v im Gerüst
    // (bzw. NIL, wenn es keinen Vorgänger gibt).
    int NIL = -1;
    int pred (int v);
}