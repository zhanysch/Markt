package com.baish.internship.ui.bottomnavigation.home.agro

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.baish.internship.R

class AgroMarkViewModel: ViewModel() {

    val data = MutableLiveData<List<Dataclass>>()

    init {
        generateData()
    }

    private fun generateData(){
        val list = arrayListOf<Dataclass>()
        list.add(Dataclass(R.string.zhuzsom,R.drawable.dryfood,R.string.suho,R.string.Bishkek,R.string.usbek, R.string.semchek,R.string.dry3))
         list.add(Dataclass(R.string.doll,R.drawable.maybach,R.string.car,R.string.karakol,R.string.germans, R.string.maybaxchek, R.string.maybachdate))
        list.add(Dataclass(R.string.bla,R.drawable.traktor,R.string.trackt, R.string.almaty,R.string.russ, R.string.trakt_chek, R.string.traktchek))
        list.add(Dataclass(R.string.otherprice,R.drawable.cow,R.string.cow,R.string.toshkent,R.string.tagil, R.string.cow_chek,R.string.cow_date))

        list.add(Dataclass(R.string.yzh,R.drawable.iphone,R.string.phone,R.string.bish,R.string.bu,R.string.iphone_chek,R.string.iphone_date))
        list.add(Dataclass(R.string.jyrma,R.drawable.combainer,R.string.combain,R.string.osh,R.string.lising,R.string.comb_chek,R.string.comb_date))
        list.add(Dataclass(R.string.kyrk,R.drawable.home,R.string.рщьу,R.string.suusam,R.string.wood,R.string.home_chek,R.string.home_date))
        list.add(Dataclass(R.string.kyrkm, R.drawable.lopat,R.string.lopa,R.string.Bishkek,R.string.exsel, R.string.lopat_chek,R.string.lopat_date))


        list.add(Dataclass(R.string.eki,R.drawable.grabl,R.string.grabl,R.string.karakol,R.string.excelent, R.string.grabl_chek,R.string.grabl_date))
        list.add(Dataclass(R.string.bozyi, R.drawable.bozyi,R.string.yurta,R.string.Bishkek,R.string.ausgezeich, R.string.boz_chek,R.string.boz_date))
        data.postValue(list)
    }
}