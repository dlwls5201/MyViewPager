package com.tistory.black_jin0427.myviewpager

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.view.ViewGroup
import com.tistory.black_jin0427.myviewpager.fragment.*

class MainAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment? {

        return when(position) {

            0       ->  AFragment()

            1       ->  BFragment()

            2       ->  CFragment()

            3       ->  DFragment()

            4       ->  EFragment()

            else    ->  null
        }

    }

    // 생성 할 Fragment 의 개수
    override fun getCount() = 5

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        super.destroyItem(container, position, `object`)
        //Log.e("FragmentPagerAdapter", "destroyItem position : $position")
    }

}