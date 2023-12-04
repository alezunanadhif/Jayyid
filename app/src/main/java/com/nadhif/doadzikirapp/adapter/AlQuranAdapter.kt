package com.nadhif.doadzikirapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nadhif.doadzikirapp.databinding.RowItemAlQuranBinding
import com.nadhif.doadzikirapp.model.AlQuranModel

class AlQuranAdapter(private val listAlQuran: List<AlQuranModel>) :
	RecyclerView.Adapter<AlQuranAdapter.MyViewHolder>() {

	class MyViewHolder(val binding: RowItemAlQuranBinding) :
		RecyclerView.ViewHolder(binding.root)

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
		val bindingAlQuran = RowItemAlQuranBinding
			.inflate(LayoutInflater.from(parent.context), parent, false)

		return MyViewHolder(bindingAlQuran)
	}

	override fun getItemCount(): Int = listAlQuran.size

	override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
		val dataAlQuran = listAlQuran[position]

		holder.binding.apply {
			tvSurahName.text = dataAlQuran.name
			tvSurahTranslation.text = dataAlQuran.tranlation
		}
	}
}
