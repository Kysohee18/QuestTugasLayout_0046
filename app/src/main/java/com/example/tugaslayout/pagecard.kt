package com.example.tugaslayout

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
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
fun MainNama(
    modifier: Modifier)
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

@Composable
fun CardNama(
    nama: String,
    alamat: String,
    warnaBg: Color,
    noHp: String,
    modifier: Modifier) {

    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 10.dp, vertical = 5.dp)) { }

}
