package com.example.phonebook_final.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.phonebook_final.R
import com.example.phonebook_final.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    private lateinit var binding : FragmentDetailBinding
    private var contact_name : String = ""
    private var contact_number : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            contact_name = it.getString("contact_name").toString()
            contact_number = it.getString("contact_number").toString()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_detail, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.textViewName.text = contact_name
        binding.textViewNumber.text = contact_number

        binding.btnCall.setOnClickListener{
            Toast.makeText(requireContext(), "Es wird nun angerufen!", Toast.LENGTH_SHORT)
        }

        binding.btnMessage.setOnClickListener{
            Toast.makeText(requireContext(), "Es wird nun eine SMS gschrieben!", Toast.LENGTH_SHORT)
        }
    }
}