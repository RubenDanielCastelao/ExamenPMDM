import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dam.contador.R
import com.dam.contador.MyViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IU(miViewModel: MyViewModel) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        // Nombre
        if (miViewModel.datos.nom.length in 4..19) {
            Text(
                text = "Nombre: ${miViewModel.datos.nom}!",
                fontSize = 24.sp,
                modifier = Modifier.padding(18.dp)
            )
        }
        OutlinedTextField(
            value = miViewModel.datos.nom,
            onValueChange = {
                miViewModel.updateName(it)
            },
            label = { Text(text = "Name (Max 20 chars)") }
        )

        // Número y Historial
        Text(
            text = "Último número: ${miViewModel.getNum()}\nHistorial de números: ${miViewModel.getLista()}",
            modifier = Modifier.padding(100.dp),
            color = Color.Blue
        )

        // Botón para generar número aleatorio
        Button(
            onClick = {
                miViewModel.funcionRandom()
                Log.d("Tag", "ONCLICK")
            },
            modifier = Modifier.padding(64.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.zazaperfilredondo),
                contentDescription = "Nuevo numero",
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}





