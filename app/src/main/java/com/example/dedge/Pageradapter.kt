package com.example.dedge

import android.app.WallpaperManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.viewpager.widget.PagerAdapter
import java.io.IOException

class Pageradapter(var downlodPage: downlod_page, var setarray: Array<Int>) : PagerAdapter() {
    override fun getCount(): Int {
        return setarray.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        var textpage: ImageView
        var wallpaper_set:ImageView

        var vi= LayoutInflater.from(downlodPage).inflate(R.layout.pagerview,container,false)
        textpage=vi.findViewById(R.id.text)
        textpage.setImageResource(setarray[position])
        container.addView(vi)

        wallpaper_set=vi.findViewById(R.id.wallpaper_set)

        wallpaper_set.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val myWallpaperManager = WallpaperManager.getInstance(downlodPage)
                try {
                    myWallpaperManager.setResource(+setarray[position])

                    Toast.makeText(
                        downlodPage,
                        "Wallpaper has been updated",
                        Toast.LENGTH_SHORT
                    ).show()
                } catch (e: IOException) {
                    // TODO Auto-generated catch block
                    e.printStackTrace()
                }
            }
        })


        return vi
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

}
