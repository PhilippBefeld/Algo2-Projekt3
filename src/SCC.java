interface SCC {
    // Starke Zusammenhangskomponenten des Graphen g bestimmen.
    void compute (Graph g);

    // Vom Algorithmus ermittelte Information:

    // Eindeutige Nummer der starken Zusammenhangskomponente,
    // zu der der Knoten v gehört.
    // Das heißt: component(u) muss genau dann gleich component(v) sein,
    // wenn u und v zur gleichen starken Zusammenhangskomponente gehören.
    // Abgesehen davon, können die Nummern beliebig sein.
    int component (int v);
}