package com.guilherme.app8_listapets

import android.graphics.drawable.Drawable

data class Pet(
    var foto: Drawable?=null,
    var nome: String,
    var idade: String,
    var raca: Raca
)
