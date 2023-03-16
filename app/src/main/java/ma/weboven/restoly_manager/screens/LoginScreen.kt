package ma.weboven.restoly_manager.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController

@Composable
fun LoginScreen(navController: NavHostController) {
    Text(text = "Login Screen")
}


@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    //LoginScreen(navController = null)
}