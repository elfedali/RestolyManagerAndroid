package ma.weboven.restoly_manager.blocks

import android.content.res.Configuration
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ma.weboven.restoly_manager.R
import ma.weboven.restoly_manager.ui.theme.RestolyManagerTheme

@Composable
fun AppLogo(
    fontSize: Int = 30,
) {
    Text(
        text = stringResource(id = R.string.app_name),
        modifier = Modifier.padding(16.dp),
        fontFamily = FontFamily(Font(R.font.abhaya_libre_bold)),
        fontSize = fontSize.sp,
        color = MaterialTheme.colors.onBackground

    )
}

@Preview
@Composable
fun AppLogoPreview() {
    AppLogo()
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES,  name = "Dark Mode")
@Composable
fun AppLogoDarkPreview() {
    RestolyManagerTheme(
        darkTheme = true
    ) {
        AppLogo()
    }
}
