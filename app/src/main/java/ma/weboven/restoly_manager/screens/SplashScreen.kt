package ma.weboven.restoly_manager.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import ma.weboven.restoly_manager.navigation.Screen

/**
 * In this screen we will show the splash screen to the user
 * I will show the logo of the app
 */
@Composable
fun SplashScreen(navController: NavHostController) {
   Column {
       Text(text ="Splash Screen")
       Button(
           onClick = { navController.navigate(Screen.RegisterScreen.route) }
       ) {
           Text("Register")
       }
   }
}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview() {
    //SplashScreen()
}
