package com.example.dedge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.TextView

class enter_listview : AppCompatActivity() {

    lateinit var grid: GridView
    lateinit var wallpaper_name :TextView

    var ram = arrayOf(
        R.drawable.ram1,
        R.drawable.ram2,
        R.drawable.ram3,
        R.drawable.ram4,
        R.drawable.ram5,
        R.drawable.ram6,
        R.drawable.ram7,
        R.drawable.ram8,
        R.drawable.ram9,
        R.drawable.ram10,
        R.drawable.ram11,
        R.drawable.ram12,
        R.drawable.ram13,
        R.drawable.ram14,
        R.drawable.ram15,
        R.drawable.ram16,
        R.drawable.ram17,
        R.drawable.ram18,
        R.drawable.ram19,
        R.drawable.ram20,
        R.drawable.ram21,
        R.drawable.ram22,
        R.drawable.ram23
    )
    var moon = arrayOf(
        R.drawable.moon1,
        R.drawable.moon2,
        R.drawable.moon3,
        R.drawable.moon4,
        R.drawable.moon5,
        R.drawable.moon6,
        R.drawable.moon7,
        R.drawable.moon8,
        R.drawable.moon9,
        R.drawable.moon10,
        R.drawable.moon11,
        R.drawable.moon12,
        R.drawable.moon13,
        R.drawable.moon14,
        R.drawable.moon15,
        R.drawable.moon16,
        R.drawable.moon17
    )
    var car = arrayOf(
        R.drawable.car1,
        R.drawable.car2,
        R.drawable.car3,
        R.drawable.car4,
        R.drawable.car5,
        R.drawable.car6,
        R.drawable.car7,
        R.drawable.car8,
        R.drawable.car9,
        R.drawable.car10,
        R.drawable.car11,
        R.drawable.car12,
        R.drawable.car13,
        R.drawable.car14,
        R.drawable.car15,
        R.drawable.car16,
        R.drawable.car17,
        R.drawable.car18,
        R.drawable.car19,
        R.drawable.car20,
        R.drawable.car21
    )
    var radhe_krishna = arrayOf(
        R.drawable.radhe_krishna1,
        R.drawable.radhe_krishna2,
        R.drawable.radhe_krishna3,
        R.drawable.radhe_krishna4,
        R.drawable.radhe_krishna5,
        R.drawable.radhe_krishna6,
        R.drawable.radhe_krishna7,
        R.drawable.radhe_krishna8,
        R.drawable.radhe_krishna9,
        R.drawable.radhe_krishna10,
        R.drawable.radhe_krishna11,
        R.drawable.radhe_krishna12,
        R.drawable.radhe_krishna13,
        R.drawable.radhe_krishna14,
        R.drawable.radhe_krishna15,
        R.drawable.radhe_krishna16,
        R.drawable.radhe_krishna17,
        R.drawable.radhe_krishna18,
        R.drawable.radhe_krishna19,
        R.drawable.radhe_krishna20,
        R.drawable.radhe_krishna21
    )

    var art = arrayOf(
        R.drawable.art1,
        R.drawable.art2,
        R.drawable.art3,
        R.drawable.art4,
        R.drawable.art5,
        R.drawable.art6,
        R.drawable.art7,
        R.drawable.art8,
        R.drawable.art9,
        R.drawable.art10,
        R.drawable.art11,
        R.drawable.art12,
        R.drawable.art13,
        R.drawable.art14
    )

    companion object {
        var blank = arrayOf<Int>()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.enter_listview)

        grid = findViewById(R.id.grid)
        wallpaper_name=findViewById(R.id.wallpaper_name)

        var name_array = intent.getStringExtra("name_array")

        wallpaper_name.setText(name_array)

        if (name_array.equals("ram")) {
            blank = ram
        } else if (name_array.equals("moon")) {
            blank = moon
        } else if (name_array.equals("car")) {
            blank = car
        } else if (name_array.equals("radhe_krishna")) {
            blank = radhe_krishna
        } else if (name_array.equals("art")) {
            blank = art
        }

        var card = Claas2(this, blank)

        grid.adapter = card

        grid.setOnItemClickListener { adapterView, view, i, l ->
            startActivity(
                Intent(this@enter_listview, downlod_page::class.java).putExtra("pos", i)
            )

        }
    }
}