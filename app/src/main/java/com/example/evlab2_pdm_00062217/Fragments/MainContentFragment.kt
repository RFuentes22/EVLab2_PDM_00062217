package com.example.evlab2_pdm_00062217.Fragments

import android.support.v4.app.Fragment
import com.example.evlab2_pdm_00062217.img

class MainContentFragment: Fragment() {

    var img = img()

    companion object {
        fun newInstance(img: img): MainContentFragment{
            val newFragment = MainContentFragment()
            newFragment.img = img
            return newFragment
        }
    }



}