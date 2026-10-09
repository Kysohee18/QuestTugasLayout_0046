package com.example.tugaslayout

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CardNama(

)
{
    Column(modifier = Modifier
        .padding(top = 100.dp)
        .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(
            text = stringResource(R.string.prodi),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.univ),
            fontSize = 19.sp,
        )
        Spacer(modifier = Modifier.padding(30.dp))

    }
}