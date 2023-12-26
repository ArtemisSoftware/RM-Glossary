package com.artemissoftware.rmglossary.presentation.details.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.artemissoftware.rmglossary.R
import com.artemissoftware.rmglossary.domain.models.Character
import com.artemissoftware.rmglossary.presentation.composables.DataInfo

@Composable
fun DetailPanel(
    character: Character,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier) {
        DataInfo(
            title = stringResource(R.string.last_known_location), 
            description = character.location.name,
        )
        DataInfo(
            title = stringResource(R.string.species),
            description = character.species,
        )
        DataInfo(
            title = stringResource(R.string.gender),
            description = character.gender.displayName,
        )
        character.type.takeIf { it.isNotEmpty() }?.let { type ->
            DataInfo(
                title = stringResource(R.string.type),
                description = type,
            )
        }
        DataInfo(
            title = stringResource(R.string.origin),
            description = character.origin.name,
        )
        DataInfo(
            title = stringResource(R.string.episode_count),
            description = character.episodeIds.size.toString(),
        )
    }
}
