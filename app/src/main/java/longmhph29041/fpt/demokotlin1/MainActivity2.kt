package longmhph29041.fpt.demokotlin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import longmhph29041.fpt.demokotlin1.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}