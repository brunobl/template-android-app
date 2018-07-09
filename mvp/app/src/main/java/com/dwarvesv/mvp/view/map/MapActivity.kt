package com.dwarvesv.mvp.view.map

import android.os.Bundle
import com.dwarvesv.mvp.R
import com.dwarvesv.mvp.base.BaseNoAppBarActivity


class MapActivity : BaseNoAppBarActivity(), MapFragment.InteractionListener {


    private lateinit var mapFragment: MapFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            mapFragment = MapFragment.newInstance()
            replaceFragment(R.id.fragmentContainer, mapFragment)
        }
        setToolbarTitle(getString(R.string.activity_title_map))
        setDisplayHomeAsUpEnabled(true)
    }

}
