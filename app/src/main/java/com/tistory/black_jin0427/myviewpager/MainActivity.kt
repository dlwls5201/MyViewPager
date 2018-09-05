package com.tistory.black_jin0427.myviewpager

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val adapter by lazy { MainAdapter(supportFragmentManager) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //init viewpager
        vpMainActivity.adapter = MainActivity@adapter

        vpMainActivity.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageScrollStateChanged(p0: Int) {

            }

            override fun onPageScrolled(p0: Int, p1: Float, p2: Int) {

            }

            override fun onPageSelected(p0: Int) {
                ciMainActivity.selectDot(p0)
            }

        })

        //init indicator
        ciMainActivity.createDotPanel(5, R.drawable.indicator_dot_off, R.drawable.indicator_dot_on, 0)
    }
}
