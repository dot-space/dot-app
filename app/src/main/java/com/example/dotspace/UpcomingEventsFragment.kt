package com.example.dotspace

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.dotspace.databinding.FragmentHomeBinding
import com.example.dotspace.databinding.FragmentUpcomingEventsBinding
import com.example.dotspace.ui.home.HomeViewModel

class UpcomingEventsFragment : Fragment() {

    private var _binding: FragmentUpcomingEventsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentUpcomingEventsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val rsvpButton = binding.rsvpButton

        rsvpButton.setOnClickListener {
            if (rsvpButton.text == "RSVP"){
                rsvpButton.setText("RSVP-ed!")
                }
            else{
                rsvpButton.setText("RSVP")
            }
        }
        return root
    }
}
