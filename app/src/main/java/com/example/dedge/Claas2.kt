package com.example.dedge

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView

class Claas2(var enterListview: enter_listview, var blank: Array<Int>):BaseAdapter() {
    override fun getCount(): Int {
        return blank.size
    }

    override fun getItem(p0: Int): Any {
        return p0
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        var view=LayoutInflater.from(enterListview).inflate(R.layout.entercradview,p2,false)

        var ram_imaige:ImageView
        ram_imaige=view.findViewById(R.id.ram_imaige)

        ram_imaige.setBackgroundResource(blank[p0])

        return view
    }

}
