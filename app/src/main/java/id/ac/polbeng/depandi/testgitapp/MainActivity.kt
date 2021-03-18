package id.ac.polbeng.depandi.testgitapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.ac.polbeng.depandi.testgitapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        activityMainBinding.btnShowMessage.setOnClickListener {
            val name = activityMainBinding.etName.text.trim().toString()
            activityMainBinding.tvName.text = name
            activityMainBinding.tvWelcomeMessage.text = getString(R.string.welcome_msg, name)
        }
    }
}