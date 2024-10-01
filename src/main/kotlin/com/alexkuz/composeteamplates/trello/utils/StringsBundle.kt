package com.alexkuz.composeteamplates.trello.utils

import org.jetbrains.annotations.PropertyKey
import java.text.MessageFormat
import java.util.*

object StringsBundle {
    private val bundle = ResourceBundle.getBundle("messages.strings")

    fun string(@PropertyKey(resourceBundle = "messages.strings") key: String, vararg params: Any): String {
        val value = bundle.getString(key)
        return if (value.isNotEmpty()) {
            MessageFormat.format(value, *params)
        } else {
            value
        }
    }
}