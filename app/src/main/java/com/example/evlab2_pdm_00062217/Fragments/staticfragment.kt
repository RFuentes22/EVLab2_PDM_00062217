package com.example.evlab2_pdm_00062217.Fragments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.evlab2_pdm_00062217.R
import kotlinx.android.synthetic.main.staticfragment.view.*

class staticfragment : Fragment() {

    var listenerTool: ButtonListener? = null

    interface ButtonListener {
        fun previousListener(v: View)
        fun nextListener(v: View)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val v = inflater.inflate(R.layout.staticfragment, container, false)
        v.previous_button.setOnClickListener {
            listenerTool?.previousListener(it)
        }
        v.forward_button.setOnClickListener {
            listenerTool?.nextListener(it)
        }
        return v
    }


    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is ButtonListener) listenerTool = context
        else throw RuntimeException("Se necesita una implementación de  la interfaz")
    }

    override fun onDetach() {
        super.onDetach()
        listenerTool = null
    }
}
