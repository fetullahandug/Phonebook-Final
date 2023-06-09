package com.example.phonebook_final.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.phonebook_final.R
import com.example.phonebook_final.adapter.ItemAdapter
import com.example.phonebook_final.data.Datasource
import com.example.phonebook_final.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding : FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var contacts = Datasource().getContacts()
        var recyclerView = binding.recylerViewPhonebook

        recyclerView.adapter = ItemAdapter(contacts)
        recyclerView.setHasFixedSize(true)
    }
}