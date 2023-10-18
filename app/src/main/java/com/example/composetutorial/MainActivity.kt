package com.example.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

//import androidx.compose.material3.MaterialTheme

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.composetutorial.ui.theme.ComposeTutorialTheme
import androidx.compose.foundation.border
import androidx.compose.material3.MaterialTheme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialTheme {
                Surface (modifier = Modifier.fillMaxSize()){
                    MessageCard(Message("Android", "Jetpack Compose"))

                }
            }
        }
    }
}

data class Message(val author: String, val body: String)

@Composable
fun MessageCard(msg: Message) {
    Row (modifier = Modifier.padding(all=8.dp)){
        Image(painter = painterResource(R.drawable.icecream), contentDescription = "contact profile picture", modifier= Modifier
            .size(40.dp)
            .clip(
                CircleShape
            ).border(1.5.dp, MaterialTheme.colorScheme.primary, CircleShape)
        )

    Spacer(modifier = Modifier.width(8.dp))

    Column {
        Text(msg.author, color=MaterialTheme.colorScheme.secondary)
        Spacer(modifier = Modifier.height(4.dp))
        Text(msg.body)
    }}

}

@Preview
@Composable
fun MessageCardPreview() {
    ComposeTutorialTheme {
        Surface (modifier = Modifier.fillMaxSize()) {
            MessageCard(Message("Lexi", "Hey, take a look at Jetpack compose, it is great!"))
        }}
}