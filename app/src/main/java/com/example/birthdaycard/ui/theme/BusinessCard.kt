package com.example.birthdaycard.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdaycard.R

@Composable
fun BusinessCardApp() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFD2E8D4))
    ) {
        MainElement(
            name = stringResource(R.string.main_name),
            position = stringResource(R.string.main_position),
            modifier = Modifier.align(Alignment.Center)
        )
        InfoElement(
            phone = stringResource(R.string.info_phone),
            share = stringResource(R.string.info_share),
            mail = stringResource(R.string.info_email),
            modifier = Modifier
                .align(Alignment.BottomCenter)
        )
    }
}

@Composable
fun MainElement(
    name: String,
    position: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            Modifier
                .background(Color.Black)
                .size(160.dp)
                .padding(10.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.android_logo),
                contentDescription = "Android Logo"
            )
        }
        Spacer(Modifier.height(12.dp))
        Text(
            text = name,
            textAlign = TextAlign.Center,
            fontSize = 48.sp,
            fontFamily = FontFamily.Serif
        )
        Spacer(Modifier.height(16.dp))
        Text(
            text = position,
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun InfoElement(phone: String, share: String, mail: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 40.dp, top = 16.dp, end = 16.dp, bottom = 40.dp),
        horizontalAlignment = Alignment.Start
    ) {
        InfoRow(Icons.Filled.Phone, "Phone", phone)
        InfoRow(Icons.Filled.Share, "Share", share)
        InfoRow(Icons.Filled.Email, "Email", mail)
    }
}

@Composable
fun InfoRow(icon: ImageVector, desc: String, info: String, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier.width(40.dp),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = desc
            )
        }
        Spacer(Modifier.width(8.dp))
        Text(
            text = info
        )
    }
}

@Preview(showBackground = true, showSystemUi = false)
@Composable
fun MainPreview() {
    BirthdayCardTheme(dynamicColor = true) {
        BusinessCardApp()
    }
}