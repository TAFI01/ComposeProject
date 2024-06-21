package com.example.onboarding.screenshots

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.onboarding.Model.Model

@Composable
fun OnboardingScreen(data: Model, navController: NavHostController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = data.backgroundColor
    ) {
        Column(
            modifier = Modifier
                .padding(24.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(top = 36.dp, bottom = 38.dp)
            ) {
                Text(
                    color = Color.White,
                    fontSize = 28.sp,
                    text = data.firstTitle,
                    fontWeight = if (data.isTitleBold) FontWeight.Bold else FontWeight(300),
                    modifier = Modifier.padding(bottom = 12.dp)
                )
                Text(
                    color = Color.White,
                    fontSize = 18.sp,
                    text = data.secondTitle
                )
            }
            Image(
                painter = painterResource(data.picId),
                contentDescription = "image",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 30.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 23.dp)
            ) {
                Column(
                    modifier = Modifier
                        .padding(start = 24.dp, top = 6.dp)
                        .weight(1f)
                ) {
                    Image(
                        painter = painterResource(data.dotsId),
                        contentDescription = "dots",
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier
                            .width(72.dp)
                            .height(8.dp)
                    )
                    Text(
                        text = "Skip",
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight(250),
                        modifier = Modifier
                            .clickable { navController.navigate("screen5") }
                            .padding(top = 15.dp)
                    )
                }
                IconButton(
                    onClick = { navController.navigate(data.nextScreen) },
                    modifier = Modifier
                        .size(58.dp)
                        .align(Alignment.CenterVertically)
                ) {
                    Image(
                        painter = painterResource(data.arrowId),
                        contentDescription = "Arrow icon",
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }
        }
    }
}
