public interface Graph {
    // Größe des Graphen, d. h. Anzahl seiner Knoten.
    // Die Knoten werden direkt durch Nummern zwischen 0 einschließlich
    // und size() ausschließlich repräsentiert, das heißt:
    // Alle Parameter von Methoden dieser und anderer Schnittstellen,
    // die Knoten bezeichnen (z. B. v), müssen Werte in diesem Bereich
    // besitzen. (Dies muss nicht überprüft werden.)
    // Methoden, die Knoten als Resultat liefern (z. B. succ), müssen
    // Werte in diesem Bereich liefern.
    int size ();

    // Grad des Knotens v, d. h. Anzahl seiner ausgehenden Kanten
    // bzw. direkten Nachfolger.
    int deg (int v);

    // i-ter direkter Nachfolger des Knotens v.
    // i muss zwischen 0 einschließlich und deg(v) ausschließlich
    // liegen. (Dies muss nicht überprüft werden.)
    int succ (int v, int i);

    // Transponierter Graph, d. h. ein neuer Graph mit denselben Knoten
    // wie der aktuelle Graph, der für jede Kante (u, v) des aktuellen
    // Graphen die entgegengesetzte Kante (v, u) enthält.
    Graph transpose ();
}