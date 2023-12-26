package com.artemissoftware.rmglossary.presentation.composables.character

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.artemissoftware.rmglossary.ui.theme.Action

@Composable
fun CharacterName(name: String) {
    Text(
        text = name,
        fontSize = 42.sp,
        lineHeight = 42.sp,
        fontWeight = FontWeight.Bold,
        color = Action,
    )
}

@Preview(showBackground = true)
@Composable
private fun CharacterNamePreview() {
    CharacterName(name = "Rick Sanchez")
}
