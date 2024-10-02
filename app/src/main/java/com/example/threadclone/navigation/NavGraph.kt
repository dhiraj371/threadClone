package com.example.threadclone.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.threadclone.screens.AddThreads
import com.example.threadclone.screens.BottomNav
import com.example.threadclone.screens.Home
import com.example.threadclone.screens.Login
import com.example.threadclone.screens.Notifications
import com.example.threadclone.screens.Profile
import com.example.threadclone.screens.Register
import com.example.threadclone.screens.Search
import com.example.threadclone.screens.Splash

@Composable
fun NavGraph(navController: NavHostController, modifier: Modifier){
    NavHost(navController=navController, startDestination =Routes.Splash.routes )
    {
        composable(Routes.Splash.routes) {
            Splash(navController)
        }
        composable(Routes.Home.routes) {
            Home()
        }
        composable(Routes.Search.routes) {
            Search()
        }
        composable(Routes.Notification.routes) {
            Notifications()
        }
        composable(Routes.AddThreads.routes) {
            AddThreads()
        }
        composable(Routes.Profile.routes) {
            Profile()
        }
        composable(Routes.BottomNav.routes) {
            BottomNav(navController)
        }

        composable(Routes.Login.routes) {
            Login(navController)
        }

        composable(Routes.Register.routes) {
            Register(navController)
        }



    }
}