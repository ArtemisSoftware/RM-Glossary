package com.artemissoftware.rmglossary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.artemissoftware.rmglossary.data.remote.dto.CharacterDto
import com.artemissoftware.rmglossary.data.remote.service.KtorClient
import com.artemissoftware.rmglossary.domain.models.Character
import com.artemissoftware.rmglossary.ui.theme.RMGlossaryTheme

class MainActivity : ComponentActivity() {

    private val ktorClient = KtorClient()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var character by remember {
                mutableStateOf<Character?>(null)
            }
            
            val scope = rememberCoroutineScope()
            
            LaunchedEffect(key1 = Unit, block = {
                character = ktorClient.getCharacter(1)
            })

            RMGlossaryTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    Greeting(character?.name ?: "Nothing so far")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier,
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RMGlossaryTheme {
        Greeting("Android")
    }
}
