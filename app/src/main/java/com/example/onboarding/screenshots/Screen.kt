package com.example.onboarding.screenshots

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.navigation.NavHostController
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.onboarding.R
import com.example.onboarding.Model.Model
import com.example.onboarding.ui.theme.BackgroundBlue
import com.example.onboarding.ui.theme.BackgroundPurple
import com.example.onboarding.ui.theme.BackgroundRed
import com.example.onboarding.ui.theme.BackgroundYellow
@Composable
fun Screen1(navController: NavHostController) {
    val data = Model(
        picId = R.drawable.human1,
        dotsId = R.drawable.switching1,
        arrowId = R.drawable.button1,
        backgroundColor = BackgroundYellow,
        nextScreen = "screen2",
        firstTitle = "Your first car without \n" + "a driver's license",
        isTitleBold = false,
        secondTitle = "Goes to meet people who just got their license",

    )
    OnboardingScreen(data, navController)
}
@Composable
fun Screen2(navController: NavHostController) {
    val data = Model(
        picId = R.drawable.human2,
        dotsId = R.drawable.switching2,
        arrowId = R.drawable.button2,
        backgroundColor = BackgroundPurple,
        nextScreen = "screen3",
        firstTitle = "Always there: more than \n" + "1000 cars in Tbilisi",
        isTitleBold = true,
        secondTitle = "Our company is a leader by the \n" + "number of cars in the fleet"
    )
    OnboardingScreen(data, navController)
}
@Composable
fun Screen3(navController: NavHostController) {
    val data = Model(
        backgroundColor = BackgroundRed,
        picId = R.drawable.human3,
        dotsId = R.drawable.switching3,
        arrowId = R.drawable.button3,
        nextScreen = "screen4",
        firstTitle = "Do not pay for parking, \n" + "maintenance and gasoline",
        isTitleBold = true,
        secondTitle = "We will pay for you, all expenses \n" + "related to the car",
    )
    OnboardingScreen(data, navController)
}
@Composable
fun Screen4(navController: NavHostController) {
    val data = Model(
        backgroundColor = BackgroundBlue,
        picId = R.drawable.human4,
        dotsId = R.drawable.switching4,
        arrowId = R.drawable.button4,
        nextScreen = "screen5",
        firstTitle = "29 car models: from Skoda \n" + "Octavia to Porsche 911",
        isTitleBold = true,
        secondTitle = "Choose between regular car models \n" + "or exclusive ones",
    )
    OnboardingScreen(data, navController)
}
@Composable
fun Screen5() {
    Box(
        modifier = Modifier.fillMaxSize()
            .background(BackgroundBlue),
        contentAlignment = Alignment.Center,
    ) {
        Text("You are a clever person!", color = Color.White, fontSize = 24.sp, fontWeight = FontWeight.Bold)
    }
}
