package com.example.lab07

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random // Import biblioteki do losowania

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Pobranie uchwytów do elementów interfejsu
        val buttonklik = findViewById<Button>(R.id.klik)
        val maxnum = findViewById<EditText>(R.id.maxnum)

        var numran = 0
        var randlimit = 6 // Domyślny zakres (kostka)

        // 2. Obsługa kliknięcia przycisku 
        buttonklik.setOnClickListener {

            // Pobranie wartości z pola edycyjnego
            val inputContent = maxnum.text.toString()

            if (inputContent.isNotEmpty()) {
                // Konwersja tekstu na liczbę całkowitą
                randlimit = Integer.parseInt(inputContent)
            } else {
                randlimit = 6 // Jeśli pole jest puste, losujemy jak kostką
            }

            // Losowanie liczby z podanego zakresu
            // Random.nextInt(limit) losuje od 0 do limit-1, więc dodajemy +1
            numran = Random.nextInt(randlimit) + 1

            // Wyświetlenie wyniku na przycisku
            buttonklik.text = numran.toString()
        }
    }
}
