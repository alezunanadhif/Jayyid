package com.nadhif.doadzikirapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nadhif.doadzikirapp.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
	private lateinit var binding: ActivityProfileBinding
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityProfileBinding.inflate(layoutInflater)
		setContentView(binding.root)

		supportActionBar?.setDisplayHomeAsUpEnabled(true)
		supportActionBar?.title = "Profile"
	}

	override fun onSupportNavigateUp(): Boolean {
		onBackPressedDispatcher.onBackPressed()
		return super.onSupportNavigateUp()
	}
}