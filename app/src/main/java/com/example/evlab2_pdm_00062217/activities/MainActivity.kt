package com.example.evlab2_pdm_00062217.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View
import com.example.evlab2_pdm_00062217.Fragments.dynamicFragment
import com.example.evlab2_pdm_00062217.Fragments.staticfragment
import com.example.evlab2_pdm_00062217.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), staticfragment.ButtonListener {

    private lateinit var dynamic_fragment: dynamicFragment
    private val imagesId: IntArray = intArrayOf(R.drawable.img1, R.drawable.img2, R.drawable.img3)
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        changeFragment(dynamicFragment.newInstance(imagesId[0]))
    }


    override fun previousListener(v: View) {
        dynamic_fragment = dynamicFragment.newInstance(verifyCounter(1))
        changeFragment(dynamic_fragment)
    }

    override fun nextListener(v: View) {
        dynamic_fragment = dynamicFragment.newInstance(verifyCounter(2))
        changeFragment(dynamic_fragment)
    }

    private fun verifyCounter(i: Int): Int{
        return when (i) {
            1 -> {
                counter--
                if(counter<0) counter = 2
                imagesId[counter]
            }
            else -> {
                counter++
                if(counter>2) counter = 0
                imagesId[counter]
            }
        }
    }

    private fun changeFragment(frag: dynamicFragment){
        supportFragmentManager.beginTransaction().replace(R.id.dynamic_fragment_container, frag).commit()
    }

}



