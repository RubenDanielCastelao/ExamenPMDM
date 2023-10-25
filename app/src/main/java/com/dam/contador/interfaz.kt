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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dam.contador.DataClasses
import com.dam.contador.R
import com.dam.contador.MyViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IU(miViewModel: MyViewModel) {
    val appData = remember { mutableStateOf(DataClasses.Datos()) }

    Column {
        if (appData.value.nom.length > 3) {
            Text(
                text = "Name: ${appData.value.nom}!",
                fontSize = 24.sp,
                modifier = Modifier.padding(18.dp)
            )
        }
        OutlinedTextField(
            value = appData.value.nom,
            onValueChange = { newName ->
                miViewModel.updateName(newName)
                appData.value = appData.value.copy(nom = newName)
            },
            label = { Text(text = "Name") }
        )


        // Número y Historial
        Text(
            text = "Random number: ${appData.value.num}\nNumber list: ${miViewModel.getLista()}",
            modifier = Modifier.padding(100.dp),
            color = Color.DarkGray
        )
        Button(
            onClick = {
                miViewModel.funcionRandom()
                appData.value = appData.value.copy(num = miViewModel.getNum())
            },
            modifier = Modifier.padding(64.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.zazaperfilredondo),
                contentDescription = "Generate numbers",
                Modifier.padding(8.dp)
            )
        }
    }

}




