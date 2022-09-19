package com.eos.airqualitylayout_permission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// https://www.iqair.com/ko/ -> API key 받기
/*
1. 개인 대시보드
2. 상단 메뉴에서 API 탭 클릭
3. new key
4. Community 로 선택 후, create 하면 완성

Key 복사 후 저장하기

 */
// no action bar
//

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}