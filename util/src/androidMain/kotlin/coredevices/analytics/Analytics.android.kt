package coredevices.analytics

import PlatformContext
import coredevices.util.CommonBuildKonfig

fun createAndroidAnalytics(platformContext: PlatformContext): AnalyticsBackend {
    // Analytics disabled on Android; return the no-op backend.
    return NoopAnalytics
}

class AndroidAnalyticsBackend(
    private val mixpanel: Any? = null,
) : AnalyticsBackend {
    override fun logEvent(
        name: String,
        parameters: Map<String, Any>?,
    ) {
        // no-op
    }

    override fun addGlobalProperty(name: String, value: String?) {
        // no-op
    }

    override fun setEnabled(enabled: Boolean) {
        // no-op
    }
}
