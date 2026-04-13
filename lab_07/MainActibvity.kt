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

        // 2. Obsługa kliknięcia przycisku )
        buttonklik.setOnClickListener {
            val inputContent = maxnum.text.toString()

            if (inputContent.isNotEmpty()) {
                // 1. Najpierw parsujemy liczbę do zmiennej pomocniczej
                val enteredValue = Integer.parseInt(inputContent)

                // 2. Sprawdzamy, czy liczba jest większa od 0
                if (enteredValue > 0) {
                    randlimit = enteredValue
                } else {
                    // Jeśli wpisano 0 lub ujemną, przywracamy domyślne 6
                    randlimit = 6
                    // Opcjonalnie: wyczyść pole lub ustaw tekst informacyjny
                    maxnum.setText("6")
                    // Możesz też dodać Toast (krótka wiadomość na dole ekranu)
                    android.widget.Toast.makeText(
                        this,
                        "Zakres musi być > 0! Ustawiono 6.",
                        android.widget.Toast.LENGTH_SHORT
                    ).show()
                }
            } else {
                randlimit = 6
            }

            
            numran = Random.nextInt(randlimit) + 1
            buttonklik.text = numran.toString()
        }
    }}
