package com.hilal.androidcustomcomponents

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Toast

/**
 * Created by Hilal Güneş on 29.04.2024
 */
class AdvancedToastMaker(private val context: Context) {
    fun makeToast(
        message: String,
        duration: Int = Toast.LENGTH_SHORT,
        gravity: Int = Gravity.BOTTOM,
        xOffset: Int = 0,
        yOffset: Int = 0,
        backgroundColor: Int = Color.BLACK,
        textColor: Int = Color.WHITE,
        textSize: Float = 16f,
        typeface: Typeface = Typeface.DEFAULT,
        icon: Drawable? = null
    ): Toast {
        val inflater = LayoutInflater.from(context)
        val layout = inflater.inflate(R.layout.custom_toast, null)
        layout.findViewById<TextView>(R.id.text).apply {
            text = message
            setTextColor(textColor)
            this.textSize = textSize
            setTypeface(typeface, Typeface.BOLD)
            setCompoundDrawablesWithIntrinsicBounds(icon, null, null, null)
            setBackgroundColor(backgroundColor)
        }
        return Toast.makeText(context, message, duration).apply {
            setGravity(gravity, xOffset, yOffset)
            view = layout
            show()
        }
    }
}