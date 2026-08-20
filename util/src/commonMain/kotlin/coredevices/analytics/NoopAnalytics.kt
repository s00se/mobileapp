package coredevices.analytics

/**
 * No-op analytics backend. Use this to completely disable tracking in DI.
 */
object NoopAnalytics : AnalyticsBackend {
    override fun logEvent(name: String, parameters: Map<String, Any>?) {}
    override fun addGlobalProperty(name: String, value: String?) {}
    override fun setEnabled(enabled: Boolean) {}
}
