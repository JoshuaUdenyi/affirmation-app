package com.udenyijoshua.affirmation_app.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Data(
    @StringRes val postDate: Int,
    @StringRes val title: Int,
    @StringRes val details: Int,
    @DrawableRes val imageId: Int
)
