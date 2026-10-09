package com.example.tugaslayout

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ActivitasPertama(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 24.dp, bottom = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(R.string.prodi),
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = stringResource(R.string.univ),
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium
            )

            Spacer(modifier = Modifier.padding(bottom = 16.dp))

            CardNama(
                nama = stringResource(R.string.nama),
                alamat = stringResource(R.string.alamat),
                warnaBg= R.color.card_0_bg,
            )

            CardNama(
                nama = stringResource(R.string.nama2),
                noHp = stringResource(R.string.nomortelp2),
                alamat = stringResource(R.string.alamat2),
                warnaBg = R.color.card_1_bg
            )

            CardNama(
                nama = stringResource(R.string.nama3),
                noHp = stringResource(R.string.nomortelp3),
                alamat = stringResource(R.string.alamat3),
                warnaBg = R.color.card_2_bg
            )

            CardNama(
                nama = stringResource(R.string.nama4),
                noHp = stringResource(R.string.nomortelp4),
                alamat = stringResource(R.string.alamat4),
                warnaBg = R.color.card_3_bg,
            )
        }
    }
    Box(modifier = Modifier
        .fillMaxSize()
    ) {
        Text(
            stringResource(R.string.copy),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 50.dp)
        )
    }
}

