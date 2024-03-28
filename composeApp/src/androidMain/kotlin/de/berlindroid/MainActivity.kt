package de.berlindroid

import App
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import openBrowserDelegate

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        openBrowserDelegate = { url ->
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }
        setContent {
            App()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        openBrowserDelegate = null
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}