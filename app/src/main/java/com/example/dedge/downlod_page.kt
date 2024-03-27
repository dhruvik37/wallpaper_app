package com.example.dedge



import android.R.id.button1
import android.app.WallpaperManager
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import java.io.IOException

class downlod_page : AppCompatActivity() {



    lateinit var view : ViewPager
    var setarray= arrayOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.downlod_page)


        var pos=intent.getIntExtra("pos",0)

        setarray=enter_listview.blank

        view=findViewById(R.id.view)

        var Myadapter= Pageradapter(this,setarray)

        view.adapter=Myadapter

        view.setCurrentItem(pos)




    }



}

