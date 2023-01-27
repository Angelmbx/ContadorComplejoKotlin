package com.example.contadorcomplejokotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.contadorcomplejokotlin.ui.theme.ContadorComplejoKotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Appview()

        }
    }
}


const val startCountDefault = 0

@Preview(showBackground = true)
@Composable
fun Appview() {

    var contador1 by rememberSaveable { mutableStateOf(0) }



/*    var contador2=
    var incremento1=
    var incremento2=*/


    Column(
        Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
    ) {

        Column() {
            Row() {
                Button(
                    onClick = { /*TODO*/ }) {
                    Text("Contador 1 ($incremento1)")

                }
            }
            Row() {
                Text(text = "Incremento:")
                Text(text = "$incremento1")

            }
        }

        Column() {
            Row() {
                Button(onClick = { /*TODO*/ }) {
                   // Text("Contador 2 ($incremento2) ")
                }

            }
            Row() {
                Text(text = "Incremento:")
            //    Text(text = "$incremento2")
            }

        }

    }


}

fun Button(
    onClick: Unit
) {

}
