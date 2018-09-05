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

        // 뷰페이저 어댑터 연결
        vpMainActivity.adapter = MainActivity@adapter

        vpMainActivity.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
            }

            override fun onPageSelected(position: Int) {

                tabLayout.getTabAt(0)?.setIcon(R.drawable.ic_a_black)
                tabLayout.getTabAt(1)?.setIcon(R.drawable.ic_b_black)
                tabLayout.getTabAt(2)?.setIcon(R.drawable.ic_c_black)
                tabLayout.getTabAt(3)?.setIcon(R.drawable.ic_d_black)
                tabLayout.getTabAt(4)?.setIcon(R.drawable.ic_e_black)

                when(position) {

                    0   ->    tabLayout.getTabAt(0)?.setIcon(R.drawable.ic_a)
                    1   ->    tabLayout.getTabAt(1)?.setIcon(R.drawable.ic_b)
                    2   ->    tabLayout.getTabAt(2)?.setIcon(R.drawable.ic_c)
                    3   ->    tabLayout.getTabAt(3)?.setIcon(R.drawable.ic_d)
                    4   ->    tabLayout.getTabAt(4)?.setIcon(R.drawable.ic_e)
                }



            }

        })

        // 탭 레이아웃에 뷰페이저 연결
        tabLayout.setupWithViewPager(vpMainActivity)

        // 탭 레이아웃 초기화
        tabLayout.getTabAt(0)?.setIcon(R.drawable.ic_a)
        tabLayout.getTabAt(1)?.setIcon(R.drawable.ic_b_black)
        tabLayout.getTabAt(2)?.setIcon(R.drawable.ic_c_black)
        tabLayout.getTabAt(3)?.setIcon(R.drawable.ic_d_black)
        tabLayout.getTabAt(4)?.setIcon(R.drawable.ic_e_black)
    }
}
