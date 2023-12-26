package com.artemissoftware.rmglossary.presentation.composables.character

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.artemissoftware.rmglossary.domain.models.Status

@Composable
fun CharacterHeader(
    name: String,
    status: Status,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier) {
        CharacterStatus(status = status)
        CharacterName(name = name)
    }
}

@Preview(showBackground = true)
@Composable
private fun CharacterHeaderPreview() {
    CharacterHeader(name = "Rick Sanchez", status = Status.Alive)
}
