package com.example.rickandmorty2.listagem.model

data class ApiResponseModel<T> (
    val info: PageInfoModel,
    val results: List<T>
)