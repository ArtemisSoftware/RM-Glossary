package com.artemissoftware.rmglossary.presentation.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.artemissoftware.rmglossary.ui.theme.Action
import com.artemissoftware.rmglossary.ui.theme.TextPrimary

@Composable
fun DataInfo(
    title: String,
    description: String,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier) {
        Text(
            text = title,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Action,
        )
        Text(
            text = description,
            fontSize = 24.sp,
            color = TextPrimary,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DataInfoPreview() {
    DataInfo(
        title = "title",
        description = "description",
        modifier = Modifier.fillMaxWidth(),
    )
}
