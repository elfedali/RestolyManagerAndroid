package ma.weboven.restoly_manager.navigation

sealed class Screen (val route: String) {

    object SplashScreen: Screen("splash_screen")
    object OnBoardingScreen: Screen("onboarding_screen")

    object LoginScreen: Screen("login_screen")
    object RegisterScreen: Screen("register_screen")
    object ForgotPasswordScreen: Screen("forgot_password_screen")

    // when the user is logged in
    object FirstVisitScreen: Screen("first_visit_screen")
    object AddRestaurantScreen: Screen("add_restaurant_screen")

}