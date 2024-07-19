package com.example.recipe_app_api

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.recipe_app_api.ui.theme.Recipe_App_apiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Recipe_App_apiTheme {
                RecipeScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Recipe_App_apiTheme {
        RecipeScreen()
    }
}