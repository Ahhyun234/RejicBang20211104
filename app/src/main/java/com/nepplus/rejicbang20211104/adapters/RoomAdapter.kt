package com.nepplus.rejicbang20211104.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
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

        val roomdata = mList[position]

        val txtPrice = row.findViewById<TextView>(R.id.txtPrice)
        val txtAddressAndFloor = row.findViewById<TextView>(R.id.txtAddressAndFloor)
        val txtDescription = row.findViewById<TextView>(R.id.txtDescription)

        txtDescription.text= roomdata.description
        txtAddressAndFloor.text = "${roomdata.address},${roomdata.getFormattedFloor()}"
            txtPrice.text = roomdata.getFormattedPrice()

        return row

    }




}