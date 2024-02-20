package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade.ui.theme.LemonadeTheme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonadeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeNameCard()
                    ComposeFooterCard()

                }
            }
        }
    }
}
@Composable
fun ComposeNameCard() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        NameCard(
            imagePainter = painterResource(R.drawable.android_logo),
            title = stringResource(R.string.title),
            description = stringResource(R.string.description_title)
        )
    }

}
@Composable
fun ComposeFooterCard() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 180.dp)

    ) {
        FooterCard(
            imagePainter = painterResource(R.drawable.baseline_phone_24),
            description = stringResource(R.string.phone)
        )
        FooterCard(
            imagePainter = painterResource(R.drawable.baseline_mail_24),
            description = stringResource(R.string.mail)
        )
        FooterCard(
            imagePainter = painterResource(R.drawable.baseline_link_24),
            description = stringResource(R.string.link)
        )
    }

}
@Composable
private fun FooterCard(
    imagePainter: Painter,
    description: String
) {
    Row() {
        Image(
            painter = imagePainter,
            contentDescription = null
        )
        Text(
            text = description
        )
    }



}
@Composable
private fun NameCard(
    imagePainter: Painter,
    title: String,
    description: String
) {
    Image(
        painter = imagePainter,
        contentDescription = null,
        modifier = Modifier
            .width(160.dp)
            .height(160.dp)
            .background(Color(0xFF32678f))
    )
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = title,
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold
    )
    Text(
        text = description
    )

}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LemonadeTheme {
        ComposeNameCard()
        ComposeFooterCard()

    }
}