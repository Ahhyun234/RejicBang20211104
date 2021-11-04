package com.nepplus.rejicbang20211104.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.nepplus.rejicbang20211104.R
import com.nepplus.rejicbang20211104.RoomData.Roomdata

class RoomAdapter(val mcontext:Context, val resId:Int, val mList:ArrayList<Roomdata>)
    :ArrayAdapter<Roomdata>(mcontext, resId,mList) {

        val mInflater= LayoutInflater.from(mcontext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if (tempRow == null ){
            tempRow = mInflater.inflate(R.layout.roomitemlinedesign,null)
        }
        val row = tempRow!!

        return row

    }




}