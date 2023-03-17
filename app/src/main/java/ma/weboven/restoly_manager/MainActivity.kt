package ma.weboven.restoly_manager

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ma.weboven.restoly_manager.navigation.Screen
import ma.weboven.restoly_manager.screens.*
import ma.weboven.restoly_manager.screens.connected.AddRestaurantScreen
import ma.weboven.restoly_manager.screens.connected.FirstVisitScreen
import ma.weboven.restoly_manager.ui.theme.RestolyManagerTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RestolyManagerTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController, startDestination = Screen.SplashScreen.route
                ) {

                    // splash screen
                    composable(Screen.SplashScreen.route) {
                        SplashScreen(onComplete = {
                            navController.navigate(Screen.OnBoardingScreen.route)


                        })
                    }
                    composable(Screen.OnBoardingScreen.route) { OnBoardingScreen(navController = navController) }

                    // when the user is not connected
                    composable(Screen.LoginScreen.route) {
                        LoginScreen(
                            navController = navController,
                            onLogin = { _, _ -> },
                            onRegisterClicked = { navController.navigate(Screen.RegisterScreen.route) },
                            //onForgotPasswordClicked = { navController.navigate(Screen.ForgotPasswordScreen.route) }
                        )
                    }
                    composable(Screen.RegisterScreen.route) {

                        RegisterScreen(navController = navController,
                            onRegister = { _, _, _ -> },
                            onLoginClicked = { navController.navigate(Screen.LoginScreen.route) }

                        )
                    }
                    composable(Screen.ForgotPasswordScreen.route) {
                        ForgotPasswordScreen(
                            navController = navController
                        )
                    }

                    // when the user is connected
                    composable(Screen.FirstVisitScreen.route) { FirstVisitScreen(navController = navController) }
                    composable(Screen.AddRestaurantScreen.route) { AddRestaurantScreen(navController = navController) }

                }


            }
        }
    }
}

