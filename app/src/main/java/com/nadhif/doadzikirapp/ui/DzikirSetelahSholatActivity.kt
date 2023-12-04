package com.nadhif.doadzikirapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.nadhif.doadzikirapp.R
import com.nadhif.doadzikirapp.adapter.DzikirDoaAdapter
import com.nadhif.doadzikirapp.databinding.ActivityDzikirSetelahSholatBinding
import com.nadhif.doadzikirapp.databinding.ActivityDzikirSetiapSaatBinding
import com.nadhif.doadzikirapp.model.DataDzikirDoaModel

class DzikirSetelahSholatActivity : AppCompatActivity() {
	private lateinit var binding: ActivityDzikirSetelahSholatBinding

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityDzikirSetelahSholatBinding.inflate(layoutInflater)
		setContentView(binding.root)

		supportActionBar?.setDisplayHomeAsUpEnabled(true)
		supportActionBar?.title = "Dzikir & Doa Setelah Sholat"

		binding.apply {
			rvDzikirSetelahSholat.layoutManager = LinearLayoutManager(this@DzikirSetelahSholatActivity)
			rvDzikirSetelahSholat.adapter = DzikirDoaAdapter(DataDzikirDoaModel.listQauliyah)
		}
	}

	override fun onSupportNavigateUp(): Boolean {
		onBackPressedDispatcher.onBackPressed()
		return super.onSupportNavigateUp()
	}
}