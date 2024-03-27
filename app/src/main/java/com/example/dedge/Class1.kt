package com.example.dedge

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class Class1(var mainActivity: MainActivity, var array: Array<Int>) : BaseAdapter() {
    override fun getCount(): Int {
        return array.size
    }

    override fun getItem(p0: Int): Any {
        return p0
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        var image:ImageView
        var image_name:TextView

        var view=LayoutInflater.from(mainActivity).inflate(R.layout.main_page,p2,false)

        image=view.findViewById(R.id.image)
        //image_name=view.findViewById(R.id.image_name)

        image.setImageResource(array[p0])
       // image_name.setBackgroundResource(array[p0])

        return view
    }

}
