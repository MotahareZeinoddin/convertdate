package ir.shariaty.myinfoapp

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import ir.misterdeveloper.datetoshamsi.PersianDate
import ir.shariaty.myinfoapp.databinding.ActivityConvertCalenderBinding
import java.util.Calendar


class ConvertCalenderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityConvertCalenderBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH)
        val textView2 = findViewById<TextView>(R.id.tv2)
        val textView = findViewById<TextView>(R.id.tv1)
        val datePickerDialog = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
        val mount=month+1
            val date = "$year/$mount/$dayOfMonth"
            val  date1 = PersianDate(date)
            textView.text="\n"+"\tتاریخ میلادی :\t"+"\t"+date
            binding.btnGettime.setOnClickListener {
            textView2.text = "\n"+"تاریخ شمسی :\t"+"\t"+date1.getPersianDate()}
        }, year, month, dayOfMonth)
        datePickerDialog.show()

        val btndate = findViewById<Button>(R.id.btn_date)
        btndate.setOnClickListener { datePickerDialog.show() }




    }
}
