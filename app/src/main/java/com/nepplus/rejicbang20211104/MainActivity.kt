package com.nepplus.rejicbang20211104

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.rejicbang20211104.RoomData.Roomdata
import com.nepplus.rejicbang20211104.adapters.RoomAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRomms = ArrayList<Roomdata>()
    lateinit var mRoomAdapter: RoomAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRomms.add(Roomdata(2000, "서울시 동대문구", 3, "1번 방입입니다."))
        mRomms.add(Roomdata(264000, "서울시 동대문구", 23, "2번 방입입니다."))
        mRomms.add(Roomdata(24000, "서울시 동대문구", -3, "3번 방입입니다."))
        mRomms.add(Roomdata(9000, "서울시 동대문구", 3, "4번 방입입니다."))
        mRomms.add(Roomdata(2850, "서울시 동대문구", 0, "5번 방입입니다."))
        mRomms.add(Roomdata(22300, "서울시 동대문구", 1, "5번 방입입니다."))
        mRomms.add(Roomdata(9200, "서울시 동대문구", 2, "6번 방입입니다."))

        mRoomAdapter = RoomAdapter(this,R.layout.roomitemlinedesign,mRomms)
        roomListView.adapter = mRoomAdapter

    }
}