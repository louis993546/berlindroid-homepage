actual fun openBrowser(url: String) {
    openBrowserDelegate?.invoke(url)
}

/**
 * Android needs additional param to open browser, so this delegates that to someone else
 */
var openBrowserDelegate: ((String) -> Unit)? = null