package com.kimjio.shannonmodemtweaks.saveable

import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.saveable.listSaver
import androidx.compose.runtime.snapshots.SnapshotStateMap

@Suppress("UNCHECKED_CAST")
fun <K : Any, V : Any?> snapshotStateMapSaver() = listSaver<SnapshotStateMap<K, V>, List<Any?>>(
    save = { stateMap ->
        stateMap.toList().map {
            mutableListOf<Any?>().apply {
                add(it.first)
                add(it.second)
            }
        }
    },
    restore = { list ->
        val map = mutableStateMapOf<K, V>()

        list.map {
            check(it.size.rem(2) == 0) { "non-zero remainder" }
            var index = 0
            while (index < it.size) {
                val key = it[index] as K
                val value = it[index + 1] as V
                map[key] = value
                index += 2
            }
        }

        map
    },
)