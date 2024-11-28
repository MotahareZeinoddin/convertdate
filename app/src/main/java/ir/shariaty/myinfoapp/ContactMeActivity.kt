package ir.shariaty.myinfoapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ContactMeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_me)


        val telegramButton: Button = findViewById(R.id.btn_tell)
        telegramButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            val telegramUrl = "tg://resolve?domain=MotahareZeinoddin"
            intent.data = Uri.parse(telegramUrl)
            startActivity(intent)
        }

        val sendEmailButton = findViewById<Button>(R.id.btn_email)
        sendEmailButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("mailto:motaharezeinoddin@gmail.com")
            startActivity(intent)

        }

        val instaButton = findViewById<Button>(R.id.btn_ins)
        instaButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.instagram.com/motahare_zeinoddin/")
            startActivity(intent)
        }

        val callButton = findViewById<Button>(R.id.btn_call)
        callButton.setOnClickListener {
            val phone = "09123456789"
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:$phone")
            startActivity(intent)
        }
    }
}

