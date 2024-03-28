import kotlinx.browser.window

actual fun openBrowser(url: String) {
    window.open(url)
}