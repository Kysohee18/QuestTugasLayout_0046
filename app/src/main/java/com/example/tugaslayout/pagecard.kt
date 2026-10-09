package com.example.tugaslayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
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

        CardNama(
            nama = stringResource(R.string.nama2),
            alamat = stringResource(R.string.alamat2),
            warnaBg = R.color.card_1_bg,
            noHp = R.string.nomortelp2
        )
    }
}

@Composable
fun CardNama(
    nama: String,
    alamat: String,
    warnaBg: Color,
    noHp: String,
    modifier: Modifier = Modifier
) {

    Card(modifier = Modifier
        .fillMaxWidth(1f)
        .padding(horizontal = 12.dp, vertical = 5.dp),
        colors = CardDefaults.cardColors(
            containerColor = warnaBg
        )
    ) {
        Row(modifier = Modifier.padding(12.dp)
            .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            val gambar = painterResource(R.drawable.hal)
            Image(painter = gambar, contentDescription = null,
                modifier = Modifier.padding(5.dp)
                    .size(100.dp)
            )
            Spacer(modifier = Modifier.width(20.dp))
            Column() {
                Text(

                )
                Text(

        }
    }

}
