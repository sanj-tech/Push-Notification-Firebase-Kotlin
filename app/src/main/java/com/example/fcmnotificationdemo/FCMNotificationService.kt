package com.example.fcmnotificationdemo

import android.content.Context
import android.util.Log
import android.widget.RemoteViews
import androidx.test.core.app.ApplicationProvider
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class FCMNotificationService:FirebaseMessagingService() {


    override fun onNewToken(token: String) {
        super.onNewToken(token)
         Log.e("token","Token")
    }


    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)

         Log.e("msg","received")


    }
}