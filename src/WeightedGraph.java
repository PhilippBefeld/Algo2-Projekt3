// Gerichteter gewichteter Graph.
// (Ein ungerichteter gewichteter Graph kann als gerichteter gewichteter
// Graph repräsentiert werden, bei dem jede Kante in beiden Richtungen
// mit dem gleichen Gewicht vorhanden ist.)
interface WeightedGraph extends Graph {
    // Gewicht der Kante von v zu seinem i-ten direkten Nachfolger.
    // i muss im selben Bereich wie bei der Methode succ liegen.
    // (Dies muss nicht überprüft werden.)
    double weight (int v, int i);

    // Achtung:
    // Wenn man für einen gewichteten Graphen transpose() aufruft,
    // erhält man einen Graphen des Typs Graph ohne Gewichte.
}