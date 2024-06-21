package com.example.onboarding

import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.onboarding.screenshots.Screen1
import com.example.onboarding.screenshots.Screen2
import com.example.onboarding.screenshots.Screen3
import com.example.onboarding.screenshots.Screen4
import com.example.onboarding.screenshots.Screen5

@Composable
fun OnboardingNav(navController: NavHostController = rememberNavController()) {
    NavHost(navController, startDestination = "screen1") {
        composable(
            route = "screen1",
            enterTransition = {
                slideInHorizontally(
                    initialOffsetX = { it },
                    animationSpec = tween(durationMillis = 1000)
                )
            },
            exitTransition = {
                slideOutHorizontally(
                    targetOffsetX = { -it },
                    animationSpec = tween(durationMillis = 1000)
                )
            }
        ) { Screen1(navController) }

        composable(
            route = "screen2",
            enterTransition = {
                slideInHorizontally(
                    initialOffsetX = { it },
                    animationSpec = tween(durationMillis = 1000)
                )
            },
            exitTransition = {
                slideOutHorizontally(
                    targetOffsetX = { -it },
                    animationSpec = tween(durationMillis = 1000)
                )
            }
        ) { Screen2(navController) }

        composable(
            route = "screen3",
            enterTransition = {
                slideInHorizontally(
                    initialOffsetX = { it },
                    animationSpec = tween(durationMillis = 1000)
                )
            },
            exitTransition = {
                slideOutHorizontally(
                    targetOffsetX = { -it },
                    animationSpec = tween(durationMillis = 1000)
                )
            }
        ) { Screen3(navController) }

        composable(
            route = "screen4",
            enterTransition = {
                slideInHorizontally(
                    initialOffsetX = { it },
                    animationSpec = tween(durationMillis = 1000)
                )
            },
            exitTransition = {
                slideOutHorizontally(
                    targetOffsetX = { -it },
                    animationSpec = tween(durationMillis = 1000)
                )
            }
        ) { Screen4(navController) }

        composable(
            route = "screen5",
            enterTransition = {
                slideInHorizontally(
                    initialOffsetX = { it },
                    animationSpec = tween(durationMillis = 1000)
                )
            },
            exitTransition = {
                slideOutHorizontally(
                    targetOffsetX = { -it },
                    animationSpec = tween(durationMillis = 1000)
                )
            }
        ) { Screen5() }
    }
}
