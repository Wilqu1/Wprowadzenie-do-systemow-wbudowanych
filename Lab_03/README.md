Lab XX –Modelowanie systemu (M/M/S/S)

Co zostało zrealizowane
W ramach zadania zaimplementowano aplikację symulującą działanie stacji bazowej w systemie mobilnym z wykorzystaniem biblioteki Tkinter (GUI).

Zrealizowano dwa główne elementy:

model teoretyczny:
obliczanie prawdopodobieństwa blokady dla systemu M/M/S/S (wzór Erlanga B),
rozszerzenie o mechanizm rezerwacji kanałów (Guard Channels),
symulator dynamiczny:
generowanie zgłoszeń zgodnie z procesem Poissona (odstępy wykładnicze),
generowanie czasu obsługi z rozkładu normalnego (Gauss) z ograniczeniami min/max,
obsługa systemu z ograniczoną liczbą kanałów i kolejką,
wizualizacja zajętości kanałów (kolory: zielony – wolny, czerwony – zajęty),
rejestracja zdarzeń w tabeli,
wykresy w czasie rzeczywistym:
długość kolejki (Q),
czas oczekiwania (W),
obciążenie systemu (Ro).

Dodatkowo dane z symulacji są zapisywane do pliku tekstowego.

Uruchomienie
Aby uruchomić program, należy:

Zainstalować wymagane biblioteki:
pip install numpy pandas matplotlib
Uruchomić skrypt:
python nazwa_pliku.py
Po uruchomieniu:
pojawi się okno aplikacji,
ustawić parametry symulacji (np. liczba kanałów, lambda, czas symulacji),
kliknąć przycisk START.
Po zakończeniu symulacji:
wyniki zostaną zapisane do pliku:
wyniki_symulacji.txt

Trudności / refleksja (opcjonalnie)
Największym wyzwaniem było:

połączenie modelu teoretycznego z symulacją zdarzeń w czasie,
poprawne zarządzanie stanem kanałów i kolejki w każdej iteracji,
synchronizacja GUI (Tkinter) z aktualizacją wykresów Matplotlib,
zapewnienie płynnego działania symulacji w czasie rzeczywistym.

Dodatkowo istotne było:

poprawne generowanie rozkładów losowych (Poisson i Gauss),
zastosowanie prawa Little’a do oszacowania czasu oczekiwania,
kontrola przypadków brzegowych (pełna kolejka, brak wolnych kanałów).
