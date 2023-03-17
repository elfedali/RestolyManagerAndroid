package ma.weboven.restoly_manager.screens

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.delay
import ma.weboven.restoly_manager.blocks.AppLogo
import ma.weboven.restoly_manager.ui.theme.RestolyManagerTheme

/**
 * In this screen we will show the splash screen to the user
 * I will show the logo of the app
 */
@Composable
fun SplashScreen(onComplete: () -> Unit = { }) {

    LaunchedEffect(true) {
        delay(2000) // Delay for 2 seconds
        onComplete() // Call the onComplete function to move on to the rest of the app
    }

   Surface {
       Column(
           modifier = Modifier.fillMaxSize(),
           verticalArrangement = Arrangement.Center,
           horizontalAlignment = Alignment.CenterHorizontally
       ) {
           AppLogo(
               fontSize = 50
           )
       }
   }
}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview() {
    SplashScreen(

    )
}


@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, name = "Dark Mode")
@Composable
fun SplashScreenViewDark() {
    RestolyManagerTheme(
        darkTheme = true
    ) { SplashScreen() }
}

