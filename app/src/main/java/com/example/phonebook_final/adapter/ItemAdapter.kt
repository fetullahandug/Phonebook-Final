package com.example.phonebook_final.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.phonebook_final.R
import com.example.phonebook_final.data.model.Contact
import com.example.phonebook_final.ui.HomeFragmentDirections

class ItemAdapter(var dataset: MutableList<Contact>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val tv_name = itemView.findViewById<TextView>(R.id.textView_name)
        val tv_number = itemView.findViewById<TextView>(R.id.textView_number)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(itemLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]

        holder.tv_name.text = item.contact_name
        holder.tv_number.text = item.contact_number

        holder.itemView.setOnClickListener{
            var navController = holder.itemView.findNavController()
            navController.navigate(HomeFragmentDirections.actionHomeFragmentToDetailFragment(contactName = item.contact_name, contactNumber = item.contact_number))
        }
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}