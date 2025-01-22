package yukams.app.background_locator_2

class Keys {
    companion object {
        @JvmStatic
        val SHARED_PREFERENCES_KEY:String = "SHARED_PREFERENCES_KEY"

        @JvmStatic
        val CALLBACK_DISPATCHER_HANDLE_KEY:String = "CALLBACK_DISPATCHER_HANDLE_KEY"

        @JvmStatic
        val CALLBACK_HANDLE_KEY:String = "CALLBACK_HANDLE_KEY"

        @JvmStatic
        val NOTIFICATION_CALLBACK_HANDLE_KEY:String = "NOTIFICATION_CALLBACK_HANDLE_KEY"

        @JvmStatic
        val INIT_CALLBACK_HANDLE_KEY:String = "INIT_CALLBACK_HANDLE_KEY"

        @JvmStatic
        val INIT_DATA_CALLBACK_KEY:String = "INIT_DATA_CALLBACK_KEY"

        @JvmStatic
        val DISPOSE_CALLBACK_HANDLE_KEY:String = "DISPOSE_CALLBACK_HANDLE_KEY"

        @JvmStatic
        val CHANNEL_ID:String = "app.yukams/locator_plugin"

        @JvmStatic
        val BACKGROUND_CHANNEL_ID:String = "app.yukams/locator_plugin_background"

        @JvmStatic
        val METHOD_SERVICE_INITIALIZED:String = "LocatorService.initialized"

        @JvmStatic
        val METHOD_PLUGIN_INITIALIZE_SERVICE:String = "LocatorPlugin.initializeService"

        @JvmStatic
        val METHOD_PLUGIN_REGISTER_LOCATION_UPDATE:String = "LocatorPlugin.registerLocationUpdate"

        @JvmStatic
        val METHOD_PLUGIN_UN_REGISTER_LOCATION_UPDATE:String = "LocatorPlugin.unRegisterLocationUpdate"

        @JvmStatic
        val METHOD_PLUGIN_IS_REGISTER_LOCATION_UPDATE:String = "LocatorPlugin.isRegisterLocationUpdate"

        @JvmStatic
        val METHOD_PLUGIN_IS_SERVICE_RUNNING:String = "LocatorPlugin.isServiceRunning"

        @JvmStatic
        val METHOD_PLUGIN_UPDATE_NOTIFICATION:String = "LocatorPlugin.updateNotification"

        @JvmStatic
        val ARG_INIT_CALLBACK:String = "initCallback"

        @JvmStatic
        val ARG_INIT_DATA_CALLBACK:String = "initDataCallback"

        @JvmStatic
        val ARG_DISPOSE_CALLBACK:String = "disposeCallback"

        @JvmStatic
        val ARG_IS_MOCKED:String = "is_mocked"

        @JvmStatic
        val ARG_LATITUDE:String = "latitude"

        @JvmStatic
        val ARG_LONGITUDE:String = "longitude"

        @JvmStatic
        val ARG_ACCURACY:String = "accuracy"

        @JvmStatic
        val ARG_ALTITUDE:String = "altitude"

        @JvmStatic
        val ARG_SPEED:String = "speed"

        @JvmStatic
        val ARG_SPEED_ACCURACY:String = "speed_accuracy"

        @JvmStatic
        val ARG_HEADING:String = "heading"

        @JvmStatic
        val ARG_TIME:String = "time"

        @JvmStatic
        val ARG_PROVIDER:String = "provider"

        @JvmStatic
        val ARG_CALLBACK:String = "callback"

        @JvmStatic
        val ARG_NOTIFICATION_CALLBACK:String = "notificationCallback"

        @JvmStatic
        val ARG_LOCATION:String = "location"

        @JvmStatic
        val ARG_SETTINGS:String = "settings"

        @JvmStatic
        val ARG_CALLBACK_DISPATCHER:String = "callbackDispatcher"


        @JvmStatic
        val SETTINGS_ACCURACY = "settings_accuracy"

        @JvmStatic
        val SETTINGS_INTERVAL = "settings_interval"

        @JvmStatic
        val SETTINGS_DISTANCE_FILTER = "settings_distanceFilter"

        @JvmStatic
        val SETTINGS_ANDROID_NOTIFICATION_CHANNEL_NAME = "settings_android_notificationChannelName"

        @JvmStatic
        val SETTINGS_ANDROID_NOTIFICATION_TITLE = "settings_android_notificationTitle"

        @JvmStatic
        val SETTINGS_ANDROID_NOTIFICATION_MSG = "settings_android_notificationMsg"

        @JvmStatic
        val SETTINGS_ANDROID_NOTIFICATION_BIG_MSG = "settings_android_notificationBigMsg"

        @JvmStatic
        val SETTINGS_ANDROID_NOTIFICATION_ICON = "settings_android_notificationIcon"

        @JvmStatic
        val SETTINGS_ANDROID_NOTIFICATION_ICON_COLOR = "settings_android_notificationIconColor"

        @JvmStatic
        val SETTINGS_ANDROID_WAKE_LOCK_TIME = "settings_android_wakeLockTime"

        @JvmStatic
        val SETTINGS_ANDROID_LOCATION_CLIENT = "settings_android_location_client"

        @JvmStatic
        val SETTINGS_INIT_PLUGGABLE = "settings_init_pluggable"

        @JvmStatic
        val SETTINGS_DISPOSABLE_PLUGGABLE = "settings_disposable_pluggable"

        @JvmStatic
        val BCM_SEND_LOCATION = "BCM_SEND_LOCATION"

        @JvmStatic
        val BCM_NOTIFICATION_CLICK = "BCM_NOTIFICATION_CLICK"

        @JvmStatic
        val BCM_INIT = "BCM_INIT"

        @JvmStatic
        val BCM_DISPOSE = "BCM_DISPOSE"

        @JvmStatic
        val NOTIFICATION_ACTION = "yukams.app.background_locator_2.notification"
    }
}