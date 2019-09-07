package com.example.evlab2_pdm_00062217.Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.evlab2_pdm_00062217.R
import kotlinx.android.synthetic.main.dinamicfragment.view.*

class dynamicFragment: Fragment() {

    private var imageId: Int = 0

    companion object {
        fun newInstance(imageSet: Int):dynamicFragment{
            val newFragment = dynamicFragment()
            newFragment.imageId = imageSet
            return newFragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val v = inflater.inflate(R.layout.dinamicfragment, container, false)
        v.display_image.setImageResource(imageId)
        return v
    }

}