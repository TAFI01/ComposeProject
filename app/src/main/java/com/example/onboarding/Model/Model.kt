package com.example.onboarding.Model
import androidx.compose.ui.graphics.Color
data class Model (
    val backgroundColor: Color,
    val picId: Int,
    val dotsId: Int,
    val nextScreen: String,
    val firstTitle: String,
    val arrowId: Int,
    val isTitleBold: Boolean,
    val secondTitle: String
)