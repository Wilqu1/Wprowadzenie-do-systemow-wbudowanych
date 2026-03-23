Lab XX – Teoretyczne podstawy i algorytmy generowania zdarzeń (ruchu).


Co zostało zrealizowane
W ramach zadania zaimplementowano własny generator liczb losowych oparty na liniowym generatorze kongruencyjnym (LCG), który generuje wartości z rozkładu jednostajnego U(0,1).

Na jego podstawie zaimplementowano:

generator rozkładu Poissona z wykorzystaniem algorytmu opartego na iloczynie zmiennych losowych,
generator rozkładu normalnego przy użyciu metody Boxa-Mullera.

Dodatkowo wygenerowano próbki dla obu rozkładów i przedstawiono je w postaci histogramów przy użyciu biblioteki matplotlib.

Uruchomienie
Aby uruchomić kod, należy:

Zainstalować bibliotekę matplotlib (jeśli nie jest dostępna), poleceniem:
pip install matplotlib
Uruchomić skrypt w Pythonie, np.:
python nazwa_pliku.py
Po uruchomieniu wyświetli się okno z histogramami dla obu rozkładów.

Trudności / refleksja (opcjonalnie)
Największą trudnością było poprawne zaimplementowanie generatorów rozkładów na podstawie wzorów teoretycznych. Szczególnie wymagające było:

zrozumienie działania algorytmu dla rozkładu Poissona (warunek zakończenia pętli),
poprawne zastosowanie transformacji Boxa-Mullera.

Dodatkowo ważne było zapewnienie poprawności działania generatora liczb losowych, ponieważ ma on bezpośredni wpływ na jakość uzyskanych wyników.
