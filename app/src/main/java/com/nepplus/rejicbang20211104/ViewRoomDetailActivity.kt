package com.nepplus.rejicbang20211104

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.rejicbang20211104.RoomData.Roomdata

class ViewRoomDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

        val roomData= intent.getSerializableExtra("room") as Roomdata

    }
}