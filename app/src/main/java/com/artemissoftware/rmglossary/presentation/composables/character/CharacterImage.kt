package com.artemissoftware.rmglossary.presentation.composables.character

import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import coil.compose.SubcomposeAsyncImage
import com.artemissoftware.rmglossary.presentation.composables.LoadingState

@Composable
fun CharacterImage(imageUrl: String, modifier: Modifier = defaultModifier) {
    SubcomposeAsyncImage(
        model = imageUrl,
        contentDescription = "Character image",
        modifier = modifier,
        loading = { LoadingState() },
    )
}

private val defaultModifier = Modifier
    .fillMaxWidth()
    .aspectRatio(1f)
    .clip(RoundedCornerShape(12.dp))
