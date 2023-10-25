import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dam.contador.R
import com.dam.contador.MyViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IU(miViewModel: MyViewModel) {


    Column {
        Text(
            text = "RONDA",
            fontSize = 24.sp,
            modifier = Modifier.align(Alignment.End)
        )
        Modifier.padding(18.dp)
        if(miViewModel.ronda > 9) {
            Text(
                text = miViewModel.ronda.toString(),
                fontSize = 36.sp,
                modifier = Modifier.align(Alignment.End)
            )
        }else{
            Text(
                text = miViewModel.ronda.toString(),
                fontSize = 24.sp,
                modifier = Modifier.align(Alignment.End)
            )
        }
        Row {
            Button(
                onClick = { Log.d("Tag", "Boton rojo") },
                modifier = Modifier
                    .size(64.dp)
                    .background(Color.Blue)
                    .padding(64.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.White
                )
            ) {

            }

            Button(
                onClick = { Log.d("Tag", "Boton rojo") },
                modifier = Modifier
                    .size(64.dp)
                    .background(Color.Green)
                    .padding(64.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.White
                )
            ) {
            }
        }
        Row {
            Button(
                onClick = { Log.d("Tag", "Boton rojo") },
                modifier = Modifier
                    .size(64.dp)
                    .background(Color.Red)
                    .padding(64.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.White
                )
            ) {
            }

            Button(
                onClick = { Log.d("Tag", "Boton rojo") },
                modifier = Modifier
                    .size(64.dp)
                    .background(Color.Yellow)
                    .padding(64.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.White
                )
            ) {
            }
        }
        Row {
            Button(onClick = { miViewModel.startEstado = "RESET" },
                modifier = Modifier.padding(50.dp)) {
                    Text(text = miViewModel.startEstado)
            }

            Button(
                onClick = {
                    miViewModel.sumarRonda()
                    Log.d("Tag", "Sumar Ronda")
                },
                modifier = Modifier.padding(64.dp)

            )
            {
                Image(
                    painter = painterResource(id = R.drawable.baseline_play_arrow_24),

                    contentDescription = "Nuevo numero",
                    Modifier.padding(8.dp)

                )
            }
        }

    }

}





/*
        Button(
            onClick = {
               miViewModel.funcionRandom()
                Log.d("Tag", "ONCLICK")
            },
            modifier = Modifier.padding(64.dp)

        )
        {
            Image(
                painter = painterResource(id = R.drawable.zazaperfilredondo),

                contentDescription = "Nuevo numero",
                Modifier.padding(8.dp)

            )
        }
 */
















