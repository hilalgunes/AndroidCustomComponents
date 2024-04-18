package com.hilal.androidcustomcomponents

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView

/**
 * Created by Hilal Güneş on 18.04.2024
 */

fun createAndConfigurePopupItem(
    context: Context,
    title: String,
    description: String,
    explanation: String,
    buttonText: String
) {
    val builder = AlertDialog.Builder(context)
    val inflater = LayoutInflater.from(context)
    val view = inflater.inflate(R.layout.popup_item, null)
    builder.setView(view)

    val alertDialog = builder.create()
    alertDialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
    alertDialog.show()

    view.findViewById<AppCompatButton>(R.id.button).setOnClickListener {
        alertDialog.dismiss()
    }
    view.findViewById<AppCompatTextView>(R.id.title).text = title
    view.findViewById<AppCompatTextView>(R.id.description).text = description
    view.findViewById<AppCompatTextView>(R.id.explanation).text = explanation
    view.findViewById<AppCompatButton>(R.id.button).text = buttonText

}
