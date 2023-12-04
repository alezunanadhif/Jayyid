package com.nadhif.doadzikirapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nadhif.doadzikirapp.R
import androidx.recyclerview.widget.LinearLayoutManager
import com.nadhif.doadzikirapp.adapter.AlQuranAdapter
import com.nadhif.doadzikirapp.databinding.ActivityAlQuranBinding
import com.nadhif.doadzikirapp.model.AlQuranModel

class AlQuranActivity : AppCompatActivity() {
	private lateinit var binding: ActivityAlQuranBinding

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityAlQuranBinding.inflate(layoutInflater)
		setContentView(binding.root)

		supportActionBar?.setDisplayHomeAsUpEnabled(true)
		supportActionBar?.title = "Al Quran"

		binding.apply {
			rvDzikirSetiapSaat.layoutManager = LinearLayoutManager(this@AlQuranActivity)
			rvDzikirSetiapSaat.adapter = AlQuranAdapter(GetDataAlQuran())
		}

	}

	fun GetDataAlQuran(): ArrayList<AlQuranModel> {
		val name = resources.getStringArray(R.array.arr_surah_names)
		val translation = resources.getStringArray(R.array.arr_surah_translations)

		val dataAlQuran = arrayListOf<AlQuranModel>()
		for (i in name.indices) {
			var gabung = AlQuranModel(
				name[i],
				translation[i],
			)
			dataAlQuran.addAll(listOf(gabung))
		}
		return dataAlQuran
	}

	override fun onSupportNavigateUp(): Boolean {
		onBackPressedDispatcher.onBackPressed()
		return super.onSupportNavigateUp()
	}
}