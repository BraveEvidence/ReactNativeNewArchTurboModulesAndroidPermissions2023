package com.rtnmypermissions

import android.Manifest
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts.RequestPermission
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.facebook.react.bridge.ReactApplicationContext
import com.rtnmypermissions.NativeMyPermissionsSpec


class MyPermissionsModule(val context: ReactApplicationContext?): NativeMyPermissionsSpec(context) {

    private val REQUEST_CODE_PERMISSIONS = 10
    private val REQUIRED_PERMISSIONS = mutableListOf(Manifest.permission.CAMERA).toTypedArray()

    override fun getName(): String {
        return NAME
    }

    override fun askForCameraPermission(): Boolean {
        ActivityCompat.requestPermissions(
            context?.currentActivity!!,
            REQUIRED_PERMISSIONS,
            REQUEST_CODE_PERMISSIONS
        )

//        (context?.currentActivity as AppCompatActivity).activityResultRegistry.register(
//            "Arbitrary string",
//            RequestPermission()
//        ) { result: Boolean ->
//            Log.i("hello","Result is $result")
//        }

        return true
    }

    companion object {
        const val NAME = "RTNMyPermissions"
    }







}