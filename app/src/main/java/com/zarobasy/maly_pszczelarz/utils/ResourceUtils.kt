package com.zarobasy.maly_pszczelarz.utils

import android.content.Context
import java.security.AccessControlContext

object ResourceUtils {
    fun getResourceDrawableId(drawableName: String?, context: Context): Int {
        return context.resources.getIdentifier(drawableName, "drawable", context.packageName)
    }
}