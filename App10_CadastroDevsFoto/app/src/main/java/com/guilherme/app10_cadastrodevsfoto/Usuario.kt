package com.guilherme.app10_cadastrodevsfoto

import android.graphics.Bitmap

data class Usuario(
    var foto: Bitmap? =null,
    var nome: String,
    var email: String,
    var stack: Stack,
    var senioridade: Senioridade,
    var empregado: Boolean
)