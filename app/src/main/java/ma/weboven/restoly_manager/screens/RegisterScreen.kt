package ma.weboven.restoly_manager.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController

/**
 * In this screen we will show the register form to the user
 * I will show the form of the user to register
 */
@Composable
fun RegisterScreen(navController: NavHostController) {
    Text(text ="Register Screen")
}

@Preview(showBackground = true)
@Composable
fun RegisterScreenPreview() {
    //RegisterScreen()
}

