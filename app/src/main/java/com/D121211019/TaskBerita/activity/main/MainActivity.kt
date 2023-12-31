package com.D121211019.TaskBerita.activity.main

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.D121211019.TaskBerita.ui.theme.TaskBeritaTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface (
                modifier = Modifier.fillMaxSize() ,
                color = MaterialTheme.colorScheme.background
            ) {
                Scaffold (
                    topBar = {
                        TopAppBar(
                            colors = TopAppBarDefaults.largeTopAppBarColors(
                                containerColor = MaterialTheme.colorScheme.primary,
                                titleContentColor = MaterialTheme.colorScheme.background
                            ),
                            title = { Text(text = "BERITA") },
                            )

                    },
                ) {
                    Column(modifier = Modifier.padding(it)) {

                    }
                }
            }
        }
    }
}

data class Berita(val title:String, val description:String)

@Composable
fun CardBerita(berita: Berita, modifier: Modifier = Modifier){
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 9.dp, horizontal = 18.dp)
        .clickable {
        },
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {
        Column {
            Text(text = berita.title ?: "HAlo Ini berita",
                modifier = Modifier
                    .padding(12.dp),
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontWeight = FontWeight.Bold
                ))
            Text(text = berita.description ?: "Halo ini Pargarf 2",
                modifier = Modifier
                    .padding(16.dp))
        }
    }
}

@Preview
@Composable
fun TaskBeritaTheme(){
    CardBerita(Berita("ini judul", "in isi dari beirta dll"))
}