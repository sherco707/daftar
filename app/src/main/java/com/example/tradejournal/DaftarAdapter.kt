package com.example.tradejournal

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tradejournal.databinding.ItemJournalBinding

class DaftarAdapter(val list: List<Message>, val onClick: (message: Message) -> Unit) :
    RecyclerView.Adapter<DaftarAdapter.VH>() {
    inner class VH(val itemDaftarBinding: ItemJournalBinding) :
        RecyclerView.ViewHolder(itemDaftarBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(ItemJournalBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.itemDaftarBinding.recTxt.text = list[position].mavzu
        holder.itemDaftarBinding.recTxt.setOnClickListener {
            onClick.invoke(list[position])
        }
    }
}