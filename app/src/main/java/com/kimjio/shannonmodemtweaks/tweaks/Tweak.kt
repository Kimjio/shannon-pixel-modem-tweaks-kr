package com.kimjio.shannonmodemtweaks.tweaks

abstract class Tweak {
    abstract val type: TweakType
    abstract val name: String
    abstract val nameResId: Int
    abstract val descriptionResId: Int
    abstract val canBeDisabled: Boolean

    abstract suspend fun isTweakEnabled(
        isReload: Boolean = false,
        onProgress: (Int, Int) -> Unit = { _, _ -> },
    ): Boolean

    abstract fun applyTweak(): Pair<Boolean, String>
}

enum class TweakType {
    NVITEM,
}
