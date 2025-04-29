package com.example.business_card_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.business_card_app.ui.theme.BusinessCardAppTheme
import java.nio.file.WatchEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardAppTheme {
                Surface(modifier = Modifier.fillMaxSize()){
                    MainLayout()
                }
            }
        }
    }
}
@Composable
fun MainLayout(){
    val image = painterResource(R.drawable.android_logo)
    Box(modifier = Modifier.background(Color(0xFFd2e8d4)).fillMaxSize(),

       ) {
        Column(
            modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = image,
                contentDescription = "Main image",
                modifier = Modifier.width(width = 128.dp)
                    .height(height = 128.dp).background(Color(0xFF073042)),
            )
            Text(
                text = "Jenifer Doe",
                modifier = Modifier.padding(top = 5.dp),
                fontSize = 64.sp

            )
            Text(
                text = "Android Developer Extraordinaire",
                fontSize = 20.sp,
                color = Color(0xff25634e)

            )
        }
        Column(
            modifier = Modifier.align(Alignment.BottomCenter) ,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row() {
                Icon(
                   Icons.Rounded.Call,
                    contentDescription = null,

                )
                Text(
                    text = "+110 93203 2893829",
                    fontSize = 20.sp,
                    color = Color(0xff25634e)

                )

            }
            Row() {
                Icon(
                    Icons.Rounded.Share,
                    contentDescription = null,

                )
                Text(
                    text = "Android Dev",
                    fontSize = 20.sp,
                    color = Color(0xff25634e)

                )

            }
            Row() {
                Icon(
                    Icons.Rounded.Email,
                    contentDescription = null,

                )
                Text(
                    text = "john.doe@example.com",
                    fontSize = 20.sp,
                    color = Color(0xff25634e)

                )

            }
        }
    }

}
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        MainLayout()
    }
}