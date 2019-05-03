package com.example.evlab2_pdm_00062217

import android.os.Parcel
import android.os.Parcelable


data class img(
        val img1: Int = R.drawable.img1,
        val img2:Int = R.drawable.img2,
        val img3: Int = R.drawable.img3

) : Parcelable {
    constructor(parcel: Parcel) : this(
            img1 = parcel.readInt(),
            img2 = parcel.readInt(),
            img3 = parcel.readInt()
            )
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(img1)
        parcel.writeInt(img2)
        parcel.writeInt(img3)

    }

    override fun describeContents() = 0

    companion object {
        @JvmField val CREATOR = object : Parcelable.Creator<img> {
            override fun createFromParcel(parcel: Parcel): img = img(parcel)
            override fun newArray(size: Int): Array<img?> = arrayOfNulls(size)
        }
    }

}
