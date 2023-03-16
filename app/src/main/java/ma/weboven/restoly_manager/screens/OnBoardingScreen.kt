package ma.weboven.restoly_manager.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController

/**
 * In this screen we will show the welcome message to the user
 * I will show the view pager of onbording_1.png, onbording_2.png and  onbording_3.png
 * and the button to go to the next screen
 */
@Composable
fun OnBoardingScreen(navController: NavHostController) {
    Text(text ="Welcome Screen")
}

@Preview(showBackground = true)
@Composable
fun WelcomeScreenPreview() {
    //OnBoardingScreen(navController =null)
}
