package ma.weboven.restoly_manager.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController

/**
 * In this screen we will show the forgot password form to the user
 * I will show the form of the user to reset his password
 */
@Composable
fun ForgotPasswordScreen(navController: NavHostController) {
    Text(text ="Forgot Password Screen")
}

@Preview(showBackground = true)
@Composable
fun ForgotPasswordPreview() {
   // ForgotPassword()
}
