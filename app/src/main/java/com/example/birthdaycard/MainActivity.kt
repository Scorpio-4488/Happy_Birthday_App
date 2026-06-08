package com.example.birthdaycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.birthdaycard.ui.theme.BirthdayCardTheme
import com.example.birthdaycard.ui.theme.TutorialScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BirthdayCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TutorialScreen(
                        title = stringResource(R.string.tutorial_heading),
                        para1 = stringResource(R.string.tutorial_para_one),
                        para2 = stringResource(R.string.tutorial_para_two),
                        modifier = Modifier
                    )
                }
            }
        }
    }
}