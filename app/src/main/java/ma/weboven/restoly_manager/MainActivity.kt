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

            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = Screen.SplashScreen.route) {

                // splash screen
                composable(Screen.SplashScreen.route) { SplashScreen(navController = navController) }
                composable(Screen.OnBoardingScreen.route) { OnBoardingScreen(navController = navController) }

                // when the user is not connected
                composable(Screen.LoginScreen.route) { LoginScreen(navController=navController) }
                composable(Screen.RegisterScreen.route) { RegisterScreen(navController=navController) }
                composable(Screen.ForgotPasswordScreen.route) { ForgotPasswordScreen(navController = navController) }

                // when the user is connected
                composable(Screen.FirstVisitScreen.route) { FirstVisitScreen(navController =navController) }
                composable(Screen.AddRestaurantScreen.route) { AddRestaurantScreen(navController =navController) }

            }

            RestolyManagerTheme {

            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RestolyManagerTheme {
        Greeting("Android")
    }
}