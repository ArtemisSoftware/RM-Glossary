package com.artemissoftware.rmglossary.presentation.composables

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.artemissoftware.rmglossary.domain.models.Status
import com.artemissoftware.rmglossary.ui.theme.Primary
import com.artemissoftware.rmglossary.ui.theme.RMGlossaryTheme

@Composable
fun CharacterStatus(status: Status) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .border(
                width = 1.dp,
                color = status.toColor(),
                shape = RoundedCornerShape(12.dp),
            )
            .padding(horizontal = 12.dp, vertical = 4.dp),
    ) {
        Text(
            text = "Status: ${status.displayName}",
            fontSize = 20.sp,
            color = Primary,
        )
    }
}

private fun Status.toColor(): Color {
    return when (this) {
        Status.Alive -> Color.Green
        Status.Dead -> Color.Red
        Status.Unknown -> Color.Yellow
    }
}

@Preview(showBackground = true)
@Composable
fun CharacterStatusAlivePreview() {
    RMGlossaryTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            CharacterStatus(status = Status.Alive)
            CharacterStatus(status = Status.Dead)
            CharacterStatus(status = Status.Unknown)
        }
    }
}
