package ir.shariaty.myinfoapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import android.widget.Button
import ir.shariaty.myinfoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val aboutme = findViewById<Button>(R.id.btn_aboutme)
        aboutme.setOnClickListener {
                    val intent = Intent(this, ConvertCalenderActivity::class.java)
                    startActivity(intent)
                }


        val contactme = findViewById<Button>(R.id.btn_contactme)
        contactme.setOnClickListener {
                    val intent = Intent(this, ContactMeActivity::class.java)
                    startActivity(intent)
                }
            }
        }

