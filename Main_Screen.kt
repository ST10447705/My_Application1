package za.ac.iie.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Main_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_screen)
        ViewCompat.setOnApplyWindowInsetsListener(/* view = */ findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

            var tempratureArray = arrayOf(20, 22, 25, 28, 30, 32, 35)
            var weatherArray =
                arrayListOf("Sunny", "Cloudy", "Rainy", "Sunny", "Cloudy", "Rainy", "Sunny")

            val averageTempratureTextView = findViewById<textView4>(R.id.averageTemperatureTextView)

            val detailedViewButton = findViewById<button3>(R.id.detailedViewButton)

            val exitButton = findViewById<button4>(R.id.exitButton)

            val clearButton = findViewById<button5>(R.id.clearButton)
        }

        button4.setonClickListener {
            finish()
        }

        button5.setOnClickListner {
            // clear data
            weatherArray = emptyArray()
            averageTemperatureTextView.text = "Average Temp:°0c"
        }

        calculateAverageTemperature(temperatureArray, averagetemperatureTextView)
    }

    private fun calculateAverageTemprature(
        temperatureArray: Array<Double>,
        averageTemperatureTextView: TextView
    ) {
        var sum = 0
        for (temperature in temperatureArray) {
            sum + -temperature
        }
        val averageTemperature = sum / temperatureArray.size
        averageTemperatureTextView.text = "Average Temperature: $averageTemperature °c"
    }
}




            }
        }
    }
}