package com.nadhif.doadzikirapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.nadhif.doadzikirapp.databinding.ActivityMainBinding
import com.nadhif.doadzikirapp.ui.AlQuranActivity
import com.nadhif.doadzikirapp.ui.DoaHarianActivity
import com.nadhif.doadzikirapp.ui.DzikirPagiActivity
import com.nadhif.doadzikirapp.ui.DzikirPetangActivity
import com.nadhif.doadzikirapp.ui.DzikirSetelahSholatActivity
import com.nadhif.doadzikirapp.ui.DzikirSetiapSaatActivity
import com.nadhif.doadzikirapp.ui.ProfileActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

	private lateinit var binding: ActivityMainBinding

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityMainBinding.inflate(layoutInflater)
		setContentView(binding.root)

		setView()
	}

	private fun setView() {
		// Setup view artikel
		binding.apply {
			llAlQuran.setOnClickListener(this@MainActivity)
			llProfile.setOnClickListener(this@MainActivity)
			llDoaHarian.setOnClickListener(this@MainActivity)
			llDzikirSetelahSholat.setOnClickListener(this@MainActivity)
			llDzikirSetiapSaat.setOnClickListener(this@MainActivity)
			llDzikirPagi.setOnClickListener(this@MainActivity)
			llDzikirPetang.setOnClickListener(this@MainActivity)
		}
	}


	override fun onClick(v: View?) {
		when(v?.id){
			R.id.ll_al_quran -> {
				val intentAlQuran = Intent(this@MainActivity, AlQuranActivity::class.java)
				startActivity(intentAlQuran)
			}
			R.id.ll_profile -> {
				val intentProfile = Intent(this@MainActivity, ProfileActivity::class.java)
				startActivity(intentProfile)
			}
			R.id.ll_doa_harian -> {
				val intentDH = Intent(this@MainActivity, DoaHarianActivity::class.java)
				startActivity(intentDH)
			}
			R.id.ll_dzikir_setelah_sholat -> {
				val intentDDS = Intent(this@MainActivity, DzikirSetelahSholatActivity::class.java)
				startActivity(intentDDS)
			}
			R.id.ll_dzikir_setiap_saat -> {
				val intentDSS = Intent(this@MainActivity, DzikirSetiapSaatActivity::class.java)
				startActivity(intentDSS)
			}
			R.id.ll_dzikir_pagi -> {
				val intentDP = Intent(this@MainActivity, DzikirPagiActivity::class.java)
				startActivity(intentDP)
			}
			R.id.ll_dzikir_petang -> {
				val intentDP = Intent(this@MainActivity, DzikirPetangActivity::class.java)
				startActivity(intentDP)
			}
			R.id.back_to_main_page -> {
				val intentBTMP = Intent(this@MainActivity, MainActivity::class.java)
				startActivity(intentBTMP)
			}
		}
	}
}