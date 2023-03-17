package ma.weboven.restoly_manager.blocks


import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import ma.weboven.restoly_manager.R

@Composable
fun AppTitle(
    title: String,
    modifier: Modifier = Modifier,
    textAlign: TextAlign = TextAlign.Center
) {
    Text(
        text = title, modifier = modifier,
        style = MaterialTheme.typography.h6,
        color = MaterialTheme.colors.onBackground,
        fontFamily = FontFamily(Font(R.font.manrope_semibold, FontWeight.SemiBold)),
        textAlign = textAlign
    )
}