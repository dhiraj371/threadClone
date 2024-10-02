package com.example.threadclone.navigation

sealed class Routes(val routes:String) {

    object Home:Routes("home")
    object Profile:Routes("profile")
    object Splash:Routes("splash")
    object Notification:Routes("notification")
    object AddThreads:Routes("addThreads")
    object Search:Routes("search")
    object BottomNav:Routes("bottomNav")
    object Register:Routes("register")
    object Login:Routes("login")





}