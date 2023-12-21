package com.idea_festival.presentation.ui.main.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.idea_festival.presentation.ui.main.screen.TodayImageRoute

const val todayImageRoute = "today_image_route"

fun NavController.navigateToTodayImage(navOptions: NavOptions? = null) {
    this.navigate(todayImageRoute, navOptions)
}

fun NavGraphBuilder.todayImageScreen(
    onCheckButtonClick: () -> Unit
) {
    composable(route = todayImageRoute) {
        TodayImageRoute(
            onCheckButtonClick = onCheckButtonClick
        )
    }
}