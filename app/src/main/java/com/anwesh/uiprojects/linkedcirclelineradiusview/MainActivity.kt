package com.anwesh.uiprojects.linkedcirclelineradiusview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.circlelineradiusview.CircleLineRadiusView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        CircleLineRadiusView.create(this)
    }
}
