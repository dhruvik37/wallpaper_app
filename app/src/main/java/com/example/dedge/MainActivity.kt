package com.example.dedge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var list:ListView



    var array= arrayOf(R.drawable.jaishreeram,R.drawable.moon,R.drawable.caredit,R.drawable.radhe_krishna,R.drawable.art)
    var name_array= arrayOf("ram","moon","car","radhe_krishna","art")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list=findViewById(R.id.list)

        var adapter=Class1(this,array)

        list.adapter=adapter

        list.setOnItemClickListener { adapterView, view, position, id ->

            startActivity(Intent(this@MainActivity,enter_listview::class.java).putExtra("name_array",name_array[position]))


        }


    }



}