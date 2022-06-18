package com.example.karakiaapp.ui.history.history2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.karakiaapp.databinding.FragmentHistory2Binding


class HistoryFragment2 : Fragment() {

    private var _binding: FragmentHistory2Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val historyViewModel =
            ViewModelProvider(this).get(HistoryViewModel2::class.java)

        _binding = FragmentHistory2Binding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.text2
        historyViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}