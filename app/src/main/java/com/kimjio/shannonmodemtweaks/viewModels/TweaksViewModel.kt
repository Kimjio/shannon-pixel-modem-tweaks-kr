package com.kimjio.shannonmodemtweaks.viewModels

import androidx.compose.runtime.mutableStateMapOf
import androidx.lifecycle.ViewModel
import com.kimjio.shannonmodemtweaks.tweaks.Tweak

class TweaksViewModel : ViewModel() {
    val tweaksState = mutableStateMapOf<Tweak, Boolean?>()
}