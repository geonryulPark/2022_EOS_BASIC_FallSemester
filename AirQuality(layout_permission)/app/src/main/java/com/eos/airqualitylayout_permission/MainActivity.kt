package com.eos.airqualitylayout_permission

import android.Manifest
import android.content.Intent
import android.location.LocationManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.ActivityResultLauncher
import com.eos.airqualitylayout_permission.databinding.ActivityMainBinding

// https://www.iqair.com/ko/ -> API key 받기


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    // 런타임 권한 요청 시 필요한 요청 코드
    private val PERMISSION_REQUEST_CODE = 100
    // 요청할 권한 목록
    var REQUIRED_PERMISSION = arrayOf(
        Manifest.permission.ACCESS_FINE_LOCATION,
        Manifest.permission.ACCESS_COARSE_LOCATION
    )

    // 위치 서비스 요청 시 필요한 런처
    lateinit var getGPSPermissionLauncher: ActivityResultLauncher<Intent>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        checkAllPermission()
    }

    private fun checkAllPermission() {
        if (!isLocationServiceAvailable()) {
            // GPS가 켜져있지 않은 경우
            showDialogForLocationServiceSetting()
        } else {
            // GPS가 켜져있는 경우
            isRuntimePermissionGranted()
        }
    }

    private fun showDialogForLocationServiceSetting() {
        // 먼저 ActivityResultLauncher 를 설정해줍니다.
        // 이 런처를 이용하여 결과값을 반환해야 하는 Intent 를 실행할 수 있습니다.
        TODO("Not yet implemented")
    }

    private fun isRuntimePermissionGranted() {
        // 위치 퍼미션을 가지고 있는지 체크
        TODO("Not yet implemented")
    }

    private fun isLocationServiceAvailable(): Boolean {
        val locationManager = getSystemService(LOCATION_SERVICE) as LocationManager

        return (locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)
                || locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER))

    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }
}