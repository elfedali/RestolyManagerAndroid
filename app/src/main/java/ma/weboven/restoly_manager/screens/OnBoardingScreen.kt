package ma.weboven.restoly_manager.screens

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import ma.weboven.restoly_manager.R
import ma.weboven.restoly_manager.blocks.AppLogo
import ma.weboven.restoly_manager.blocks.AppTitle
import ma.weboven.restoly_manager.navigation.Screen
import ma.weboven.restoly_manager.ui.theme.RestolyManagerTheme

/**
 * In this screen we will show the welcome message to the user
 * I will show the view pager of onbording_1.png, onbording_2.png and  onbording_3.png
 * and the button to go to the next screen
 */
@OptIn(ExperimentalPagerApi::class)
@Composable
fun OnBoardingScreen(
    navController: NavController
) {
    val onBoardingPages = listOf(
        OnboardingPage(
            title = "Add your restaurant sheet!",
            description = "Add your hours, your types of cuisine, the photos of your restaurant and much more, without fees.",
            imageRes = R.drawable.onboarding_1
        ),
        OnboardingPage(
            title = "We are here to help you",
            description = "The new way to manage your restaurant, we are here to help you",
            imageRes = R.drawable.onboarding_2
        ),
        OnboardingPage(
            title = "More than a restaurant management app, a partner",
            description = "Together we can make your restaurant better, become a partner and get more customers",
            imageRes = R.drawable.onboarding_3
        ),
        OnboardingPage(
            title = "Make your restaurant better, get more customers",
            description = "Get more customers and make more money, we are here to help you",
            imageRes = R.drawable.onboarding_2
        )
    )

    val pagerState = rememberPagerState()
    Surface(
        color = MaterialTheme.colors.background,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            Spacer(modifier = Modifier.height(16.dp))
            AppLogo()
            Spacer(modifier = Modifier.height(16.dp))
            HorizontalPager(
                state = pagerState,
                modifier = Modifier.weight(5f),
                count = onBoardingPages.size,
                itemSpacing = 0.dp,
            ) { page ->
                OnboardingPageView(onboardingPage = onBoardingPages[page])
            }
            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {
                    // Got to login screen
                    navController.navigate(Screen.LoginScreen.route)
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .height(50.dp)
            ) {
                Text(text = "Get Started")
            }
           Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
fun OnboardingPageView(onboardingPage: OnboardingPage) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {

        Image(
            painter = painterResource(id = onboardingPage.imageRes),
            contentDescription = null,
            modifier = Modifier
                .width(200.dp)
                .height(200.dp)
        )
        // TODO: add indicator

        Column (
            modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
                ){
            AppTitle(title = onboardingPage.title, modifier = Modifier.padding(top = 20.dp))

            Text(
                text = onboardingPage.description,
                style = MaterialTheme.typography.body1,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(vertical = 8.dp)
            )
        }
    }
}

data class OnboardingPage(
    val title: String,
    val description: String,
    @DrawableRes val imageRes: Int
)


@Preview(showBackground = true)
@Composable
fun OnBoardingScreenPreview2() {
    RestolyManagerTheme {
        OnBoardingScreen(
            navController = NavController(LocalContext.current)
        )
    }
}