package com.example.karakiaapp.ui.video.video2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.karakiaapp.databinding.FragmentMv2Binding

class Video_Fragment2 : Fragment() {

    private var _binding: FragmentMv2Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val slideshowViewModel =
            ViewModelProvider(this).get(Video_ViewModel2::class.java)

        _binding = FragmentMv2Binding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textMv2
        slideshowViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}