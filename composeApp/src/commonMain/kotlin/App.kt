import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

val links = listOf(
    "Meetup" to "https://www.meetup.com/berlindroid/",
    "Twitter" to "https://twitter.com/Berlindroid/",
    "Threads" to "https://www.threads.net/@berlindroid/",
    "Mastodon @androidsocial.dev" to "https://androiddev.social/@berlindroid",
    "Bluesky" to "https://bsky.app/profile/berlindroid.bsky.social",
)

@Composable
fun App() {
    // TODO logo
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically),
    ) {
        links.forEach { (name, url) -> Link(text = name, url = url) }
    }
}

@Composable
fun Link(
    modifier: Modifier = Modifier,
    text: String,
    url: String,
) {
    Box(
        modifier = modifier
            .widthIn(min = 256.dp)
            .clickable { openBrowser(url) }
            .border(
                width = 2.dp,
                color = Color.Black,
            )
            .padding(vertical = 16.dp),
        contentAlignment = Alignment.Center,
    ) {
        BasicText(text)
    }
}
