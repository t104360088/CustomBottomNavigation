package com.example.custombottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.custombottomnavigation.databinding.ActivityMainBinding
import com.example.custombottomnavigation.googlestylebar.GoogleStyleBarFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityMainBinding.inflate(LayoutInflater.from(this), null, false).let { binding ->
            this.binding = binding
            setContentView(binding.root)
        }

        val initFragment = GoogleStyleBarFragment()
        supportFragmentManager.beginTransaction().replace(R.id.container, initFragment).commit()
    }
}