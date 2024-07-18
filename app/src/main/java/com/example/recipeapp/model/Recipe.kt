package com.example.recipeapp.model

import java.util.Date

data class Recipe (
    val id:String,
    val name: String,
    val category: List<String>,
    val createdBy: String,
    val createdAt: Date,
    val ingredients: List<String>,
    val procedures: List<String>,
    val views: Int,
    val likes: Int,
    val review: Double
)