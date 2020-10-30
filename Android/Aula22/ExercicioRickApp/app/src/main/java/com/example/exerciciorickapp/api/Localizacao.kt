package com.example.exerciciorickapp.api

import com.google.gson.annotations.SerializedName

data class Localizacao(
    @SerializedName("name")
    var nome : String
)