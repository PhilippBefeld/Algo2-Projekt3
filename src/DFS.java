interface DFS {
    // Tiefensuche im Graphen g durchführen.
    // In der Hauptschleife des Algorithmus werden die Knoten in der
    // Reihenfolge 0 bis g.size() - 1 durchlaufen.
    void search (Graph g);

    // Tiefensuche im Graphen g durchführen.
    // In der Hauptschleife des Algorithmus werden die Knoten in der
    // Reihenfolge d.sequ(g.size() - 1) bis d.sequ(0) durchlaufen.
    void search (Graph g, DFS d);

    // Topologische Sortierung des Graphen g durchführen.
    // Resultatwert true, wenn dies möglich ist,
    // false, wenn der Graph einen Zyklus enthält.
    boolean sort (Graph g);

    // Von den Algorithmen ermittelte Information:

    // Entdeckungs- bzw. Abschlusszeit des Knotens v,
    // jeweils zwischen 1 und 2 * g.size().
    int det (int v);
    int fin (int v);

    // Für i von 0 bis g.size() - 1 liefert sequ(i) die Knoten
    // des Graphen g sortiert nach aufsteigenden Abschlusszeiten.
    // Das heißt: sequ(0) ist der Knoten mit der kleinsten
    // Abschlusszeit, sequ(g.size() - 1) der mit der größten.
    int sequ (int i);
}