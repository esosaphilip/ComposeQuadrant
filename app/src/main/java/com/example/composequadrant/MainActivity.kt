package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                   ComposableQuadrant()
                }
            }
        }
    }
}
@Composable
fun ComposableQuadrant() {
    Column() {
        Row() {
            TextComposable()
            ImageComposable()
        }
        Row() {
            RowComposable()
            ColumnComposable()
        }
    }

}

@Composable
fun TextComposable() {
    Column(modifier = Modifier
        .background(color = Color.Green)
        .fillMaxWidth(0.5f)
        .fillMaxHeight(0.5f)
        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Text(text = "Text composable",modifier = Modifier.padding(16.dp),fontWeight = FontWeight.Bold)
        Text(text = "Displays text and follows Material Design guidelines.")
    }
}

@Composable
fun ImageComposable() {
    Column(modifier = Modifier
        .background(color = Color.Cyan)
        .fillMaxWidth(1f)
        .fillMaxHeight(0.5f)
        .wrapContentWidth(Alignment.End),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(text = "Image composable",modifier = Modifier.padding(16.dp),fontWeight = FontWeight.Bold)
        Text(text = "Creates a composable that lays out and draws a given Painter class object.")
    }

}

@Composable
fun RowComposable() {
    Column(modifier = Modifier
        .background(color = Color.Yellow)
        .fillMaxWidth(0.5f)
        .fillMaxHeight(1f)
        .wrapContentWidth(Alignment.Start),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center ) {
        Text(text = "Row composable",modifier = Modifier.padding(16.dp),fontWeight = FontWeight.Bold)
        Text(text = "A layout composable that places its children in a horizontal sequence.")
    }

}


@Composable
fun ColumnComposable() {
    Column(modifier = Modifier
        .background(color = Color.Gray)
        .fillMaxWidth(1f)
        .fillMaxHeight(1f)
        .wrapContentWidth(Alignment.End),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center ) {
        Text(text = "Column composable",modifier = Modifier.padding(16.dp),fontWeight = FontWeight.Bold)
        Text(text = "A layout composable that places its children in a vertical sequence.")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeQuadrantTheme {
       ComposableQuadrant()
    }
}