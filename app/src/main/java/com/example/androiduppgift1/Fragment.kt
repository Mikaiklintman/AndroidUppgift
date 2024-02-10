package com.example.androiduppgift1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView


class Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.WelcomeGoodbyeText).text = "Welcome"

        view.findViewById<Button>(R.id.ClickhereButton).setOnClickListener {
            view.findViewById<TextView>(R.id.WelcomeGoodbyeText).text = "Goodbye"
        }
    }

}