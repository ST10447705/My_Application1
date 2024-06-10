package za.ac.iie.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity<imgaeView> : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val button7 = findViewById<button7>(R.id.button7)
        val exitButton = findViewById<button2>(R.id.button2)

        startButton.setOnClickListner {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        exitButton.setOnClickListner {
            finish()
        }
    }
}