package com.example.tugaslayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CardNama(
    nama: String,
    alamat: String,
    gambar: Int = R.drawable.hal,
    warnaBg: Int,
    noHp: String = " ",
    modifier: Modifier = Modifier
) {

    Card(
        modifier = modifier
            .fillMaxWidth(1f)
            .padding(horizontal = 12.dp, vertical = 5.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = warnaBg)
        )
    ) {
        Row(
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.hal),
                contentDescription = null,
                modifier = Modifier
                    .padding(1.dp)
                    .size(78.dp)
            )
            Spacer(modifier = Modifier.width(20.dp))
            Column() {
                Text(
                    text = nama,
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(id = R.color.text_color),
                )

                Text(
                    text = noHp,
                    fontSize = 16.sp,
                    color = colorResource(id = R.color.teal_200),
                )

                Text(
                    text = alamat,
                    fontSize = 16.sp,
                    color = colorResource(id = R.color.text_color),
                )

            }
            Spacer(modifier = Modifier.width(25.dp))
            Image(
                painter = painterResource(id = R.drawable.hal),
                contentDescription = null,
                modifier = Modifier
                    .padding(1.dp)
                    .size(78.dp)
            )



        }
    }

}
